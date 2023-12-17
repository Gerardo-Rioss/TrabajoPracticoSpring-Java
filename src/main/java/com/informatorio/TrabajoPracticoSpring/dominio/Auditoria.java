package com.informatorio.TrabajoPracticoSpring.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;



@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auditoria {
    private LocalDateTime creadoEn;
    private String creadoPor;
    private LocalDateTime actualizadoEn;
    private String actualizadoPor;

}
