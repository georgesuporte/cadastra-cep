package com.cadastra.cep.model.error;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="ErrorDetails", description="Informação detalhada dos erros ocorridos.")
public class ErrorDetails {


	@ApiModelProperty(value = "Descrição do erro.", required = true, example = "Cep não encontrado.")
	private String message;
	
}