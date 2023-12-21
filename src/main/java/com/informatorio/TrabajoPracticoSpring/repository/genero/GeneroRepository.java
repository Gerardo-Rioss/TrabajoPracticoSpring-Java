package com.informatorio.TrabajoPracticoSpring.repository.genero;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, UUID>{
    Genero buscarPorNombre(String nombre);
}
