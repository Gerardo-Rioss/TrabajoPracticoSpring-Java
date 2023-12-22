package com.informatorio.TrabajoPracticoSpring.controller.cancion;

import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping(value = "/api/v1/canciones/busqueda", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class CancionController {
    private CancionService cancionService;

    @GetMapping()
    public List<CancionDto> busquedaAleatoria(
            @RequestParam(name = "nombreCancion",required = false) String nombre,
            @RequestParam(name = "nombreGenero",required = false) String genero,
            @RequestParam(name = "nombreArtista",required = false) String artista,
            @RequestParam(name = "album",required = false) String album
    ){
        return cancionService.busquedaAleatoria(nombre,genero,artista,album);
    }
}
