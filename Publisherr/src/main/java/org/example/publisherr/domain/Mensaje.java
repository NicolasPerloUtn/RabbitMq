package org.example.publisherr.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Mensaje implements Serializable {
    private static final long serialVersionUID = 1L;

    private String asunto;

    private String mensaje;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

}
