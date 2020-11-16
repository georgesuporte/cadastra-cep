import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-logradouro',
  templateUrl: './logradouro.component.html',
  styleUrls: ['./logradouro.component.scss']
})
export class LogradouroComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
