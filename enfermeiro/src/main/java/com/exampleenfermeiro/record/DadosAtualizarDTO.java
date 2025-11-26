package com.exampleenfermeiro.record;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarDTO(
        @NotNull
        Long id,
        String nome,
        String lote
) {
}
