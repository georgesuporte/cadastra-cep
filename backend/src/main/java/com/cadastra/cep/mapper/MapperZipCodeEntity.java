package com.cadastra.cep.mapper;

import com.cadastra.cep.entity.ZipCodeEntity;
import com.cadastra.cep.request.ZipCodeRequest;


public class MapperZipCodeEntity {

    public ZipCodeEntity mapperZipCodeRequestToEntity(ZipCodeRequest zipCodeRequest) {

        ZipCodeEntity zipCodeEntity = new ZipCodeEntity();
        zipCodeEntity.setId(zipCodeRequest.getId());
        zipCodeEntity.setCep(zipCodeRequest.getCep());
        zipCodeEntity.setLogradouro(zipCodeRequest.getLogradouro());
        zipCodeEntity.setComplemento(zipCodeRequest.getComplemento());
        zipCodeEntity.setBairro(zipCodeRequest.getBairro()); 
        zipCodeEntity.setLocalidade(zipCodeRequest.getLocalidade());
        zipCodeEntity.setUf(zipCodeRequest.getUf());
        zipCodeEntity.setIbge(zipCodeRequest.getIbge());
        zipCodeEntity.setGia(zipCodeRequest.getGia());
        zipCodeEntity.setDdd(zipCodeRequest.getDdd());
        zipCodeEntity.setSiafi(zipCodeRequest.getSiafi());
		return zipCodeEntity;
        
    }
}
