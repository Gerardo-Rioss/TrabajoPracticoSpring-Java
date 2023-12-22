package com.informatorio.TrabajoPracticoSpring.dto.artista;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ArtistaDto {
    private UUID id;
    private String nombreArtista;
    private List<UUID> canciones;
}
