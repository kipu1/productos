package com.example.productservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    private Integer stock;
    private Double precioUnitario;
    private String unidad;

    @ManyToOne
    @JoinColumn(name = "id_clasificacion")
    private Clasificacion clasificacion;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedores proveedor;

    private boolean iva;
}
