import { ComponentFactoryResolver, OnInit } from '@angular/core';
import { Input } from '@angular/core';
import { ViewContainerRef } from '@angular/core';
import { Directive } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FieldConfig } from '@app/interface/field.interface';
import { componentMapper } from './cep-field.directive';


@Directive({
  selector: '[cep-field-directive]'
})
export class CepFieldDirective implements OnInit {

  @Input() field: FieldConfig;
  @Input() group: FormGroup;
  componentRef: any;
  constructor(
    private resolver: ComponentFactoryResolver,
    private container: ViewContainerRef
  ) { }

  ngOnInit() {
    const factory = this.resolver.resolveComponentFactory(
      componentMapper[this.field.type]
    );
    this.componentRef = this.container.createComponent(factory);
    this.componentRef.instance.field = this.field;
    this.componentRef.instance.group = this.group;
  }
}
