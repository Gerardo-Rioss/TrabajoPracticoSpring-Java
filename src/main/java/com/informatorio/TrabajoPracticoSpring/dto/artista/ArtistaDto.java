package com.informatorio.TrabajoPracticoSpring.dto.artista;

import lombok.Data;

import java.util.List;

@Data
public class ArtistaDto {
    private String nombre;
    private List<Long> canciones;
}
