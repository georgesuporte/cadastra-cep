package com.cadastra.cep.repository;

import com.cadastra.cep.entity.ZipCodeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCodeEntity, Long> {

}