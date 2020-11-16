import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-table-component',
  templateUrl: './table-component.component.html',
  styleUrls: ['./table-component.component.scss']
})
export class TableComponentComponent implements OnInit {

  displayedColumns: string[] = [
    'id', 'cep', 'localidade',
    'logradouro', 'complemento', 'bairro',
    'uf', 'ddd', 'gia',
    'ibge', 'siafi'
  ];

  constructor() { }

  ngOnInit() {
  }

}
