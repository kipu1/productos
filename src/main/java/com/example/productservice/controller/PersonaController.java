package com.example.productservice.controller;


import com.example.productservice.model.Persona;
import com.example.productservice.service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*")
public class PersonaController {

    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Persona> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Persona getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Persona create(@RequestBody Persona obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
