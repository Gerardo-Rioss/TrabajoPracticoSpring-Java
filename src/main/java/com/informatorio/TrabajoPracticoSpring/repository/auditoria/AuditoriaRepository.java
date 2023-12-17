package com.informatorio.TrabajoPracticoSpring.repository.auditoria;

import com.informatorio.TrabajoPracticoSpring.dominio.Artista;
import com.informatorio.TrabajoPracticoSpring.dominio.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository
public interface AuditoriaRepository extends JpaRepository<Auditoria, UUID> {
}
