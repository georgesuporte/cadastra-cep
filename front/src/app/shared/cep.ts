import { ResponseInterface } from '@app/interface/response.interfaces';

export class Cep implements ResponseInterface {
  id: number;
  cep: string;
  logradouro: string;
  complemento?: string;
  bairro?: string;
  localidade?: string;
  uf?: string;
  ibge?: string;
  gia?: string;
  ddd?: string;
  siafi?: string;
}
