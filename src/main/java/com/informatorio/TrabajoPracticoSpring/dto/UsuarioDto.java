package com.informatorio.TrabajoPracticoSpring.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class UsuarioDto {
    private Long id;
    private String nombre;
    private String nombreUsuario;
    private List<Long> listaReproduccion = new ArrayList<>();
}
