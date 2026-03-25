package com.duoc.microservicios.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

    private Long id;
    private String nombre;
    private String posicion;
    private Integer numero;
    private Long equipoId;

}
