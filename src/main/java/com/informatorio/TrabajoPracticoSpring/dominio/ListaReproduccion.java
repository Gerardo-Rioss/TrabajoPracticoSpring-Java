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
public class ListaReproduccion extends Auditoria {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36,columnDefinition = "varchar(36)",updatable = false,nullable = false)
    private UUID id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario ;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "listaReproduccion", cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Cancion> canciones = new ArrayList<>();

    @Column(name = "repetir_al_finalizar")
    private Boolean repetirAlFinalizar;

    @Column(name = "aleatoria")
    private Boolean aleatoria;

    @Column(name = "publica")
    private Boolean publica;


}
