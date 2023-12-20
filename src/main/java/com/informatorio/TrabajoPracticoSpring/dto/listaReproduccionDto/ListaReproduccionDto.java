package com.informatorio.TrabajoPracticoSpring.dto.listaReproduccionDto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ListaReproduccionDto {
    private Long usuario;
    private String nombre;
    private List<UUID> canciones= new ArrayList<>();
    private Boolean repetirAlFinalizar;
    private Boolean aleatoria;
    private Boolean publica;

}
