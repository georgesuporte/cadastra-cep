package com.cadastra.cep.service.callers;

import com.cadastra.cep.response.ZipCodeResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RequestServiceCaller", url = "${com.via.cep}")
public interface RequestServiceCaller {

    @GetMapping(value = "/{cep}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    ZipCodeResponse findZipCode(@PathVariable(value = "cep") String cep);
}