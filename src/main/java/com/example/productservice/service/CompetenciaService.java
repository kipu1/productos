package com.example.productservice.service;


import com.example.productservice.model.Competencia;
import com.example.productservice.repository.CompetenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaService {

    private final CompetenciaRepository repository;

    public CompetenciaService(CompetenciaRepository repository) {
        this.repository = repository;
    }

    public List<Competencia> findAll() {
        return repository.findAll();
    }

    public Competencia findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Competencia save(Competencia obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
