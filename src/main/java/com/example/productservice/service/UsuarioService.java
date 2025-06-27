package com.example.productservice.service;


import com.example.productservice.model.Usuario;
import com.example.productservice.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario save(Usuario obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
