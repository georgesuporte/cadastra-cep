import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-ddd',
  templateUrl: './ddd.component.html',
  styleUrls: ['./ddd.component.scss']
})
export class DddComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
