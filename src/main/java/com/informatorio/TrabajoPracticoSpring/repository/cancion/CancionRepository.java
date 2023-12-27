package com.informatorio.TrabajoPracticoSpring.repository.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CancionRepository extends JpaRepository<Cancion, Long> {



}
