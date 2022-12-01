package com.example.orderapi.controller;

import com.example.orderapi.entity.Cliente;
import com.example.orderapi.entity.Produto;
import com.example.orderapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order/v1")
public class Controller {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){



}
    @GetMapping(path = "/order/v1/"){
        Cliente cliente

    }
}

