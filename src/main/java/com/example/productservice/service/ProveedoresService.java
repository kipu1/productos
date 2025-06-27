package com.example.productservice.service;

import com.example.productservice.model.Proveedores;
import com.example.productservice.repository.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresService {

    private final ProveedoresRepository repository;

    public ProveedoresService(ProveedoresRepository repository) {
        this.repository = repository;
    }

    public List<Proveedores> findAll() {
        return repository.findAll();
    }

    public Proveedores findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Proveedores save(Proveedores obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
