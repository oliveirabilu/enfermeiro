package com.exampleenfermeiro.entities;

import com.exampleenfermeiro.enums.Laboratorio;
import com.exampleenfermeiro.enums.Via;
import com.exampleenfermeiro.record.DadosEntradaDTO;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "TB_ENFERMEIRO")
public class Enfermeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;
    private Integer quantidade;
    private LocalDate validade;
    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;

    public Enfermeiro(DadosEntradaDTO dados) {
        this.nome= dados.nome();
        this.via=dados.via();
        this.lote= dados.lote();
        this.quantidade= dados.quantidade();
        this.validade=dados.validade();
        this.laboratorio=dados.laboratorio();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Via getVia() {
        return via;
    }
    public void setVia(Via via) {
        this.via = via;
    }
    public String getLote() {
        return lote;
    }
    public void setLote(String lote) {
        this.lote = lote;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public LocalDate getValidade() {
        return validade;
    }
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
