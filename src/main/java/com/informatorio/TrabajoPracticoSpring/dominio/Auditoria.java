package com.informatorio.TrabajoPracticoSpring.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "auditoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auditoria {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36,columnDefinition = "varchar(36)",updatable = false,nullable = false)
    private UUID id;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario ;

    @Column(name = "accion")
    private String accion;

}
