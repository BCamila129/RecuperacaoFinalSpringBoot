package com.example.orderapi.calculo;

import com.example.orderapi.entity.Cliente;

public class Calculo {

    public Cliente calculado(Cliente cliente) {
        Double numeroParcelas;
        if (cliente.getParcelas() > 10) {
            numeroParcelas = Double.valueOf(cliente.getParcelas() * 0.01);
            cliente.setValorTotal(numeroParcelas);
            return cliente;
        } else if (cliente.getParcelas() > 20) {
            numeroParcelas = Double.valueOf((cliente.getParcelas() * 0.02));
            cliente.setValorTotal(numeroParcelas);
        }
        return cliente;
    }
}


