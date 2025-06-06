package main.java.br.com.sentinela.geolocalizacao;

import main.java.br.com.sentinela.utils.CoberturaAtiva;

public class UnidadeGeografica {
    private int idUnidadeGeografica;
    private String nome;
    private String descricao;
    private double nivelRiscoAtual;
    private double mediaRisco;
    private double areaTotal;
    private double areaTotalMapeada;
    private CoberturaAtiva coberturaAtiva;

    public int getIdUnidadeGeografica() { return idUnidadeGeografica; }
    public void setIdUnidadeGeografica(int idUnidadeGeografica) { this.idUnidadeGeografica = idUnidadeGeografica; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getNivelRiscoAtual() { return nivelRiscoAtual; }
    public void setNivelRiscoAtual(double nivelRiscoAtual) { this.nivelRiscoAtual = nivelRiscoAtual; }

    public double getMediaRisco() { return mediaRisco; }
    public void setMediaRisco(double mediaRisco) { this.mediaRisco = mediaRisco; }

    public double getAreaTotal() { return areaTotal; }
    public void setAreaTotal(double areaTotal) { this.areaTotal = areaTotal; }

    public double getAreaTotalMapeada() { return areaTotalMapeada; }
    public void setAreaTotalMapeada(double areaTotalMapeada) { this.areaTotalMapeada = areaTotalMapeada; }

    /**
     * Construtor da classe UnidadeGeografica com todos os atributos obrigatórios.
     * @param idUnidadeGeografica
     * @param nome
     * @param nivelRiscoAtual
     * @param mediaRisco
     * @param areaTotal
     * @param areaTotalMapeada
     * @param coberturaAtiva
     */
    public UnidadeGeografica(int idUnidadeGeografica, String nome, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva) {
        this.idUnidadeGeografica = idUnidadeGeografica;
        this.nome = nome;
        this.nivelRiscoAtual = nivelRiscoAtual;
        this.mediaRisco = mediaRisco;
        this.areaTotal = areaTotal;
        this.areaTotalMapeada = areaTotalMapeada;
        this.coberturaAtiva = coberturaAtiva;
    }

    /**
     * Construtor da classe UnidadeGeografica com todos os atributos.
     * @param idUnidadeGeografica
     * @param nome
     * @param descricao
     * @param nivelRiscoAtual
     * @param mediaRisco
     * @param areaTotal
     * @param areaTotalMapeada
     * @param coberturaAtiva
     */
    public UnidadeGeografica(int idUnidadeGeografica, String nome, String descricao, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva) {
        this.idUnidadeGeografica = idUnidadeGeografica;
        this.nome = nome;
        this.descricao = descricao;
        this.nivelRiscoAtual = nivelRiscoAtual;
        this.mediaRisco = mediaRisco;
        this.areaTotal = areaTotal;
        this.areaTotalMapeada = areaTotalMapeada;
        this.coberturaAtiva = coberturaAtiva;
    }

    /**
     * Gera um resumo contendo ID, nome e risco atual da unidade.
     *
     * @return String com informações resumidas da unidade.
     */
    public String gerarResumo() {
        return "ID: " + idUnidadeGeografica + " | Nome: " + nome + " | Risco atual: " + nivelRiscoAtual;
    }
}