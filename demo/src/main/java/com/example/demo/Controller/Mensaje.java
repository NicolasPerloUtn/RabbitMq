package com.example.demo.Controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Mensaje {
    private String message;

    private String asunto;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

}
