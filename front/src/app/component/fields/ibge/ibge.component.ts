import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-ibge',
  templateUrl: './ibge.component.html',
  styleUrls: ['./ibge.component.scss']
})
export class IbgeComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
