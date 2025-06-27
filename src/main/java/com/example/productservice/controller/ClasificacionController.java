package com.example.productservice.controller;



import com.example.productservice.model.Clasificacion;
import com.example.productservice.service.ClasificacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clasificacions")
@CrossOrigin(origins = "*")
public class ClasificacionController {

    private final ClasificacionService service;

    public ClasificacionController(ClasificacionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Clasificacion> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Clasificacion getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Clasificacion create(@RequestBody Clasificacion obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
