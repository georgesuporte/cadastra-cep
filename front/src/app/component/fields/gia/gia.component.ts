import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-gia',
  templateUrl: './gia.component.html',
  styleUrls: ['./gia.component.scss']
})
export class GiaComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
