package com.example.productservice.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;

    private String ruc;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago")
    private TipoPago tipoPago;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private Double descuento;
    private Double total;
}
