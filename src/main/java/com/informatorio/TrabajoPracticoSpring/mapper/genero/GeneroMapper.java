package com.informatorio.TrabajoPracticoSpring.mapper.genero;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dto.genero.GeneroDto;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;

import java.util.Collection;
import java.util.List;

public class GeneroMapper {
    private static CancionService cancionService;


    public static Genero mapToGenero(GeneroDto generoDto, Genero genero) {
        genero.setNombre(generoDto.getNombre());
        if (!generoDto.getCanciones().isEmpty()) {
            genero.setCanciones(cancionService.BuscarPorIds(generoDto.getCanciones()));
        }
        return genero;
    }

    public List<Genero> mapToGeneros(Collection<GeneroDto> generoDtos, Collection<Genero> generos) {
        for (GeneroDto generoDto : generoDtos) {
            generos.add(
                    mapToGenero(generoDto, new Genero())
            );
        }
        return (List<Genero>) generos;

    }
    public static GeneroDto mapToGeneroDto(Genero genero, GeneroDto generoDto){
        generoDto.setId(genero.getId());
        generoDto.setNombre(genero.getNombre());
        for (Cancion cancion: genero.getCanciones()){
            generoDto.getCanciones().add(cancion.getId());
        }
        return generoDto;
    }
    public List<GeneroDto> mapToGeneroDtos(Collection<Genero> generos, Collection<GeneroDto> generoDtos){
        for (Genero genero: generos){
            generoDtos.add(
                    mapToGeneroDto(genero,new GeneroDto())
            );
        }
        return (List<GeneroDto>)generoDtos;
    }
}