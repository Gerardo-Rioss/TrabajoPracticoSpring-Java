package com.informatorio.TrabajoPracticoSpring.dto.usuario;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class UsuarioDto {
    private UUID id;
    private String nombre;
    private String nombreUsuario;
    private List<UUID> listaReproduccion = new ArrayList<>();
}
