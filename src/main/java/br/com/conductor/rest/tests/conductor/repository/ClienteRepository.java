package br.com.conductor.rest.tests.conductor.repository;

import br.com.conductor.rest.tests.conductor.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
