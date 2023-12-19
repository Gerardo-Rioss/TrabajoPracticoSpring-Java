package com.informatorio.TrabajoPracticoSpring.mapper.usuario;

import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;

import java.util.Collection;
import java.util.List;

public class UsuarioMapper {
    public static Usuario mapToUsuario(UsuarioDto usuarioDto, Usuario usuario){
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setNombreUsuario(usuarioDto.getNombreUsuario());
        return usuario;
    }

    public List<Usuario> mapToUsuarios(Collection<UsuarioDto> usuarioDtos, Collection<Usuario> usuarios){
        for (UsuarioDto usuarioDto: usuarioDtos){
            usuarios.add(
                mapToUsuario(usuarioDto,new Usuario())
            );
        }
        return (List<Usuario>)usuarios;
    }
    public static UsuarioDto mapToUsuarioDto(Usuario usuario, UsuarioDto usuarioDto){
        usuarioDto.setNombre(usuario.getNombre());
        usuarioDto.setNombreUsuario(usuario.getNombreUsuario());
        return usuarioDto;
    }
    public List<UsuarioDto> mapToUsuarioDtos(Collection<Usuario> usuarios, Collection<UsuarioDto> usuarioDtos){
        for (Usuario usuario: usuarios){
            usuarioDtos.add(
                    mapToUsuarioDto(usuario,new UsuarioDto())
            );
        }
        return (List<UsuarioDto>)usuarioDtos;
    }
}
