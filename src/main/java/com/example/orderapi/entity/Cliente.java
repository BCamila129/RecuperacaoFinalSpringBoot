package com.example.orderapi.entity;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String endereco;

    @Column(nullable = false, unique = true, length = 10)
    private String cep;

    @Column(nullable = false, unique = true, length = 10)
    private String numero;

    @Column(nullable = false, unique = true, length = 15)
    private String formaPagamento;
    private Integer parcelas;
    private Double valorTotal;

    public Cliente() {

    }

    public Cliente(String endereco, String cep, String numero, String formaPagamento, Integer parcelas, Double valorTotal) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}