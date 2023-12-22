package com.informatorio.TrabajoPracticoSpring.mapper.usuario;

import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import com.informatorio.TrabajoPracticoSpring.service.listaReproduccion.ListaReproduccionService;

import java.util.Collection;
import java.util.List;

public class UsuarioMapper {
    private static ListaReproduccionService listaReproduccionService;
    public static Usuario mapToUsuario(UsuarioDto usuarioDto, Usuario usuario){
        usuario.setNombreUsuario(usuarioDto.getNombreUsuario());
        usuario.setNombreUsuario(usuarioDto.getNombreUsuario());
        if (!usuarioDto.getListaReproduccion().isEmpty()){
            usuario.setListaReproduccion(listaReproduccionService.BuscarPorIds(usuarioDto.getListaReproduccion()));
        }
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
        usuarioDto.setId(usuario.getId());
        usuarioDto.setNombreUsuario(usuario.getNombreUsuario());
        usuarioDto.setNombreUsuario(usuario.getNombreUsuario());
        for (ListaReproduccion lista: usuario.getListaReproduccion()){
            usuarioDto.getListaReproduccion().add(lista.getId());
        }
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
