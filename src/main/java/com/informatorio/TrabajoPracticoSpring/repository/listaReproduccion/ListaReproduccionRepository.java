package com.informatorio.TrabajoPracticoSpring.repository.listaReproduccion;

import com.informatorio.TrabajoPracticoSpring.dominio.ListaReproduccion;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
@Repository
public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, UUID>{
}
