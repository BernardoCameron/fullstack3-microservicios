package com.duoc.microservicios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estadio {

    private Long id;
    private String nombre;
    private String ciudad;
    private Integer capacidad;

}
