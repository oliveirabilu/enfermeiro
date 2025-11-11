package com.exampleenfermeiro.entities;

import com.exampleenfermeiro.enumm.Laboratorio;
import com.exampleenfermeiro.enumm.Via;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name = "TB_ENFERMEIRO")
@Data
@NoArgsConstructor
public class Enfermeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;
    private Integer quantidade;
    private LocalDate validade;
    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;
}
