package com.cadastra.cep.mapper;

import com.cadastra.cep.entity.ZipCodeEntity;
import com.cadastra.cep.request.ZipCodeRequest;
import com.cadastra.cep.response.ZipCodeResponse;
import java.util.List;
import java.util.ArrayList;

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

    public List<ZipCodeResponse> mapperZipCodeEntityToZipCodeResponse(List<ZipCodeEntity> listZipCodeEntity) {
        List<ZipCodeResponse> listZipCodeResponse = new ArrayList<>();
        for (ZipCodeEntity zipCodeEntity : listZipCodeEntity) {
            ZipCodeResponse zipCodeResponse = new ZipCodeResponse();
            zipCodeResponse.setId(zipCodeEntity.getId());
            zipCodeResponse.setCep(zipCodeEntity.getCep());
            zipCodeResponse.setLogradouro(zipCodeEntity.getLogradouro());
            zipCodeResponse.setComplemento(zipCodeEntity.getComplemento());
            zipCodeResponse.setBairro(zipCodeEntity.getBairro()); 
            zipCodeResponse.setLocalidade(zipCodeEntity.getLocalidade());
            zipCodeResponse.setUf(zipCodeEntity.getUf());
            zipCodeResponse.setIbge(zipCodeEntity.getIbge());
            zipCodeResponse.setGia(zipCodeEntity.getGia());
            zipCodeResponse.setDdd(zipCodeEntity.getDdd());
            zipCodeResponse.setSiafi(zipCodeEntity.getSiafi());
            listZipCodeResponse.add(zipCodeResponse);
          }
        return listZipCodeResponse;
    }
}
