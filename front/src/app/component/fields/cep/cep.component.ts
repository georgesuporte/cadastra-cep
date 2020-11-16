import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { DataResponse } from '@app/interface/data.interface';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-cep',
  templateUrl: './cep.component.html',
  styleUrls: ['./cep.component.scss']
})
export class CepComponent implements OnInit {

  @Input() items: ResponseInterface;

  @Output() cep: EventEmitter<string> = new EventEmitter<string>();

  constructor() { }


  ngOnInit() {
  }

  setElement(cep: string) {
    this.cep.emit(cep);
  }

}
