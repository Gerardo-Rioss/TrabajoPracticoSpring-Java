package com.informatorio.TrabajoPracticoSpring.service.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;

import java.util.List;
import java.util.UUID;

public interface CancionService {
    Cancion buscarPorNombre(String nombre);
    List<Cancion> BuscarPorIds(List<UUID>ids);
    List<CancionDto>busquedaAleatoria(String nombre, String genero,String artista, String album );
}
