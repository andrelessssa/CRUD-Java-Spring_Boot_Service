package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.service.CrudService;


@RestController
@RequestMapping("/cruds")
public class CrudController {

    @Autowired
    private CrudService crudService;

    
    
    
}

