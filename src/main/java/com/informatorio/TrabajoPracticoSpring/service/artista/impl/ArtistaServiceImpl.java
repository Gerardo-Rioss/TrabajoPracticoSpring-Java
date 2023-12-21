package com.informatorio.TrabajoPracticoSpring.service.artista.impl;


import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.repository.artista.ArtistaRepository;
import com.informatorio.TrabajoPracticoSpring.service.artista.ArtistaService;




public class ArtistaServiceImpl implements ArtistaService {
    private ArtistaRepository artistaRepository;


    @Override
    public Artista buscarPorNombre(String nombre) {
        return artistaRepository.buscarPorNombre(nombre);
    }
}
