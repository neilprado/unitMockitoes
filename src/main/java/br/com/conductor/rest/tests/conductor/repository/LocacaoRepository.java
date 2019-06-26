package br.com.conductor.rest.tests.conductor.repository;

import br.com.conductor.rest.tests.conductor.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
