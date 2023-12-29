package com.informatorio.TrabajoPracticoSpring.service.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;
import com.informatorio.TrabajoPracticoSpring.mapper.cancion.CancionMapper;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.service.artista.ArtistaService;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;
import com.informatorio.TrabajoPracticoSpring.service.genero.GeneroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CancionServiceImpl implements CancionService {
    private  CancionRepository cancionRepository;
    private GeneroService generoService;
    private ArtistaService artistaService;


    @Override
    public Cancion buscarPorNombre(String nombre) {
        for (Cancion cancion: cancionRepository.findAll())
            if (cancion.getNombreCancion().equals(nombre)) return cancion;
        return null;
    }

    @Override
    public List<Cancion> BuscarPorIds(List<Long> ids) {

        List<Cancion> canciones = new ArrayList<>() ;
        for (Long id : ids){
            canciones.add(cancionRepository.findById(id).orElseThrow());
        }
        return canciones;

    }


    @Override
    public List<CancionDto> listarCanciones() {
        return CancionMapper.mapToCancionDtos(cancionRepository.findAll(),new ArrayList<>());
    }


}
