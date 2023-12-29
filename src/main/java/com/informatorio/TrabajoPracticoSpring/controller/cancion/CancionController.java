package com.informatorio.TrabajoPracticoSpring.controller.cancion;

import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;
import com.informatorio.TrabajoPracticoSpring.mapper.cancion.CancionMapper;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping(value = "/api/canciones", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class CancionController {
    private CancionService cancionService;

//    @GetMapping()
//    public List<CancionDto> busquedaAleatoria(
//            @RequestParam(name = "criterio",required = false) String criterio
//    ){
//        return null;
//    }

    @GetMapping()
    public List<CancionDto> listarCanciones(){
        return cancionService.listarCanciones();
    }
}
