package com.informatorio.TrabajoPracticoSpring.service.usuario;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioService {

    void crearUsuario(UsuarioDto usuarioDto);
    Usuario buscarPorNombre(String nombre);

}
