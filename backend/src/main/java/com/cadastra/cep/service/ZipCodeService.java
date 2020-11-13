package com.cadastra.cep.service;

import java.util.List;
import java.util.Optional;

import com.cadastra.cep.entity.ZipCodeEntity;
import com.cadastra.cep.exceptions.InternalServerException;
import com.cadastra.cep.repository.ZipCodeRepository;
import com.cadastra.cep.response.ZipCodeResponse;
import com.cadastra.cep.service.callers.RequestServiceCaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

@Service
public class ZipCodeService  {

    @Autowired
	private ZipCodeRepository zipCodeRepository;
	
	@Autowired
	private RequestServiceCaller requestServiceCaller;

	public void save(ZipCodeEntity zipCodeEntity) {
		zipCodeRepository.save(zipCodeEntity);
	}

	public Optional<ZipCodeEntity> findById(Long id) {
		return zipCodeRepository.findById(id);
	}

	public List<ZipCodeEntity> findAll() {
		return zipCodeRepository.findAll();
	}
    
	public void deleteById(Long id) {
		zipCodeRepository.deleteById(id);	
	}

	public ZipCodeResponse findZipCode(String cep) {
        try {
            return requestServiceCaller.findZipCode(cep);
        } catch (HttpStatusCodeException ex) {
            throw new InternalServerException(ex.getResponseBodyAsString(), ex);
        } 
	}
	
	public Optional<ZipCodeEntity> findByCep(String cep) {
		return zipCodeRepository.findByCep(cep);	
	}


	
    
}
