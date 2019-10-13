package br.udesc.comandaappatendente.modelo;

public class ConfigValue {

    private long idCompoConfig;

    private String config;

    private float preco;

    private boolean disponibilidade;

    private ConfigProduto configProduto;

    private long idConfigProduto;

    public long getIdCompoConfig() {
        return idCompoConfig;
    }

    public void setIdCompoConfig(long idCompoConfig) {
        this.idCompoConfig = idCompoConfig;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public ConfigProduto getConfigProduto() {
        return configProduto;
    }

    public void setConfigProduto(ConfigProduto configProduto) {
        this.configProduto = configProduto;
    }

    public long getIdConfigProduto() {
        return idConfigProduto;
    }

    public void setIdConfigProduto(long idConfigProduto) {
        this.idConfigProduto = idConfigProduto;
    }
}
