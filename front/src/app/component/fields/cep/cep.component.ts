import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FieldConfig } from '@app/interface/field.interface';
import { ResponseInterface } from '@app/interface/response.interfaces';
@Component({
  selector: 'app-cep',
  templateUrl: './cep.component.html',
  styleUrls: ['./cep.component.scss']
})
export class CepComponent implements OnInit {

  @Input() items: ResponseInterface;

  @Output() cep: EventEmitter<string> = new EventEmitter<string>();

  field: FieldConfig;
  group: FormGroup;
  constructor() { }


  ngOnInit() {
  }

  setElement(cep: string) {
    this.cep.emit(cep);
  }

}
