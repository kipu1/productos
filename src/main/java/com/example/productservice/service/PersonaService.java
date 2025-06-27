package com.example.productservice.service;


import com.example.productservice.model.Persona;
import com.example.productservice.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository repository;

    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public List<Persona> findAll() {
        return repository.findAll();
    }

    public Persona findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Persona save(Persona obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
