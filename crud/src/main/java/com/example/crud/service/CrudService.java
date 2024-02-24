package com.example.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.repository.CrudRepository;

@Service
public class CrudService {

    @Autowired
    private CrudRepository crudRepository;
    
}
