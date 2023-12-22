package com.informatorio.TrabajoPracticoSpring.mapper.artista;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dto.artista.ArtistaDto;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;


import java.util.Collection;
import java.util.List;

public class ArtistaMapper {
    private static CancionService cancionService;
    public static Artista mapToArtista(ArtistaDto artistaDto, Artista artista){
        artista.setNombreArtista(artistaDto.getNombreArtista());
        if (!artistaDto.getCanciones().isEmpty()){
            artista.setCanciones(cancionService.BuscarPorIds(artistaDto.getCanciones()));
        }
        return artista;
    }

    public List<Artista> mapToArtistas(Collection<ArtistaDto> artistaDtos, Collection<Artista> artistas){
        for (ArtistaDto artistaDto: artistaDtos){
            artistas.add(
                    mapToArtista(artistaDto, new Artista())
            );
        }
        return (List<Artista>) artistas;
    }
    public static ArtistaDto mapToArtistaDto( Artista artista, ArtistaDto artistaDto){
        artistaDto.setId(artista.getId());
        artistaDto.setNombreArtista(artista.getNombreArtista());
        for (Cancion cancion: artista.getCanciones()){
            artistaDto.getCanciones().add(artista.getId());
        }
        return artistaDto;
    }

    public static List<ArtistaDto> mapToArtistaDtos(Collection<Artista> artistas, Collection<ArtistaDto> artistaDtos){
        for (Artista artista:artistas){
            artistaDtos.add(
                    mapToArtistaDto(artista,new ArtistaDto())
            );
        }
        return (List<ArtistaDto>) artistaDtos;
    }



}
