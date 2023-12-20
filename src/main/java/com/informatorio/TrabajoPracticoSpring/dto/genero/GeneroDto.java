package com.informatorio.TrabajoPracticoSpring.dto.genero;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class GeneroDto {
    private String nombre;
    private List<UUID> canciones= new ArrayList<>() ;
}
