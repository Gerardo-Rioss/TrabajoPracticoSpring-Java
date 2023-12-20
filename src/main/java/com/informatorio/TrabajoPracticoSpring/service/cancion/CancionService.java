package com.informatorio.TrabajoPracticoSpring.service.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;

import java.util.List;
import java.util.UUID;

public interface CancionService {
    List<Cancion> BuscarPorIds(List<UUID>ids);
}
