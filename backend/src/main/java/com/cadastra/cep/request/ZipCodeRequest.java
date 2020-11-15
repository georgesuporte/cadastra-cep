package com.cadastra.cep.request;

import lombok.Data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@ApiModel(value="ZipCodeRequest", description="ZipCodeRequest")
@Data
public class ZipCodeRequest {

  @ApiModelProperty(value = "Atributo responsável por armazenar o ID", example = "1")
  private Long id;

  @ApiModelProperty(value = "Atributo responsável por armazenar o cep", example = "42711-830")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
  @NotEmpty(message = "Campo obrigatório.")
  @Pattern(regexp = "[0-9\\s\\-]+", message = "Campo obrigatório.")
  private String cep;

  @ApiModelProperty(value = "Atributo responsável por armazenar o logradrouro", example = "Rua Doutor Gerino de Souza Filho")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
	@NotEmpty(message = "Campo obrigatório.")
  private String logradouro;

  @ApiModelProperty(value = "Atributo responsável por armazenar o logradrouro", example = "Casa")
  private String complemento;

  @ApiModelProperty(value = "Atributo responsável por armazenar o bairro", example = "Caixa D'Água")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
	@NotEmpty(message = "Campo obrigatório.")
  private String bairro;

  @ApiModelProperty(value = "Atributo responsável por armazenar o municipio", example = "Lauro de Freitas")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
	@NotEmpty(message = "Campo obrigatório.")
  private String localidade;

  @ApiModelProperty(value = "Atributo responsável por armazenar a UF", example = "BA")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
	@NotEmpty(message = "Campo obrigatório.")
  private String uf;

  @ApiModelProperty(value = "Atributo responsável por armazenaro codigo do IBGE", example = "2919207")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
  @NotEmpty(message = "Campo obrigatório.")
  @Pattern(regexp = "[0-9]+", message = "Campo obrigatório.")
  private String ibge;

  @ApiModelProperty(value = "Atributo responsável por armazenaro codigo GIA", example = "")
  private String gia;

  @ApiModelProperty(value = "Atributo responsável por armazenaro codigo DDD", example = "71")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
  @NotEmpty(message = "Campo obrigatório.")
  @Pattern(regexp = "[0-9]+", message = "Campo obrigatório.")
  private String ddd;

  @ApiModelProperty(value = "Atributo responsável por armazenaro codigo SIAFI", example = "3685")
	@Size(min = 1, message = "Tamanho do campo inválido/incorreto")
  @NotEmpty(message = "Campo obrigatório.")
  @Pattern(regexp = "[0-9]+", message = "Campo obrigatório.")
  private String siafi;
}
