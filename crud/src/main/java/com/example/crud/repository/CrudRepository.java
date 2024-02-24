package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.CrudModel;

public interface CrudRepository extends JpaRepository<CrudModel, Long>{

    CrudModel findByCpf(String cpf);
    
}
