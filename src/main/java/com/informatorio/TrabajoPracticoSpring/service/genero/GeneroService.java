package com.informatorio.TrabajoPracticoSpring.service.genero;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;

import java.util.List;
import java.util.UUID;

public interface GeneroService {
    List<Genero> BuscarPorIds(List<UUID>ids);
}
