package com.exampleenfermeiro.controller;

import com.exampleenfermeiro.entities.Enfermeiro;
import com.exampleenfermeiro.record.DadosEntradaEnfermeiros;
import com.exampleenfermeiro.repositories.EnfermeiroRepository;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<Enfermeiro> listar(){
      return enfermeiroRepository.findAll();

    }
}
