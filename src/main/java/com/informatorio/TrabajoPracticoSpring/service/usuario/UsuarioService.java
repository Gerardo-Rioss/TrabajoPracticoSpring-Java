package com.informatorio.TrabajoPracticoSpring.service.usuario;

import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDto> obtenerTodosLosUsuarios();
    void crearUsuario(UsuarioDto usuarioDto);

}
