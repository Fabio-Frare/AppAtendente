package br.udesc.comandaappatendente.modelo;


import java.util.List;

import br.udesc.comandaappatendente.util.ProdutoStatus;

public class Produto {

    private String idProduto;
    private String nome;
    private String ingredientes;
    private float precoBase;
    private boolean disponibilidade;
    private ProdutoStatus status;
    private Categoria categoria;
    private List<ConfigProduto> configProduto;

    public Produto() {

    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public ProdutoStatus getStatus() {
        return status;
    }

    public void setStatus(ProdutoStatus status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<ConfigProduto> getConfigProduto() {
        return configProduto;
    }

    public void setConfigProduto(List<ConfigProduto> configProduto) {
        this.configProduto = configProduto;
    }

}
