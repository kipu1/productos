package com.example.productservice.service;


import com.example.productservice.model.ItemFactura;
import com.example.productservice.repository.ItemFacturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemFacturaService {

    private final ItemFacturaRepository repository;

    public ItemFacturaService(ItemFacturaRepository repository) {
        this.repository = repository;
    }

    public List<ItemFactura> findAll() {
        return repository.findAll();
    }

    public ItemFactura findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public ItemFactura save(ItemFactura obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
