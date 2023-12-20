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
@Table(name = "ListaReproduccion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListaReproduccion extends Auditoria {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36,columnDefinition = "varchar(36)",updatable = false,nullable = false)
    private UUID id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario ;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @ManyToMany
    @JoinTable(name = "listaReproduccion_cancion", joinColumns = @JoinColumn(name = "listaReproduccion_id"),
            inverseJoinColumns = @JoinColumn(name = "cancion_id"))
    private List<Cancion> canciones = new ArrayList<>();

    @Column(name = "repetir_al_finalizar")
    private Boolean repetir;

    @Column(name = "aleatoria")
    private Boolean aleatoria;

    @Column(name = "publica")
    private Boolean publica;


}
