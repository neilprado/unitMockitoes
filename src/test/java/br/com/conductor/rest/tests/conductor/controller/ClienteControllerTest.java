package br.com.conductor.rest.tests.conductor.controller;

import br.com.conductor.rest.tests.conductor.model.Cliente;
import br.com.conductor.rest.tests.conductor.repository.ClienteRepository;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ClienteControllerTest {
    protected ClienteRepository dao;

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Test
    public void adicionarTeste(){
        Cliente c = new Cliente("Neil", "neil@neil.com");

        error.checkThat(c.getNome(), CoreMatchers.is(CoreMatchers.equalTo("Neil")));
        error.checkThat(c.getEmail(), CoreMatchers.is(CoreMatchers.equalTo("neil@neil.com")));

    }
}
