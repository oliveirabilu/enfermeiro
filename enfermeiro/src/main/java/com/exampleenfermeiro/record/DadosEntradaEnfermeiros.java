package com.exampleenfermeiro.record;

import com.exampleenfermeiro.enumm.Laboratorio;
import com.exampleenfermeiro.enumm.Via;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadosEntradaEnfermeiros(
        @NotBlank
        String nome,
        Via via,
        @NotBlank
        String lote,
        Integer quantidade,
        @Future
        LocalDate validade,
        Laboratorio laboratorio) {
}
