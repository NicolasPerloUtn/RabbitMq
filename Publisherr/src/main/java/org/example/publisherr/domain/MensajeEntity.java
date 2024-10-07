package org.example.publisherr.domain;

import jakarta.persistence.*;
import lombok.Data;

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
}
