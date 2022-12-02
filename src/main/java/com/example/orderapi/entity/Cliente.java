package com.example.orderapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private String cep;
    private String numero;
    private String formaPagamento;
    private Integer parcelas;
    private Double valorTotal;
    @ManyToMany
    List<Pedido> list;

    public Cliente() {

    }

    public Cliente(String endereco, String cep, String numero, String formaPagamento, Integer parcelas, Double valorTotal, List<Pedido> list) {
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
        this.list = list;
    }

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep() {
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

    public List<Pedido> getList() {
        return list;
    }

    public void setList(List<Pedido> list) {
        this.list = list;
    }
}