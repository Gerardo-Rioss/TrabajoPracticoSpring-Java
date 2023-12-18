package com.informatorio.TrabajoPracticoSpring.dominio;
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
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario extends Auditoria {

    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native")
    private Long id;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="nombreUsuario", nullable = false)
    private String nombreUsuario;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "usuario", cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<ListaReproduccion> listaReproduccion = new ArrayList<>();


}
