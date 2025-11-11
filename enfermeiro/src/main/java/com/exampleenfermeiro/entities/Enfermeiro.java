package com.exampleenfermeiro.entities;

import com.exampleenfermeiro.enumm.Laboratorio;
import com.exampleenfermeiro.enumm.Via;

import java.time.LocalDate;

public class Enfermeiro {
    private Long id;
    private String nome;
    private Via via;
    private String lote;
    private Integer quantidade;
    private LocalDate validade;
    private Laboratorio laboratorio;
}
