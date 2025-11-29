package com.exampleenfermeiro.controller;

import com.exampleenfermeiro.entities.Enfermeiro;
import com.exampleenfermeiro.record.DadosAtualizarDTO;
import com.exampleenfermeiro.record.DadosEntradaDTO;
import com.exampleenfermeiro.record.DadosSaidaDTO;
import com.exampleenfermeiro.service.EnfermeiroService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

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
        var uri=uriBuilder.path("/enfermeiros/{id}").buildAndExpand(novoenfermeiro.id()).toUri();
        return ResponseEntity.created(uri).body(novoenfermeiro);
    }
    @GetMapping
    public ResponseEntity<List<DadosSaidaDTO>> lista(){
        var listar=enfermeiroService.listarEnfermeiros();
        return ResponseEntity.ok(listar);
        }
    @PutMapping
    public ResponseEntity<Void> atualizar(@RequestBody @Valid DadosAtualizarDTO dados){
        enfermeiroService.atualizarenfermeiros(dados);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        enfermeiroService.apagarenfermeiro(id);
        return ResponseEntity.noContent().build();
    }
    }

