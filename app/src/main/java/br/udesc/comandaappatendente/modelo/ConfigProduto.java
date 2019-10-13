package br.udesc.comandaappatendente.modelo;


public class ConfigProduto {

    private String idConfigProduto;
    private String nome;
    private float acrescimo;


    public String getIdConfigProduto() {
        return idConfigProduto;
    }

    public void setIdConfigProduto(String idConfigProduto) {
        this.idConfigProduto = idConfigProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }
}
