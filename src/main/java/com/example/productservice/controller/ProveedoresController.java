package com.example.productservice.controller;

import com.example.productservice.model.Proveedores;
import com.example.productservice.service.ProveedoresService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedoress")
@CrossOrigin(origins = "*")
public class ProveedoresController {

    private final ProveedoresService service;

    public ProveedoresController(ProveedoresService service) {
        this.service = service;
    }

    @GetMapping
    public List<Proveedores> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Proveedores getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Proveedores create(@RequestBody Proveedores obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
