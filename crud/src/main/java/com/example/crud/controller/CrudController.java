package com.example.crud.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.dto.CrudDto;
import com.example.crud.model.CrudModel;
import com.example.crud.service.CrudService;


@RestController
@RequestMapping("/cruds")
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping
    public ResponseEntity<CrudModel> criar(@RequestBody CrudDto crudDto){
        CrudModel crudModel = crudService.criar(crudDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(crudModel);
    }

    @GetMapping
    public ResponseEntity<List<CrudModel>> criar(){
        List<CrudModel> lista = crudService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    } 
    
    @GetMapping("/{id}")
    public ResponseEntity<CrudModel> pegarPorId(@PathVariable  Long id) {    
        return ResponseEntity.status(HttpStatus.OK).body(crudService.buscarPorId(id));
    }

    @GetMapping("/buscar/{cpf}")
    public ResponseEntity<CrudModel> pegarPorCpf(@PathVariable String cpf){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.buscarPorCpf(cpf));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CrudModel> atualizar(@PathVariable Long id,@RequestBody CrudDto crudDto){
        return ResponseEntity.status(HttpStatus.OK).body(crudService.atualizar(id, crudDto));
    }

    


    
    
}

