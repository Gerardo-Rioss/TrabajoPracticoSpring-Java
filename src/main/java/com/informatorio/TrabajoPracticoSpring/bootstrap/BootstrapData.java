package com.informatorio.TrabajoPracticoSpring.bootstrap;


import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.repository.artista.ArtistaRepository;
import com.informatorio.TrabajoPracticoSpring.repository.auditoria.AuditoriaRepository;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.repository.genero.GeneroRepository;
import com.informatorio.TrabajoPracticoSpring.repository.listaReproduccion.ListaReproduccionRepository;
import com.informatorio.TrabajoPracticoSpring.repository.usuario.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private ArtistaRepository artistaRepository;
    private AuditoriaRepository auditoriaRepository;
    private CancionRepository cancionRepository;
    private GeneroRepository generoRepository;
    private ListaReproduccionRepository listaReproduccionRepository;
    private UsuarioRepository usuarioRepository;


    @Override
    public void run(String... args) throws Exception {

    }

    private void cargarArtista(){
        Artista artista= new Artista();
        artista.setId(UUID.randomUUID());
        artista.setNombre("Artista 1");
        


    }
}

