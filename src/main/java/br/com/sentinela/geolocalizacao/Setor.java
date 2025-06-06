package main.java.br.com.sentinela.geolocalizacao;

import main.java.br.com.sentinela.utils.CoberturaAtiva;

public class Setor extends UnidadeGeografica {
    private Regiao idRegiao;
    private double densidadeDemografica;
    private String observacoes;

    //Getters & Setters
    public int getRegiao() {return idRegiao.getIdUnidadeGeografica();}

    public double getDensidadeDemografica() {return densidadeDemografica;}
    public void setDensidadeDemografica(double densidadeDemografica) {this.densidadeDemografica = densidadeDemografica;}

    public String getObservacoes() {return observacoes;}
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}

    /**
     * Construtor da classe Setor com os dados obrigatórios.
     *
     * @param idUnidadeGeografica Identificador da unidade geográfica.
     * @param nome Nome do setor.
     * @param nivelRiscoAtual Nível de risco atual do setor.
     * @param mediaRisco Média de risco do setor.
     * @param areaTotal Área total do setor em km².
     * @param areaTotalMapeada Área total mapeada do setor em km².
     * @param coberturaAtiva Cobertura ativa no setor.
     * @param idRegiao Região associada ao setor.
     */
    public Setor(int idUnidadeGeografica, String nome, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, Regiao idRegiao) {
        super(idUnidadeGeografica, nome, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.idRegiao = idRegiao;
    }

    /**
     * Construtor da classe Setor com todos os dados.
     *
     * @param idUnidadeGeografica Identificador da unidade geográfica.
     * @param nome Nome do setor.
     * @param descricao Descrição do setor.
     * @param nivelRiscoAtual Nível de risco atual do setor.
     * @param mediaRisco Média de risco do setor.
     * @param areaTotal Área total do setor em km².
     * @param areaTotalMapeada Área total mapeada do setor em km².
     * @param coberturaAtiva Cobertura ativa no setor.
     * @param idRegiao Região associada ao setor.
     */
    public Setor(int idUnidadeGeografica, String nome, String descricao, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, Regiao idRegiao, double densidadeDemografica, String observacoes) {
        super(idUnidadeGeografica, nome, descricao, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.idRegiao = idRegiao;
        this.densidadeDemografica = densidadeDemografica;
        this.observacoes = observacoes;
    }

    /**
     * Gera um resumo completo do setor, incluindo densidade e observações.
     *
     * @return Texto formatado com nome, risco e detalhes do setor.
     */
    @Override
    public String gerarResumo() {
        return super.gerarResumo() +
               " | Densidade Demográfica: " + densidadeDemografica + " hab/km²" +
               " | Observações: " + (observacoes != null ? observacoes : "Nenhuma observação registrada.");
    }

    /**
     * Emite um alerta imediato simulando uma situação de emergência.
     * Exibe o nome e ID do setor.
     */
    public void enviarAlertaImediato() {
        System.out.println("ALERTA IMEDIATO emitido no setor: " + getNome() + " (ID: " + getIdUnidadeGeografica() + ")");
    }

    /**
     * Estima a população do setor com base na densidade demográfica e área.
     *
     * @param setor  Objeto setor a ser analisado.
     * @param regiao Objeto região onde o setor está inserido.
     */
    public void estimarPopulacao(Setor setor, Regiao regiao) {
        System.out.println("Estimativa de população no setor: " + getAreaTotal() * densidadeDemografica + " habitantes. (" + setor.getNome() + " em " + regiao.getNome() + ")");
    }
}