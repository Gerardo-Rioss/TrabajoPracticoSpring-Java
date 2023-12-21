package com.informatorio.TrabajoPracticoSpring.service.artista;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;

import java.util.List;
import java.util.UUID;

public interface ArtistaService {
    Artista buscarPorNombre(String nombre);

}
