package br.com.conductor.rest.tests.conductor.controller;

import br.com.conductor.rest.tests.conductor.model.Filme;
import br.com.conductor.rest.tests.conductor.repository.FilmeRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private FilmeRepository dao;

    @PostMapping("/create")
    public Filme adicionar(@RequestBody Filme filme) {
        return dao.save(filme);
    }

    @GetMapping("/list")
    public List<Filme> listarTodos() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Filme getFilme(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        return dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado"));
    }

    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable(value = "id") Long id, @RequestBody Filme filme) {
        Filme f = dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado"));
        f.setNome(filme.getNome());
        f.setQuantidade(filme.getQuantidade());
        f.setValor(filme.getValor());
        return dao.save(f);
    }
}
