package com.example.productservice.service;


import com.example.productservice.model.TipoPago;
import com.example.productservice.repository.TipoPagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoService {

    private final TipoPagoRepository repository;

    public TipoPagoService(TipoPagoRepository repository) {
        this.repository = repository;
    }

    public List<TipoPago> findAll() {
        return repository.findAll();
    }

    public TipoPago findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public TipoPago save(TipoPago obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
