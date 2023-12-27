package com.informatorio.TrabajoPracticoSpring.service.artista;


import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import com.informatorio.TrabajoPracticoSpring.repository.artista.ArtistaRepository;
import com.informatorio.TrabajoPracticoSpring.service.artista.ArtistaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ArtistaServiceImpl implements ArtistaService {
    private ArtistaRepository artistaRepository;


    @Override
    public Artista buscarPorNombre(String nombre) {
        for (Artista artista: artistaRepository.findAll())
            if (artista.getNombreArtista().equals(nombre)) return artista;
        return null;
    }
}
