package main.java.br.com.sentinela.geolocalizacao;

import main.java.br.com.sentinela.utils.CoberturaAtiva;

public class Regiao extends UnidadeGeografica {
    private Cidade idCidade;

    //Getters & Setters
    public int getIdCidade() {return idCidade.getIdUnidadeGeografica();}

    /**
     * Construtor da classe Regiao com os dados obrigatórios.
     *
     * @param idUnidadeGeografica Identificador da unidade geográfica.
     * @param nome Nome da região.
     * @param nivelRiscoAtual Nível de risco atual da região.
     * @param mediaRisco Média de risco da região.
     * @param areaTotal Área total da região em km².
     * @param areaTotalMapeada Área total mapeada da região em km².
     * @param coberturaAtiva Cobertura ativa na região.
     * @param idCidade Cidade associada à região.
     */
    public Regiao(int idUnidadeGeografica, String nome, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, Cidade idCidade) {
        super(idUnidadeGeografica, nome, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.idCidade = idCidade;
    }

    /**
     * Construtor da classe Regiao com todos os dados.
     *
     * @param idUnidadeGeografica Identificador da unidade geográfica.
     * @param nome Nome da região.
     * @param descricao Descrição da região.
     * @param nivelRiscoAtual Nível de risco atual da região.
     * @param mediaRisco Média de risco da região.
     * @param areaTotal Área total da região em km².
     * @param areaTotalMapeada Área total mapeada da região em km².
     * @param coberturaAtiva Cobertura ativa na região.
     * @param idCidade Cidade associada à região.
     */
    public Regiao(int idUnidadeGeografica, String nome, String descricao, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, Cidade idCidade) {
        super(idUnidadeGeografica, nome, descricao, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.idCidade = idCidade;
    }

    /**
     * Gera um resumo da região com nome e risco atual.
     *
     * @return Texto formatado com os principais dados da região.
     */
    @Override
    public String gerarResumo() {
        return super.gerarResumo();
    }

    /**
     * Simula a priorização do mapeamento para essa região.
     * Exibe uma mensagem com nome e ID da região.
     */
    public void priorizarMapeamento() {
        System.out.println("Priorizando mapeamento na região: " + getNome() + " (ID: " + getIdUnidadeGeografica() + ")");
    }
}