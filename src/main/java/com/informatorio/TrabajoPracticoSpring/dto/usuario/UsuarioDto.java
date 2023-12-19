package com.informatorio.TrabajoPracticoSpring.dto.usuario;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class UsuarioDto {
    private String nombre;
    private String nombreUsuario;
    private List<Long> listaReproduccion = new ArrayList<>();
}
