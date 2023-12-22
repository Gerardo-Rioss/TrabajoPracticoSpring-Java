package com.informatorio.TrabajoPracticoSpring.repository.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CancionRepository extends JpaRepository<Cancion, UUID> {

    List<Cancion> findCancionesByNombreCancionContainingAndGeneroAndArtistaAndAlbum(
            String nombre, String genero, String artista, String album);

    List<Cancion> findCancionesByNombreCancionContaining(String nombre);

    List<Cancion> findCancionesByGenero(String genero);

    List<Cancion> findCancionesByArtista(String artista);

    List<Cancion> findCancionesByAlbum(String album);

    @Query(value = "SELECT * FROM Cancion ORDER BY RAND()", nativeQuery = true)
    List<Cancion> findCanciones();

}
