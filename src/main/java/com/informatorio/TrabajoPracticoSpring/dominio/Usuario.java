package com.informatorio.TrabajoPracticoSpring.dominio;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario extends Auditoria {

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @GenericGenerator(name = "UUID")
//    @JdbcTypeCode(SqlTypes.CHAR)
//    @Column(length = 36,columnDefinition = "varchar(36)",updatable = false,nullable = false)
//    private UUID id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="nombreUsuario", nullable = false)
    private String nombreUsuario;

    @Column(name="usuario", nullable = false)
    private String usuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<ListaReproduccion> listaReproduccion = new ArrayList<>();


}
