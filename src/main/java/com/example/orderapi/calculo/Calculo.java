package com.example.orderapi.calculo;

import com.example.orderapi.entity.Cliente;

public class Calculo {

    public Cliente calculado(Cliente cliente) {
        Double numeroParcelas;
        if (cliente.getParcelas() > 10) {
            numeroParcelas = Double.valueOf(cliente.getParcelas() * (10 / 100));
            cliente.setValorTotal(numeroParcelas);
            return cliente;
        } else if (cliente.getParcelas() > 20) {
            numeroParcelas = Double.valueOf((cliente.getParcelas() * (20 / 100)));
            cliente.setValorTotal(numeroParcelas);
            return cliente;
        }
//        else if(numeroParcelas = (cliente.getParcelas() != "Cartao")){
//            return "Não é possível prosseguir";
//        }
//

        return cliente;
    }


}
