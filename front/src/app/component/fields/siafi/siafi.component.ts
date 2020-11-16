import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-siafi',
  templateUrl: './siafi.component.html',
  styleUrls: ['./siafi.component.scss']
})
export class SiafiComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
