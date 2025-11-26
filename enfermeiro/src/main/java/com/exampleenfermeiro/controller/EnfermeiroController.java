package com.exampleenfermeiro.controller;

import com.exampleenfermeiro.record.DadosEntradaDTO;
import com.exampleenfermeiro.record.DadosSaidaDTO;
import com.exampleenfermeiro.service.EnfermeiroService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/enfermeiros")
public class EnfermeiroController {
    EnfermeiroService enfermeiroService;

    public EnfermeiroController(EnfermeiroService enfermeiroService) {
        this.enfermeiroService = enfermeiroService;
    }

    @PostMapping
    public ResponseEntity<DadosSaidaDTO> mostrar(@RequestBody @Valid DadosEntradaDTO dados,
                                                 UriComponentsBuilder uriBuilder) {
        var novoenfermeiro=enfermeiroService.salvarEnfermeiro(dados);
        var uri=uriBuilder.path("/enfermeiros{id}").buildAndExpand(novoenfermeiro.id()).toUri();
        return ResponseEntity.created(uri).body(novoenfermeiro);
    }
}
