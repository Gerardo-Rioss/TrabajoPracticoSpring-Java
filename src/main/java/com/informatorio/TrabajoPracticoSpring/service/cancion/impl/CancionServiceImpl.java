package com.informatorio.TrabajoPracticoSpring.service.cancion.impl;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;
import com.informatorio.TrabajoPracticoSpring.mapper.cancion.CancionMapper;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
@AllArgsConstructor
public class CancionServiceImpl implements CancionService {
    private  CancionRepository cancionRepository;


    @Override
    public Cancion buscarPorNombre(String nombre) {
        for (Cancion cancion: cancionRepository.findAll())
            if (cancion.getNombreCancion().equals(nombre)) return cancion;
        return null;
    }

    @Override
    public List<Cancion> BuscarPorIds(List<UUID> ids) {

        List<Cancion> canciones = new ArrayList<>() ;
        for (UUID id : ids){
            canciones.add(cancionRepository.findById(id).orElseThrow());
        }
        return canciones;

    }

    @Override
    public List<CancionDto> busquedaAleatoria(String titulo, String genero, String artista, String album) {

            if (titulo != null && genero != null && artista != null && album != null) {
                // Búsqueda aleatoria basada en título, género, artista y álbum
                return CancionMapper.mapToCancionDtos((cancionRepository.findCancionesByNombreCancionContainingAndGeneroAndArtistaAndAlbum(titulo, genero, artista, album)),new ArrayList<>());
            } else if (titulo != null && genero == null && artista == null && album == null) {
                // Búsqueda aleatoria por título
                return CancionMapper.mapToCancionDtos(cancionRepository.findCancionesByNombreCancionContaining(titulo),new ArrayList<>());
            } else if (genero != null && titulo == null && artista == null && album == null) {
                // Búsqueda aleatoria por género
                return CancionMapper.mapToCancionDtos((cancionRepository.findCancionesByGenero(genero)),new ArrayList<>());
            } else if (artista != null && titulo == null && genero == null && album == null) {
                // Búsqueda aleatoria por artista
                return CancionMapper.mapToCancionDtos((cancionRepository.findCancionesByArtista(artista)),new ArrayList<>());
            } else if (album != null && titulo == null && genero == null && artista == null) {
                // Búsqueda aleatoria por álbum
                return CancionMapper.mapToCancionDtos((cancionRepository.findCancionesByAlbum(album)),new ArrayList<>());
            } else {
                // Búsqueda general aleatoria
                return CancionMapper.mapToCancionDtos((cancionRepository.findCanciones()),new ArrayList<>());
            }

    }
}
