package com.example.productservice.controller;


import com.example.productservice.model.Usuario;
import com.example.productservice.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
