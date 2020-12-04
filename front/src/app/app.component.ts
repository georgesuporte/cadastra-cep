import { Component, ViewChild } from '@angular/core';
import { Validators } from '@angular/forms';
import { FormComponent } from './component/form-component/form.component';
import { FieldConfig } from './interface/field.interface';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'cadastra-cep';

  @ViewChild(FormComponent, {static: false}) form: FormComponent;
  regConfig: FieldConfig[] = [
    {
      type: "input",
      label: "Cep",
      inputType: "text",
      name: "cep",
      validations: [
        {
          name: "required",
          validator: Validators.required,
          message: "Cep Obrigatório"
        },
        {
          name: "pattern",
          validator: Validators.pattern("^[0-9]+$"),
          message: "Somente Números"
        }
      ]
    },
  ];

  submit(value: any) {}
}
