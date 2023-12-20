package com.informatorio.TrabajoPracticoSpring.service.cancion.impl;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CancionServiceImpl implements CancionService {
    private static CancionRepository cancionRepository;
    @Override
    public List<Cancion> BuscarPorIds(List<UUID> ids) {

        List<Cancion> canciones = new ArrayList<>() ;
        for (UUID id : ids){
            canciones.add(cancionRepository.findById(id).orElseThrow());
        }
        return canciones;

    }
}
