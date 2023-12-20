package com.informatorio.TrabajoPracticoSpring.dto.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class CancionDto {
    private UUID id;
    private String nombre;
    private Integer ranking;
    private List<UUID>generos= new ArrayList<>();
    private List<UUID>listaReproduccion = new ArrayList<>();
    private Double duracion;
    private Artista artista ;
    private String album;
}
