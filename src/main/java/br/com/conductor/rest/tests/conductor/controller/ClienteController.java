package br.com.conductor.rest.tests.conductor.controller;

import br.com.conductor.rest.tests.conductor.model.Cliente;
import br.com.conductor.rest.tests.conductor.repository.ClienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteRepository dao;

    @PostMapping
    public Cliente adicionar(Cliente cliente){
        return dao.save(cliente);
    }
}
