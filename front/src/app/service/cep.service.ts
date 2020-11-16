import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { throwError } from 'rxjs';
import { Observable } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { environment } from '@environments/environment';
import { ResponseInterface } from '@app/interface/response.interfaces';
import { DataResponse } from '@app/interface/data.interface';



@Injectable()
export class CepService {

  private url_zip_code = environment.url_api;

  private httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json; charset=utf-8',
    })
  };


  constructor(private http: HttpClient) { }

  public findCep(cep: string): Observable<DataResponse<ResponseInterface>> {
    return this.http.get<DataResponse<ResponseInterface>>(this.url_zip_code + '/consumer-zip-code/' + cep, this.httpOptions)
    .pipe(
      tap((res) => {
        return res.data[0];
      }),
      catchError(this.handleError)
    );
  }

  handleError(error: HttpErrorResponse) {
    return throwError(error);
  }
}
