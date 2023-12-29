package com.informatorio.TrabajoPracticoSpring.bootstrap;
import com.informatorio.TrabajoPracticoSpring.dominio.*;
import com.informatorio.TrabajoPracticoSpring.repository.artista.ArtistaRepository;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.repository.genero.GeneroRepository;
import com.informatorio.TrabajoPracticoSpring.repository.listaReproduccion.ListaReproduccionRepository;
import com.informatorio.TrabajoPracticoSpring.repository.usuario.UsuarioRepository;
import com.informatorio.TrabajoPracticoSpring.service.artista.ArtistaService;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;
import com.informatorio.TrabajoPracticoSpring.service.genero.GeneroService;
import com.informatorio.TrabajoPracticoSpring.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private ArtistaRepository artistaRepository;
    private CancionRepository cancionRepository;
    private GeneroRepository generoRepository;
    private ListaReproduccionRepository listaReproduccionRepository;
    private UsuarioRepository usuarioRepository;
    private GeneroService generoService;
    private ArtistaService artistaService;
    private UsuarioService usuarioService;
    private CancionService cancionService;


    @Override
    public void run(String... args) throws Exception {
        cargarUsuario();
        cargarArtista();
        cargarGenero();
        cargarCancion();
        cargarListaReproduccion();
    }

    private void cargarArtista(){
        Artista artista1= new Artista();
        Artista artista2= new Artista();
        Artista artista3= new Artista();
        Artista artista4= new Artista();
        artista1.setNombreArtista("The Beatles");
        artista2.setNombreArtista("Michael Jackson");
        artista3.setNombreArtista("Blondie");
        artista4.setNombreArtista("The Zutons");
        artistaRepository.saveAll(List.of(artista1,artista2,artista3,artista4));

    }

    private void cargarGenero(){
        Genero genero1 = new Genero();
        Genero genero2 = new Genero();
        Genero genero3 = new Genero();
        genero1.setNombreGenero("Rock");
        genero2.setNombreGenero("Pop");
        genero3.setNombreGenero("Rock alternativo");
        generoRepository.saveAll(List.of(genero1,genero2,genero3));

    }

    private void cargarUsuario(){
        Usuario usuario1 = new Usuario();
        usuario1.setNombreUsuario("Gerardo Rios");
        usuario1.setUsuario("gerardrioss");
        Usuario usuario2=new Usuario();
        usuario2.setNombreUsuario("Raul Rios");
        usuario2.setUsuario("phantera");
        usuarioRepository.saveAll(List.of(usuario1,usuario2));
    }


    private void cargarCancion(){
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();
        Cancion cancion3 = new Cancion();
        Cancion cancion4 = new Cancion();

        cancion1.setNombreCancion("Eleanor Rigby");
        cancion1.setRanking(5);
        cancion1.setDuracion(540);
        cancion1.setAlbum("Revolver (1966)");
        cancion1.setGeneros(List.of(generoService.buscarPorNombre("Rock")));
        cancion1.setArtista((artistaService.buscarPorNombre("The Beatles")));

        cancion2.setNombreCancion("Billie Jean");
        cancion2.setRanking(4);
        cancion2.setDuracion(440);
        cancion2.setAlbum("Thriller (1982)");
        cancion2.setGeneros(List.of(generoService.buscarPorNombre("Pop")));
        cancion2.setArtista((artistaService.buscarPorNombre("Michael Jackson")));

        cancion3.setNombreCancion("Maria");
        cancion3.setRanking(4);
        cancion3.setDuracion(315);
        cancion3.setAlbum("Parallel Lines (1978)");
        cancion3.setGeneros(List.of(generoService.buscarPorNombre("Pop")));
        cancion3.setArtista((artistaService.buscarPorNombre("Blondie")));

        cancion4.setNombreCancion("Valerie");
        cancion4.setRanking(2);
        cancion4.setDuracion(255);
        cancion4.setAlbum("Tired of Hanging Around (2004)");
        cancion4.setGeneros(List.of(generoService.buscarPorNombre("Pop")));
        cancion4.setArtista((artistaService.buscarPorNombre("The Zutons")));
        cancionRepository.saveAll(List.of(cancion1,cancion2,cancion3,cancion4));


    }
    private void cargarListaReproduccion(){
        ListaReproduccion listaReproduccion1= new ListaReproduccion();
        ListaReproduccion listaReproduccion2= new ListaReproduccion();


        listaReproduccion1.setUsuario(usuarioService.buscarPorNombre("Raul Rios"));
        listaReproduccion1.setCanciones(List.of(cancionService.buscarPorNombre("Eleanor Rigby"),cancionService.buscarPorNombre("Billie Jean")));
        listaReproduccion1.setNombreLista("Lista Reproducción 1");
        listaReproduccion1.setRepetir(Boolean.FALSE);
        listaReproduccion1.setAleatoria(Boolean.FALSE);
        listaReproduccion1.setPublica(Boolean.TRUE);
        listaReproduccionRepository.save(listaReproduccion1);

        listaReproduccion2.setUsuario(usuarioService.buscarPorNombre("Gerardo Rios"));
        listaReproduccion2.setCanciones(List.of(cancionService.buscarPorNombre("Maria"),cancionService.buscarPorNombre("Valerie")));
        listaReproduccion2.setNombreLista("Lista Reproducción 2");
        listaReproduccion2.setRepetir(Boolean.FALSE);
        listaReproduccion2.setAleatoria(Boolean.FALSE);
        listaReproduccion2.setPublica(Boolean.TRUE);
        listaReproduccionRepository.save(listaReproduccion2);
    }

}


