package com.informatorio.TrabajoPracticoSpring.mapper.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;
import com.informatorio.TrabajoPracticoSpring.service.genero.GeneroService;
import com.informatorio.TrabajoPracticoSpring.service.listaReproduccion.ListaReproduccionService;

import java.util.Collection;
import java.util.List;

public class CancionMapper {
    private static GeneroService generoService;
    private static ListaReproduccionService listaReproduccionService;
    public static Cancion mapToCancion(CancionDto cancionDto, Cancion cancion){
        cancion.setNombre(cancionDto.getNombre());
        cancion.setRanking(cancionDto.getRanking());
        if(!cancionDto.getGeneros().isEmpty()){
            cancion.setGeneros(generoService.BuscarPorIds(cancionDto.getGeneros()));
        }
        if(!cancionDto.getListaReproduccion().isEmpty()){
            cancion.setListasReproduccion(listaReproduccionService.BuscarPorIds(cancionDto.getListaReproduccion()));
        }
        cancion.setDuracion(cancionDto.getDuracion());
        cancion.setArtista(cancionDto.getArtista());
        cancion.setAlbum(cancionDto.getAlbum());
        return cancion;
    }

    public List<Cancion> mapToCanciones(Collection<CancionDto> cancionDtos, Collection<Cancion> canciones){
        for (CancionDto cancionDto: cancionDtos){
            canciones.add(
                    mapToCancion(cancionDto,new Cancion())
            );
        }
        return (List<Cancion>)canciones;
    }

    public static CancionDto mapToCancionDto(Cancion cancion, CancionDto cancionDto ){
        cancionDto.setId(cancion.getId());
        cancionDto.setNombre(cancion.getNombre());
        cancionDto.setRanking(cancion.getRanking());
        for (Genero genero: cancion.getGeneros()){
            cancionDto.getGeneros().add(genero.getId());
        }
        for(ListaReproduccion listaReproduccion: cancion.getListasReproduccion()){
            cancionDto.getListaReproduccion().add(cancion.getId());
        }
        cancionDto.setDuracion(cancion.getDuracion());
        cancionDto.setArtista(cancion.getArtista());
        cancionDto.setAlbum(cancion.getAlbum());
        return cancionDto;
    }
    public List<CancionDto> mapToCancionDto(Collection<Cancion> canciones, Collection<CancionDto> cancionDtos){
        for (Cancion cancion: canciones){
            cancionDtos.add(
                    mapToCancionDto(cancion,new CancionDto())
            );
        }
        return (List<CancionDto>)cancionDtos;
    }


}
