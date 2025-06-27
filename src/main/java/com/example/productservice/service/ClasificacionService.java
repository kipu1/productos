package com.example.productservice.service;


import com.example.productservice.model.Clasificacion;
import com.example.productservice.repository.ClasificacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionService {

    private final ClasificacionRepository repository;

    public ClasificacionService(ClasificacionRepository repository) {
        this.repository = repository;
    }

    public List<Clasificacion> findAll() {
        return repository.findAll();
    }

    public Clasificacion findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Clasificacion save(Clasificacion obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
