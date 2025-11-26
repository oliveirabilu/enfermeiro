package com.exampleenfermeiro.controller;

import com.exampleenfermeiro.record.DadosEntradaDTO;
import com.exampleenfermeiro.service.EnfermeiroService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enfermeiros")
public class EnfermeiroController {
    EnfermeiroService enfermeiroService;

    public EnfermeiroController(EnfermeiroService enfermeiroService) {
        this.enfermeiroService = enfermeiroService;
    }

    @PostMapping
    public void mostrar(@RequestBody @Valid DadosEntradaDTO dados ) {
        enfermeiroService.salvarEnfermeiro(dados);

    }
}
