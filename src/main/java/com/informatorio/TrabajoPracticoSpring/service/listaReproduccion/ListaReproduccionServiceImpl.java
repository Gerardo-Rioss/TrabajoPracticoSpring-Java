package com.informatorio.TrabajoPracticoSpring.service.listaReproduccion;

import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.repository.listaReproduccion.ListaReproduccionRepository;
import com.informatorio.TrabajoPracticoSpring.service.listaReproduccion.ListaReproduccionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
@AllArgsConstructor
public class ListaReproduccionServiceImpl implements ListaReproduccionService {
    private ListaReproduccionRepository listaReproduccionRepository;

    @Override
    public List<ListaReproduccion> BuscarPorIds(List<Long> ids) {
        List<ListaReproduccion> listaReproducciones = new ArrayList<>() ;
        for (Long id : ids){
            listaReproducciones.add(listaReproduccionRepository.findById(id).orElseThrow());
        }
        return listaReproducciones;
    }
}
