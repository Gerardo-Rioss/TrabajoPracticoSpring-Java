package com.informatorio.TrabajoPracticoSpring.service.usuario;

import com.informatorio.TrabajoPracticoSpring.dto.UsuarioDto;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDto> obtenerTodosLosUsuarios();

}
