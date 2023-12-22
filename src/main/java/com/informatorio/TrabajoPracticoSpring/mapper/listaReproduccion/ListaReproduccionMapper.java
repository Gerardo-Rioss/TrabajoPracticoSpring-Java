package com.informatorio.TrabajoPracticoSpring.mapper.listaReproduccion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.dto.listaReproduccionDto.ListaReproduccionDto;
import com.informatorio.TrabajoPracticoSpring.dto.usuario.UsuarioDto;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;

import java.util.Collection;
import java.util.List;

public class ListaReproduccionMapper {
    private static CancionService cancionService;

    public static ListaReproduccion mapToListaReproduccion(ListaReproduccionDto listaReproduccionDto, ListaReproduccion listaReproduccion){
        listaReproduccion.setUsuario(listaReproduccionDto.getUsuario());
        listaReproduccion.setNombreLista(listaReproduccionDto.getNombreLista());
        if (!listaReproduccionDto.getCanciones().isEmpty()){
            listaReproduccion.setCanciones(cancionService.BuscarPorIds(listaReproduccionDto.getCanciones()));
        }
        listaReproduccion.setRepetir(listaReproduccionDto.getRepetir());
        listaReproduccion.setAleatoria(listaReproduccionDto.getAleatoria());
        listaReproduccion.setPublica(listaReproduccionDto.getPublica());
        return listaReproduccion;
    }

    public List<ListaReproduccion> mapToListaReproducciones(Collection<ListaReproduccionDto> listaReproduccionDtos, Collection<ListaReproduccion> listaReproducciones){
        for (ListaReproduccionDto listaReproduccionDto: listaReproduccionDtos){
            listaReproducciones.add(
                    mapToListaReproduccion(listaReproduccionDto,new ListaReproduccion())
            );
        }
        return (List<ListaReproduccion>)listaReproducciones;
    }
    public static ListaReproduccionDto mapToListaReproduccionDto(ListaReproduccion listaReproduccion, ListaReproduccionDto listaReproduccionDto){
        listaReproduccionDto.setId(listaReproduccion.getId());
        listaReproduccionDto.setUsuario(listaReproduccion.getUsuario());
        listaReproduccionDto.setNombreLista(listaReproduccion.getNombreLista());
        for (Cancion cancion: listaReproduccion.getCanciones()){
            listaReproduccionDto.getCanciones().add(listaReproduccion.getId());
        }
        listaReproduccionDto.setRepetir(listaReproduccion.getRepetir());
        listaReproduccionDto.setAleatoria(listaReproduccion.getAleatoria());
        listaReproduccionDto.setPublica(listaReproduccion.getPublica());
        return listaReproduccionDto;
    }
    public List<ListaReproduccionDto> mapToListaReproduccionDtos(Collection<ListaReproduccion> listaReproducciones, Collection<ListaReproduccionDto> listaReproduccionDtos){
        for (ListaReproduccion listaReproduccion: listaReproducciones){
            listaReproduccionDtos.add(
                    mapToListaReproduccionDto(listaReproduccion,new ListaReproduccionDto())
            );
        }
        return (List<ListaReproduccionDto>)listaReproduccionDtos;
    }
}
