package com.informatorio.TrabajoPracticoSpring.service.genero;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.repository.genero.GeneroRepository;
import com.informatorio.TrabajoPracticoSpring.service.genero.GeneroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
@AllArgsConstructor
public class GeneroServiceImpl implements GeneroService {
    private GeneroRepository generoRepository;


    @Override
    public Genero buscarPorNombre(String nombre) {
        for (Genero genero: generoRepository.findAll())
            if (genero.getNombreGenero().equals(nombre)) return genero;
        return null;
    }

    @Override
    public List<Genero> BuscarPorIds(List<Long> ids) {
        List<Genero> generos = new ArrayList<>() ;
        for (Long id : ids){
            generos.add(generoRepository.findById(id).orElseThrow());
        }
        return generos;
    }
}
