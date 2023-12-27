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
@Table(name = "cancion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cancion{

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @GenericGenerator(name = "UUID")
//    @JdbcTypeCode(SqlTypes.CHAR)
//    @Column(length = 36,columnDefinition = "varchar(36)",updatable = false,nullable = false)
//    private UUID id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="nombreCancion", nullable = false)
    private String nombreCancion;

    @Column(name = "ranking")
    private Integer ranking;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "cancion_genero", joinColumns = @JoinColumn(name = "cancion_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id"))
    private List<Genero> generos = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "listaReproduccion_cancion", joinColumns = @JoinColumn(name = "cancion_id"),
            inverseJoinColumns = @JoinColumn(name = "listaReproduccion_id"))
    private List<ListaReproduccion> listasReproduccion = new ArrayList<>();

    @Column(name = "duracion")
    private Double duracion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Artista artista ;

    @Column(name="album")
    private String album;
}
