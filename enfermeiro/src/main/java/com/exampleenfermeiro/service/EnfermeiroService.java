package com.exampleenfermeiro.service;

import com.exampleenfermeiro.entities.Enfermeiro;
import com.exampleenfermeiro.record.DadosEntradaDTO;
import com.exampleenfermeiro.repositories.EnfermeiroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnfermeiroService {
    EnfermeiroRepository enfermeiroRepository;

    public EnfermeiroService(EnfermeiroRepository enfermeiroRepository) {
        this.enfermeiroRepository = enfermeiroRepository;
    }
    //Post
    @Transactional
    public DadosSaidaDTO salvarEnfermeiro(DadosEntradaDTO dados) {
        enfermeiroRepository.save(new Enfermeiro(dados));
    }
}
