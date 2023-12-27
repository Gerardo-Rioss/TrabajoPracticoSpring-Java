package com.informatorio.TrabajoPracticoSpring.dto.listaReproduccionDto;

import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ListaReproduccionDto {
    private Long id;
    private Usuario usuario;
    private String nombreLista;
    private List<Long> canciones= new ArrayList<>();
    private Boolean repetir;
    private Boolean aleatoria;
    private Boolean publica;

}
