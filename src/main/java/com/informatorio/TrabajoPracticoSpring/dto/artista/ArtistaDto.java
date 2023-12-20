package com.informatorio.TrabajoPracticoSpring.dto.artista;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ArtistaDto {
    private String nombre;
    private List<UUID> canciones;
}
