package com.cadastra.cep.request;

import lombok.Data;

@Data
public class ZipCodeRequest {

  private Long id;
  private String cep;
  private String logradouro;
  private String complemento;
  private String bairro;
  private String localidade;
  private String uf;
  private String ibge;
  private String gia;
  private String ddd;
  private String siafi;
}
