package com.example.orderapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double precoIndividual;
    private Double precoTotal;
    private Integer quantidade;

    public Pedido() {

    }

    public Pedido(String nome, Double precoIndividual, Double precoTotal, Integer quantidade) {
        this.nome = nome;
        this.precoIndividual = precoIndividual;
        this.precoTotal = precoTotal;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public Double getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual() {
        this.precoIndividual = precoIndividual;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal() {
        this.precoTotal = precoTotal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade() {
        this.quantidade = quantidade;
    }
}