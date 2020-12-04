import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DataResponse } from '@app/interface/data.interface';
import { FieldConfig } from '@app/interface/field.interface';
import { ResponseInterface } from '@app/interface/response.interfaces';
import { CepService } from 'src/app/service/cep.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {
  @Input() fields: FieldConfig[] = [];

  @Output() submit: EventEmitter<any> = new EventEmitter<any>();

  form: FormGroup;

  responseInterface: ResponseInterface;
  listCep: any;

  constructor(private cepService: CepService, private fb: FormBuilder) { }

  ngOnInit() {
    this.form = this.createControl();
  }

  // createForm(cep: Cep): void {
  //   this.formCep = this.fb.group({
  //     cep: [cep.cep],
  //     localidade: [cep.localidade],
  //     logradouro: [cep.logradouro],
  //     complemento: [cep.complemento],
  //     bairro: [cep.bairro],
  //     uf: [cep.uf],
  //     ddd: [cep.ddd],
  //     gia: [cep.gia],
  //     ibge: [cep.ibge],
  //     siafi: [cep.siafi],
  //   });
  // }

  get value() {
    return this.form.value;
  }

  consultaCep(event: any) {
    this.cepService.findCep(event.target.value).subscribe((res: DataResponse<ResponseInterface>): void => {
      res.data.forEach((value): void => {
        this.responseInterface = value;
      });
    });
  }

  onSubmit(event: Event) {
    console.log(this.form.value);
    console.log('aquii');
    this.cepService.saveCep();
  }

  createControl() {
    const group = this.fb.group({});
    this.fields.forEach(field => {
      if (field.type === "button") return;
      const control = this.fb.control(
        field.value,
        this.bindValidations(field.validations || [])
      );
      group.addControl(field.name, control);
    });
    return group;
  }

  bindValidations(validations: any) {
    if (validations.length > 0) {
      const validList = [];
      validations.forEach(valid => {
        validList.push(valid.validator);
      });
      return Validators.compose(validList);
    }
    return null;
  }
}
