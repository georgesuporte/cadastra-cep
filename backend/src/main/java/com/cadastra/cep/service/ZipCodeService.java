package com.cadastra.cep.service;

import java.util.List;
import java.util.Optional;

import com.cadastra.cep.entity.ZipCodeEntity;
import com.cadastra.cep.repository.ZipCodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipCodeService  {

    @Autowired
    private ZipCodeRepository zipCodeRepository;

	public void save(ZipCodeEntity zipCodeEntity) {
		// TODO Auto-generated method stub
	}

	public Optional<ZipCodeEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<ZipCodeEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
    
	public void delete(ZipCodeEntity entity) {
		// TODO Auto-generated method stub
		
	}
    
}
