package com.example.productservice.controller;


import com.example.productservice.model.Factura;
import com.example.productservice.service.FacturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin(origins = "*")
public class FacturaController {

    private final FacturaService service;

    public FacturaController(FacturaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Factura> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Factura getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Factura create(@RequestBody Factura obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
