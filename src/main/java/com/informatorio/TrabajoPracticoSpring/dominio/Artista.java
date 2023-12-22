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
    @GeneratedValue(strategy = GenerationType.UUID)
    @GenericGenerator(name = "UUID")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36,columnDefinition = "varchar(36)",updatable = false,nullable = false)
    private UUID id;

    @Column(name="nombreArtista", nullable = false)
    private String nombreArtista;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "artista", cascade = CascadeType.MERGE)
    private List<Cancion> canciones = new ArrayList<>();

}
