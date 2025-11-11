package com.exampleenfermeiro.controller;

import com.exampleenfermeiro.entities.Enfermeiro;
import com.exampleenfermeiro.record.DadosEntradaEnfermeiros;
import com.exampleenfermeiro.repositories.EnfermeiroRepository;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enfermeiros")
public class EnfermeiroController {
    EnfermeiroRepository enfermeiroRepository;

    public EnfermeiroController(EnfermeiroRepository enfermeiroRepository) {
        this.enfermeiroRepository = enfermeiroRepository;
    }

    @PostMapping
    @Transactional
    public  void cadastrar (@RequestBody @Valid DadosEntradaEnfermeiros dados){
        enfermeiroRepository.save(new Enfermeiro(dados));
    }
}
