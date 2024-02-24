package com.example.crud.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dto.CrudDto;
import com.example.crud.model.CrudModel;
import com.example.crud.repository.CrudRepository;

@Service
public class CrudService {

    @Autowired
    private CrudRepository crudRepository;

    public CrudModel criar(CrudDto crudDto){
        CrudModel crudModel = new CrudModel();
        BeanUtils.copyProperties(crudDto, crudModel);
        return crudRepository.save(crudModel);

    }
    public List<CrudModel> listar(){
        return crudRepository.findAll();
    }
    public CrudModel buscarPorId(Long id){
        CrudModel crudModel = crudRepository.findById(id).get();
        return crudModel;
    }
    public CrudModel buscarPorCpf(String cpf){
        CrudModel crudModel = crudRepository.findByCpf(cpf);
        return crudModel;
    }
    
    
}
