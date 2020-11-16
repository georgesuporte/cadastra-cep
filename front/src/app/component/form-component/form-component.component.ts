import { Component, OnInit } from '@angular/core';
import { DataResponse } from '@app/interface/data.interface';
import { ResponseInterface } from '@app/interface/response.interfaces';
import { CepService } from 'src/app/service/cep.service';

@Component({
  selector: 'app-form-component',
  templateUrl: './form-component.component.html',
  styleUrls: ['./form-component.component.scss']
})
export class FormComponentComponent implements OnInit {

  responseInterface: ResponseInterface;
  listCep: any;

  constructor(private cepService: CepService) { }

  ngOnInit() {

  }

  consultaCep(event: any) {
    this.cepService.findCep(event.target.value).subscribe((res: DataResponse<ResponseInterface>): void => {
      res.data.forEach((value): void => {
        this.responseInterface = value;
      });
    });
  }
}
