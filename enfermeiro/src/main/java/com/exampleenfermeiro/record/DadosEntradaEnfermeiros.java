package com.exampleenfermeiro.record;

import java.time.LocalDate;

public record DadosEntradaEnfermeiros(
        String nome,
        Via via,
        String lote,
        Integer quantidade,
        LocalDate validade,
        Laboratorio laboratorio) {
}
