package com.example.productservice.controller;


import com.example.productservice.model.TipoPago;
import com.example.productservice.service.TipoPagoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoPagos")
@CrossOrigin(origins = "*")
public class TipoPagoController {

    private final TipoPagoService service;

    public TipoPagoController(TipoPagoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoPago> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public TipoPago getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public TipoPago create(@RequestBody TipoPago obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
