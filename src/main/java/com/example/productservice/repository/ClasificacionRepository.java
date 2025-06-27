package com.example.productservice.repository;


import com.example.productservice.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {
}
