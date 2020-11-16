import { Component, Input, OnInit } from '@angular/core';
import { ResponseInterface } from '@app/interface/response.interfaces';

@Component({
  selector: 'app-uf',
  templateUrl: './uf.component.html',
  styleUrls: ['./uf.component.scss']
})
export class UfComponent implements OnInit {

  @Input() items: ResponseInterface;

  constructor() { }

  ngOnInit() {
  }

}
