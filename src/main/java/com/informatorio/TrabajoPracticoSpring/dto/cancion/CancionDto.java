package com.informatorio.TrabajoPracticoSpring.dto.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class CancionDto {
    private Long id;
    private String nombreCancion;
    private Integer ranking;
    private List<Long>generos= new ArrayList<>();
    private List<Long>listaReproduccion = new ArrayList<>();
    private Double duracion;
    private Artista artista ;
    private String album;
}
