package com.example.productservice.controller;



import com.example.productservice.model.ItemFactura;
import com.example.productservice.service.ItemFacturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itemFacturas")
@CrossOrigin(origins = "*")
public class ItemFacturaController {

    private final ItemFacturaService service;

    public ItemFacturaController(ItemFacturaService service) {
        this.service = service;
    }

    @GetMapping
    public List<ItemFactura> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ItemFactura getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public ItemFactura create(@RequestBody ItemFactura obj) {
        return service.save(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
