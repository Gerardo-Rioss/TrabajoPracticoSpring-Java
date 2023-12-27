package com.informatorio.TrabajoPracticoSpring.repository.usuario;

import com.informatorio.TrabajoPracticoSpring.dominio.Genero;
import com.informatorio.TrabajoPracticoSpring.dominio.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
