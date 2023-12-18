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
@Table(name = "artista")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Artista{
    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native")
    private Long id;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "artista", cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Cancion> canciones = new ArrayList<>();

}
