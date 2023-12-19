package com.informatorio.TrabajoPracticoSpring.mapper.artista;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dto.artista.ArtistaDto;


import java.util.Collection;
import java.util.List;

public class artistaMapper {
    public static Artista mapToArtista(ArtistaDto artistaDto, Artista artista){
        artista.setNombre(artistaDto.getNombre());
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
        artistaDto.setNombre(artista.getNombre());
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
