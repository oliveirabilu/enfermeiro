package com.exampleenfermeiro.record;

import com.exampleenfermeiro.enumm.Laboratorio;
import com.exampleenfermeiro.enumm.Via;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadosEntradaEnfermeiros(
        @NotBlank
        String nome,
        @Enumerated
        Via via,
        @NotBlank
        String lote,
        Integer quantidade,
        @Future
        LocalDate validade,
        @Enumerated
        Laboratorio laboratorio) {
}
