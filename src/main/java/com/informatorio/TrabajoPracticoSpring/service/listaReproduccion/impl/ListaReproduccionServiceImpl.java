package com.informatorio.TrabajoPracticoSpring.service.listaReproduccion.impl;

import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.repository.listaReproduccion.ListaReproduccionRepository;
import com.informatorio.TrabajoPracticoSpring.service.listaReproduccion.ListaReproduccionService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ListaReproduccionServiceImpl implements ListaReproduccionService {
    private ListaReproduccionRepository listaReproduccionRepository;

    @Override
    public List<ListaReproduccion> BuscarPorIds(List<UUID> ids) {
        List<ListaReproduccion> listaReproducciones = new ArrayList<>() ;
        for (UUID id : ids){
            listaReproducciones.add(listaReproduccionRepository.findById(id).orElseThrow());
        }
        return listaReproducciones;
    }
}
