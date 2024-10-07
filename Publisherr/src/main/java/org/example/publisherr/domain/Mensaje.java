package org.example.publisherr.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Mensaje implements Serializable {
    private static final long serialVersionUID = 1L;

    private String asunto;

    private String mensaje;
}
