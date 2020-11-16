import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-id',
  templateUrl: './id.component.html',
  styleUrls: ['./id.component.scss']
})
export class IdComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
