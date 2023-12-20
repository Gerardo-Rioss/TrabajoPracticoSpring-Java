package com.informatorio.TrabajoPracticoSpring.service.genero.impl;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.repository.genero.GeneroRepository;
import com.informatorio.TrabajoPracticoSpring.service.genero.GeneroService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GeneroServiceImpl implements GeneroService {
    private GeneroRepository generoRepository;


    @Override
    public List<Genero> BuscarPorIds(List<UUID> ids) {
        List<Genero> generos = new ArrayList<>() ;
        for (UUID id : ids){
            generos.add(generoRepository.findById(id).orElseThrow());
        }
        return generos;
    }
}
