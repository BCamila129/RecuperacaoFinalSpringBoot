package com.example.orderapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double precoIndividual;
    private Integer quantidade;
    @OneToMany
    List<Cliente> clienteList;

    public Produto(){

    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Produto(String nome, Double precoIndividual, Integer quantidade,List<Cliente> clienteList) {
        this.nome = nome;
        this.precoIndividual = precoIndividual;
        this.quantidade = quantidade;
        this.clienteList = clienteList;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual(Double precoIndividual) {
        this.precoIndividual = precoIndividual;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
