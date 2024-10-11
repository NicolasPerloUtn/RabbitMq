package org.example.publisherr.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "mensaje")
public class MensajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String asunto;

    @Column
    private String mensaje;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

}
