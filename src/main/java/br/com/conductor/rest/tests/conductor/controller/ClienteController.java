package br.com.conductor.rest.tests.conductor.controller;

import br.com.conductor.rest.tests.conductor.model.Cliente;
import br.com.conductor.rest.tests.conductor.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository dao;

    @PostMapping("/create")
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return dao.save(cliente);
    }

    @GetMapping("/list")
    public List<Cliente> listarTodos() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        return dao.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cliente não encontrado"));
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable(value = "id") Long id, @RequestBody Cliente cliente)
            throws ResourceNotFoundException {
        Cliente c = dao.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cliente não encontrado"));
        c.setNome(cliente.getNome());
        c.setEmail(cliente.getEmail());
        return dao.save(c);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable(value = "id") Long id) {
        dao.deleteById(id);
    }
}
