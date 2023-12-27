package com.informatorio.TrabajoPracticoSpring.service.usuario;

import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import com.informatorio.TrabajoPracticoSpring.mapper.usuario.UsuarioMapper;
import com.informatorio.TrabajoPracticoSpring.repository.usuario.UsuarioRepository;
import com.informatorio.TrabajoPracticoSpring.service.usuario.UsuarioService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    @Override
    public void crearUsuario(UsuarioDto usuarioDto) {
        Usuario nuevoUsuario = UsuarioMapper.mapToUsuario(usuarioDto,new Usuario());
        //nuevoUsuario.setId(UUID.randomUUID());
        nuevoUsuario.setCreadoPor("Anonimo");
        nuevoUsuario.setCreadoEn(LocalDateTime.now());
        usuarioRepository.save(nuevoUsuario);

    }

    @Override
    public Usuario buscarPorNombre(String nombre) {
        for (Usuario user: usuarioRepository.findAll())
            if (user.getNombreUsuario().equals(nombre)) return user;
        return null;
    }
}
