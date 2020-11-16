import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-localidade',
  templateUrl: './localidade.component.html',
  styleUrls: ['./localidade.component.scss']
})
export class LocalidadeComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
