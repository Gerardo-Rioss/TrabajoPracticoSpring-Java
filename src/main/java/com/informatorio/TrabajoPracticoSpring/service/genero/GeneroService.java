package com.informatorio.TrabajoPracticoSpring.service.genero;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;

import java.util.List;
import java.util.UUID;

public interface GeneroService {
    Genero buscarPorNombre(String nombre);
    List<Genero> BuscarPorIds(List<Long>ids);
}
