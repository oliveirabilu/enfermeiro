package com.exampleenfermeiro.record;

import com.exampleenfermeiro.entities.Enfermeiro;
import com.exampleenfermeiro.enums.Laboratorio;
import com.exampleenfermeiro.enums.Via;

import java.time.LocalDate;

public record DadosSaidaDTO(
        Long id,
        String nome,
        Via via,
        String lote,
        Integer quantidade,
        LocalDate validade,
        Laboratorio laboratorio
) {
    public DadosSaidaDTO (Enfermeiro novoenfermeiro){
        this(novoenfermeiro.getId(),
                novoenfermeiro.getNome(),
                novoenfermeiro.getVia(),
                novoenfermeiro.getLote(),
                novoenfermeiro.getQuantidade(),
                novoenfermeiro.getValidade(),
                novoenfermeiro.getLaboratorio());
    }
}
