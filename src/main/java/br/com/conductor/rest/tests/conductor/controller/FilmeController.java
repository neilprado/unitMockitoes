package br.com.conductor.rest.tests.conductor.controller;

import br.com.conductor.rest.tests.conductor.model.Filme;
import br.com.conductor.rest.tests.conductor.repository.FilmeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private FilmeRepository dao;

    @PostMapping("/create")
    public Filme adicionar(Filme filme){
        return dao.save(filme);
    }
}
