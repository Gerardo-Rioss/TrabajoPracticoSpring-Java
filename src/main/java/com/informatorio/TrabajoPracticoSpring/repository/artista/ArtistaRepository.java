package com.informatorio.TrabajoPracticoSpring.repository.artista;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;
@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
