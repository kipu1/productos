package com.example.productservice.controller;


import com.example.productservice.model.Competencia;
import com.example.productservice.service.CompetenciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competencias")
@CrossOrigin(origins = "*")
public class CompetenciaController {

    private final CompetenciaService service;

    public CompetenciaController(CompetenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Competencia> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Competencia getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Competencia create(@RequestBody Competencia obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
