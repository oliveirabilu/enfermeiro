package com.exampleenfermeiro.service;

import com.exampleenfermeiro.entities.Enfermeiro;
import com.exampleenfermeiro.record.DadosAtualizarDTO;
import com.exampleenfermeiro.record.DadosEntradaDTO;
import com.exampleenfermeiro.record.DadosSaidaDTO;
import com.exampleenfermeiro.repositories.EnfermeiroRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnfermeiroService {
    EnfermeiroRepository enfermeiroRepository;

    public EnfermeiroService(EnfermeiroRepository enfermeiroRepository) {
        this.enfermeiroRepository = enfermeiroRepository;
    }
    //Post
    @Transactional
    public DadosSaidaDTO salvarEnfermeiro(DadosEntradaDTO dados) {
        var novoenfermeiro=enfermeiroRepository.save(new Enfermeiro(dados));
        return new DadosSaidaDTO(novoenfermeiro);
    }

    public List<DadosSaidaDTO> listarEnfermeiros() {
        return enfermeiroRepository.findAll()
                .stream()
                .map(DadosSaidaDTO::new)
                .toList();
    }
    @Transactional
    public void atualizarenfermeiros(@Valid DadosAtualizarDTO dados) {
        var atualize=enfermeiroRepository.getReferenceById(dados.id());
        atualize.atualizarinformacoes(dados);
    }
    @Transactional
    public void apagarenfermeiro(Long id) {
        enfermeiroRepository.deleteById(id);

    }
}
