package com.example.orderapi.controller;
import com.example.orderapi.entity.Cliente;
import com.example.orderapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/order/v1")
public class Controller {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @ResponseBody
    public Cliente salvar(@RequestBody Cliente cliente) {
        Cliente clienteSaved = clienteRepository.save(cliente);
        return clienteSaved;
    }
    @GetMapping
    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id) {
        Optional<Cliente> clienteReturned = clienteRepository.findById(id);
        return clienteReturned;
    }

    @DeleteMapping("{id}")
    public String deleteClienteById(@PathVariable Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            clienteRepository.deleteById(id);
            return "Cliente" + id + " apagado com sucesso";
        } else {
            return "Cliente não encontrado!";
        }
    }

    @PutMapping("update/{id}")
    public String updateClienteById(@PathVariable Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente i = clienteOptional.get();
            clienteRepository.save(i);
            return "Cliente" + id + " salvo com sucesso!";
        } else {
            return "Cliente não encontrado";
        }
    }
}