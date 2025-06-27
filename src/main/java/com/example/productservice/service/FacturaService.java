package com.example.productservice.service;


import com.example.productservice.model.Factura;
import com.example.productservice.repository.FacturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    private final FacturaRepository repository;

    public FacturaService(FacturaRepository repository) {
        this.repository = repository;
    }

    public List<Factura> findAll() {
        return repository.findAll();
    }

    public Factura findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Factura save(Factura obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
