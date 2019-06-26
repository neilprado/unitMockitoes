package br.com.conductor.rest.tests.conductor.controller;

import br.com.conductor.rest.tests.conductor.model.Cliente;
import br.com.conductor.rest.tests.conductor.model.Filme;
import br.com.conductor.rest.tests.conductor.model.Locacao;
import br.com.conductor.rest.tests.conductor.repository.ClienteRepository;
import br.com.conductor.rest.tests.conductor.repository.FilmeRepository;
import br.com.conductor.rest.tests.conductor.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {
    @Autowired
    LocacaoRepository locacaoDAO;

    @Autowired
    ClienteRepository clienteDAO;

    @Autowired
    FilmeRepository filmeDAO;

    public Locacao criarLocacao(@RequestBody Locacao locacao) throws ResourceNotFoundException {
        Cliente cliente = clienteDAO.findById(locacao.getCliente().getId()).orElseThrow(
                () -> new ResourceNotFoundException("Usuário não encontrado"));

        return locacaoDAO.save(locacao);
    }

}
