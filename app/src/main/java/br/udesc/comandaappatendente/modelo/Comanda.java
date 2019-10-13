package br.udesc.comandaappatendente.modelo;

import java.util.List;

import br.udesc.comandaappatendente.util.ComandaStatus;

public class Comanda {

    private String idComanda;
    private String mesa;
    private String nomeCliente;
    private ComandaStatus status;
    private List<Produto> produtos;


    public String getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(String idComanda) {
        this.idComanda = idComanda;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ComandaStatus getStatus() {
        return status;
    }

    public void setStatus(ComandaStatus status) {
        this.status = status;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
