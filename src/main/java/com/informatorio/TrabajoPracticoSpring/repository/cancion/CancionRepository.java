package com.informatorio.TrabajoPracticoSpring.repository.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CancionRepository extends JpaRepository<Cancion, Long> {
}
