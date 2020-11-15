package com.cadastra.cep.controller;

import java.util.List;

import com.cadastra.cep.entity.ZipCodeEntity;
import com.cadastra.cep.exceptions.BadRequestException;
import com.cadastra.cep.mapper.MapperZipCodeEntity;
import com.cadastra.cep.model.error.ApiError;
import com.cadastra.cep.request.ZipCodeRequest;
import com.cadastra.cep.response.ZipCodeResponse;
import com.cadastra.cep.service.ZipCodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path = "/zip-code")
public class ZipCodeController {

    @Autowired
    private ZipCodeService zipCodeService;

    @ApiOperation(httpMethod = "GET", value = "Listar todos os Ceps Cadastrados", response = ZipCodeResponse.class, responseContainer = "List")
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
        @ApiResponse(code = 404, message = "Not Found", response = ApiError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ApiError.class)
    })
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ZipCodeResponse>> listZipCode(@RequestHeader HttpHeaders headers) {	
        return ResponseEntity.status(HttpStatus.OK).body(new MapperZipCodeEntity().mapperZipCodeEntityToZipCodeResponse(zipCodeService.findAll()));
    }


    @ApiOperation(httpMethod = "GET", value = "Consultar Cep", response = ZipCodeResponse.class, responseContainer = "List")
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
        @ApiResponse(code = 404, message = "Not Found", response = ApiError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ApiError.class)
    })
    @GetMapping(value = "/consumer-zip-code/{cep}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ZipCodeResponse> findZipCode(@RequestHeader HttpHeaders headers, @PathVariable(value = "cep") String cep) {	
        try {
            return ResponseEntity.status(HttpStatus.OK).body(zipCodeService.findZipCode(cep));
        } catch (Exception e) {
            throw new BadRequestException("Erro ao consultar. Cep informado inválido.");
        }
    }


    @ApiOperation(httpMethod = "POST", value = "Cadastrar Cep")
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
        @ApiResponse(code = 404, message = "Not Found", response = ApiError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ApiError.class)
    })
    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> saveZipCode(@RequestHeader HttpHeaders headers, 
    @RequestBody ZipCodeRequest zipCodeRequest) {	
        try {
            if(zipCodeService.findByCep(zipCodeRequest.getCep()).isEmpty()) {
                zipCodeService.save(new MapperZipCodeEntity().mapperZipCodeRequestToEntity(zipCodeRequest));
            } else {
                throw new BadRequestException("Cep informado já cadastrado.");
            }
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            throw new BadRequestException(e.getMessage());
        }
    }

    @ApiOperation(httpMethod = "Update", value = "Atualizar cadastro de um Cep")
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
        @ApiResponse(code = 404, message = "Not Found", response = ApiError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ApiError.class)
    })
    @PutMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> updateZipCode(@RequestHeader HttpHeaders headers, 
    @RequestBody ZipCodeRequest zipCodeRequest) {	
        try {
            if(!zipCodeService.findById(zipCodeRequest.getId()).isEmpty()) {
                zipCodeService.save(new MapperZipCodeEntity().mapperZipCodeRequestToEntity(zipCodeRequest));
            } else {
                throw new BadRequestException("Cep informado não encontrado.");
            }
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            throw new BadRequestException("Erro ao deletar. Cep informado inválido.");
        }
    }

    @ApiOperation(httpMethod = "Delete", value = "Deletar cadastro de Cep")
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request", response = ApiError.class),
        @ApiResponse(code = 404, message = "Not Found", response = ApiError.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ApiError.class)
    })
    @DeleteMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> deleteZipCode(@RequestHeader HttpHeaders headers, 
    @RequestBody ZipCodeRequest zipCodeRequest) {	
        try {
            if(!zipCodeService.findById(zipCodeRequest.getId()).isEmpty()) {
                zipCodeService.deleteById(zipCodeRequest.getId());
            } else {
                throw new BadRequestException("Cep informado não encontrado.");
            }
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            throw new BadRequestException("Erro ao deletar. Cep informado inválido.");
        }
    }
}
