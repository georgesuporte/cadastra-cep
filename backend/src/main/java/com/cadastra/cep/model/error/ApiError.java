package com.cadastra.cep.model.error;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Error", description = "Possíveis Erros de validação:")
public class ApiError {

    private static final String DATE_FORMAT_O = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    @ApiModelProperty(value = "O timestamp em que o erro ocorreu.", required = true, example = "2020-05-04T13:21:57.757")
    private String timestamp;

    @ApiModelProperty(value = "O status HTTP.", required = true, example = "500")
    private int status;

    @ApiModelProperty(value = "A descrição do status HTTP.", required = true, example = "INTERNAL_SERVER_ERROR")
    private HttpStatus error;

    @ApiModelProperty(value = "Mensagem resumindo o erro.", required = true, example = "Dados não encontrado.")
    private String message;

    @ApiModelProperty(value = "Nome do Metodo.", example = "findZipCode")
    private String method;

    @ApiModelProperty(value = "Caminho / Url.", required = true, example = "/cadastra-cep/v1/zip-code")
    private String path;

    @ApiModelProperty(value = "Informação detalhada dos erros ocorridos.")
    private List<ErrorDetails> errorDetails;

    public ApiError() {
        super();
    }

    public ApiError(final HttpStatus badRequest, final String message, final List<ErrorDetails> errorDetails) {
        super();
            this.timestamp = new SimpleDateFormat(DATE_FORMAT_O).format(new Date());
            this.status = badRequest.value();
            this.error = badRequest;
            this.message = message;
            this.errorDetails = errorDetails;
    
    }

    public ApiError(final HttpStatus badRequest, final String message, final ErrorDetails error) {
        super();
        this.timestamp = new SimpleDateFormat(DATE_FORMAT_O).format(new Date());
        this.status = badRequest.value();
        this.error = badRequest;
        this.message = message;
        errorDetails = Arrays.asList(error);
    }

}