package br.com.conductor.rest.tests.conductor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private Long id;
    private List<Filme> filmes = new ArrayList();
    private Cliente cliente;
    private Date dataLocacao;
    private Date dataRetorno;
    private double valor;

    public Locacao() {}

    public Locacao(List<Filme> filmes, Cliente cliente, Date dataLocacao, Date dataRetorno, double valor) {
        this.filmes = filmes;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dataRetorno = dataRetorno;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
