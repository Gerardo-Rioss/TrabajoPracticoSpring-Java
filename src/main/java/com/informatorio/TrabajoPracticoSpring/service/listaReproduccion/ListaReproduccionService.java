package com.informatorio.TrabajoPracticoSpring.service.listaReproduccion;

import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;

import java.util.List;
import java.util.UUID;

public interface ListaReproduccionService {
    List<ListaReproduccion>BuscarPorIds(List<UUID>ids);
}
