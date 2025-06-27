package com.example.productservice.service;


import com.example.productservice.model.Rol;
import com.example.productservice.repository.RolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    private final RolRepository repository;

    public RolService(RolRepository repository) {
        this.repository = repository;
    }

    public List<Rol> findAll() {
        return repository.findAll();
    }

    public Rol findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Rol save(Rol obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
