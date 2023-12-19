package com.informatorio.TrabajoPracticoSpring.service.usuario.impl;

import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import com.informatorio.TrabajoPracticoSpring.mapper.UsuarioMapper;
import com.informatorio.TrabajoPracticoSpring.repository.usuario.UsuarioRepository;
import com.informatorio.TrabajoPracticoSpring.service.usuario.UsuarioService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Override
    public List<UsuarioDto> obtenerTodosLosUsuarios() {
        return null;
    }
    @Transactional
    @Override
    public void crearUsuario(UsuarioDto usuarioDto) {
        Usuario nuevoUsuario = UsuarioMapper.mapToUsuario(usuarioDto,new Usuario());
        //nuevoUsuario.setId(2L);
        nuevoUsuario.setNombre("Raul Rios");
        nuevoUsuario.setNombreUsuario("Phantera");
        nuevoUsuario.setCreadoEn(LocalDateTime.now());
        usuarioRepository.save(nuevoUsuario);

    }
}
