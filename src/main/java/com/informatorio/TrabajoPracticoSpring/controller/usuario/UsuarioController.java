package com.informatorio.TrabajoPracticoSpring.controller.usuario;

import com.informatorio.TrabajoPracticoSpring.dto.UsuarioDto;
import com.informatorio.TrabajoPracticoSpring.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class UsuarioController {
    //private  final UsuarioService usuarioService;

//    @GetMapping()
//    public List<UsuarioDto> obtenerTodosLosUsuarios(
//      return UsuarioService.obtenerTodosLosUsuarios();
//    )

}
