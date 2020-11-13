package com.cadastra.cep.repository;

import com.cadastra.cep.entity.ZipCodeEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCodeEntity, Long> {
    Optional<ZipCodeEntity> findByCep(String cep);
}