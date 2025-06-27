package com.example.productservice.controller;

import com.example.productservice.model.Rol;
import com.example.productservice.service.RolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rols")
@CrossOrigin(origins = "*")
public class RolController {

    private final RolService service;

    public RolController(RolService service) {
        this.service = service;
    }

    @GetMapping
    public List<Rol> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Rol getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Rol create(@RequestBody Rol obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
