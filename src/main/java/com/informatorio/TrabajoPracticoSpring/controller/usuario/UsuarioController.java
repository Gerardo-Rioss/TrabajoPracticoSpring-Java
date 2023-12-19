package com.informatorio.TrabajoPracticoSpring.controller.usuario;

import com.informatorio.TrabajoPracticoSpring.ConstantsUtils.ConstantsUtils;
import com.informatorio.TrabajoPracticoSpring.dto.respuesta.RespuestaDto;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import com.informatorio.TrabajoPracticoSpring.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity<RespuestaDto> crearUsuario(@RequestBody UsuarioDto usuarioDto){
        usuarioService.crearUsuario(usuarioDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new RespuestaDto(ConstantsUtils.STATUS_201,ConstantsUtils.MESSAGE_201));
    }



}
