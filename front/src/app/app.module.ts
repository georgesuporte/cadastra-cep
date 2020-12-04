import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {
  MatDatepickerModule, MatFormFieldModule,
  MatIconModule,
  MatInputModule,
  MatNativeDateModule,
  MatSnackBarModule
} from '@angular/material/';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BairroComponent } from '@app/component/fields/bairro/bairro.component';
import { NgxMaskModule } from 'ngx-mask';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CepComponent } from './component/fields/cep/cep.component';
import { ComplementoComponent } from './component/fields/complemento/complemento.component';
import { DddComponent } from './component/fields/ddd/ddd.component';
import { GiaComponent } from './component/fields/gia/gia.component';
import { IbgeComponent } from './component/fields/ibge/ibge.component';
import { IdComponent } from './component/fields/id/id.component';
import { LocalidadeComponent } from './component/fields/localidade/localidade.component';
import { LogradouroComponent } from './component/fields/logradouro/logradouro.component';
import { SiafiComponent } from './component/fields/siafi/siafi.component';
import { UfComponent } from './component/fields/uf/uf.component';
import { FormComponent } from './component/form-component/form.component';
import { CepService } from './service/cep.service';
import { TableComponentComponent } from './component/table-component/table-component.component';
import {MatTableModule} from '@angular/material/table';
import { CepFieldDirective } from './directive/CepFieldDirective';

@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    CepComponent,
    LogradouroComponent,
    BairroComponent,
    ComplementoComponent,
    DddComponent,
    GiaComponent,
    IbgeComponent,
    LocalidadeComponent,
    SiafiComponent,
    UfComponent,
    IdComponent,
    TableComponentComponent,
    CepFieldDirective,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatIconModule,
    MatInputModule,
    MatNativeDateModule,
    MatSnackBarModule,
    NgxMaskModule.forRoot(),
    MatTableModule,
    ReactiveFormsModule,
  ],
  providers: [CepService],
  bootstrap: [AppComponent],
  entryComponents: [
    CepComponent,
    LogradouroComponent,
    BairroComponent,
    ComplementoComponent,
    DddComponent,
    GiaComponent,
    IbgeComponent,
    LocalidadeComponent,
    SiafiComponent,
    UfComponent,
    IdComponent,
    TableComponentComponent,
  ]
})
export class AppModule { }
