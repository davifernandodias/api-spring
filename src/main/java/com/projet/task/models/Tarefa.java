package com.projet.task.models;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeDatarefa;
    private Double custoDaTarefa;
    private LocalDate dataLimiteDaTarefa;
    private Long ordemDeSequenciaDaTarefa;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDatarefa() {
        return nomeDatarefa;
    }

    public void setNomeDatarefa(String nomeDatarefa) {
        this.nomeDatarefa = nomeDatarefa;
    }

    public Double getCustoDaTarefa() {
        return custoDaTarefa;
    }

    public void setCustoDaTarefa(Double custoDaTarefa) {
        this.custoDaTarefa = custoDaTarefa;
    }

    public LocalDate getDataLimiteDaTarefa() {
        return dataLimiteDaTarefa;
    }

    public void setDataLimiteDaTarefa(LocalDate dataLimiteDaTarefa) {
        this.dataLimiteDaTarefa = dataLimiteDaTarefa;
    }

    public Long getOrdemDeSequenciaDaTarefa() {
        return ordemDeSequenciaDaTarefa;
    }

    public void setOrdemDeSequenciaDaTarefa(Long ordemDeSequenciaDaTarefa) {
        this.ordemDeSequenciaDaTarefa = ordemDeSequenciaDaTarefa;
    }
}
