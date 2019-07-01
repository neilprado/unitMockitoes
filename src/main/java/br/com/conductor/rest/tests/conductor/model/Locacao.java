package br.com.conductor.rest.tests.conductor.model;

import java.util.Date;

public class Locacao {
    private Long id;
    private Filme filme;
    private Cliente cliente;
    private Date dataLocacao;
    private Date dataRetorno;
    private double valor;

    public Locacao(Filme filmes, Cliente cliente, Date dataLocacao, Date dataRetorno, double valor) {
        this.filme = filmes;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.dataRetorno = dataRetorno;
        this.valor = valor;
    }

    public Locacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
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
