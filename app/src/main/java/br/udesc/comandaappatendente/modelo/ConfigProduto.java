package br.udesc.comandaappatendente.modelo;

import java.util.ArrayList;
import java.util.List;

public class ConfigProduto {

    private long idConfigProduto;

    private String campoConfig;

    private Produto produto;

    private String idProduto;//@ForeignKey

    private List<ConfigValue> values = new ArrayList<>();

    public long getIdConfigProduto() {
        return idConfigProduto;
    }

    public void setIdConfigProduto(long idConfigProduto) {
        this.idConfigProduto = idConfigProduto;
    }

    public String getCampoConfig() {
        return campoConfig;
    }

    public void setCampoConfig(String campoConfig) {
        this.campoConfig = campoConfig;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public List<ConfigValue> getValues() {
        return values;
    }

    public void setValues(List<ConfigValue> values) {
        this.values = values;
    }
}
