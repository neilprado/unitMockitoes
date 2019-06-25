package br.com.conductor.rest.tests.conductor.repository;

import br.com.conductor.rest.tests.conductor.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
