package com.informatorio.TrabajoPracticoSpring.bootstrap;
import com.informatorio.TrabajoPracticoSpring.dominio.*;
import com.informatorio.TrabajoPracticoSpring.repository.artista.ArtistaRepository;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.repository.genero.GeneroRepository;
import com.informatorio.TrabajoPracticoSpring.repository.listaReproduccion.ListaReproduccionRepository;
import com.informatorio.TrabajoPracticoSpring.repository.usuario.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private ArtistaRepository artistaRepository;
    private CancionRepository cancionRepository;
    private GeneroRepository generoRepository;
    private ListaReproduccionRepository listaReproduccionRepository;
    private UsuarioRepository usuarioRepository;


    @Override
    public void run(String... args) throws Exception {
        cargarUsuario();
        cargarArtista();
        cargarGenero();
        cargarCancion();
        cargarListaReproduccion();
    }

    private void cargarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Gerardo Rios");
        usuario.setNombreUsuario("gerardrioss");
        //usuario.setListaReproduccion(List.of(listaReproduccionRepository.findById(1L).get()));
        usuarioRepository.save(usuario);
    }
    private void cargarArtista(){
        Artista artista= new Artista();
        artista.setId(1L);
        artista.setNombre("Marcos Antonio Solis");
        //artista.setCanciones(List.of(cancionRepository.findById(1L).get()));
        artistaRepository.save(artista);

    }
    private void cargarGenero(){
        Genero genero = new Genero();
        genero.setId(1L);
        genero.setNombre("Romantico");
        //genero.setCanciones(List.of(cancionRepository.findById(1L).get()));
        generoRepository.save(genero);

    }
    private void cargarCancion(){
        Cancion cancion = new Cancion();
        cancion.setId(1L);
        cancion.setNombre("Tu carcel");
        cancion.setRanking(5);
        //cancion.setGeneros(List.of(generoRepository.findById(1L).get()));
        //cancion.setListasReproduccion(List.of(listaReproduccionRepository.findById(1L).get()));
        cancion.setDuracion(5.40);
        //cancion.setArtista(artistaRepository.findById(1L).get());
        cancion.setAlbum("Sueños");
        cancionRepository.save(cancion);
    }
    private void cargarListaReproduccion(){
        ListaReproduccion listaReproduccion= new ListaReproduccion();
        listaReproduccion.setId(1L);
        //listaReproduccion.setUsuario(usuarioRepository.findById(1L).get());
        listaReproduccion.setNombre("Favoritos");
        //listaReproduccion.setCanciones(List.of(cancionRepository.findById(1L).get()));
        listaReproduccion.setRepetirAlFinalizar(Boolean.FALSE);
        listaReproduccion.setAleatoria(Boolean.FALSE);
        listaReproduccion.setPublica(Boolean.TRUE);
        listaReproduccionRepository.save(listaReproduccion);
    }

}


