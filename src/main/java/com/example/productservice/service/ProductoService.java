package com.example.productservice.service;


import com.example.productservice.model.Producto;
import com.example.productservice.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> findAll() {
        return repository.findAll();
    }

    public Producto findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Producto save(Producto obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
