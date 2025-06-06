package main.java.br.com.sentinela.geolocalizacao;

import main.java.br.com.sentinela.utils.CoberturaAtiva;

public class Estado extends UnidadeGeografica {
    private String sigla;

    public String getSigla() {return sigla;}
    public void setSigla(String sigla) {this.sigla = sigla;}

    /**
     * Construtor da classe Estado com os dados obrigatórios.
     *
     * @param idUnidadeGeografica Identificador único do estado.
     * @param nome Nome do estado.
     * @param nivelRiscoAtual Nível de risco atual do estado.
     * @param mediaRisco Média de risco do estado.
     * @param areaTotal Área total do estado em km².
     * @param areaTotalMapeada Área total mapeada do estado em km².
     * @param coberturaAtiva Cobertura ativa do estado (SIM, NAO, PARCIALMENTE).
     * @param sigla Sigla oficial do estado (opcional).
     */
    public Estado(int idUnidadeGeografica, String nome, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, String sigla) {
        super(idUnidadeGeografica, nome, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.sigla = sigla;
    }

    /**
     * Construtor da classe Estado com todos os dados.
     *
     * @param idUnidadeGeografica Identificador único do estado.
     * @param nome Nome do estado.
     * @param descricao Descrição do estado.
     * @param nivelRiscoAtual Nível de risco atual do estado.
     * @param mediaRisco Média de risco do estado.
     * @param areaTotal Área total do estado em km².
     * @param areaTotalMapeada Área total mapeada do estado em km².
     * @param coberturaAtiva Cobertura ativa do estado (SIM, NAO, PARCIALMENTE).
     * @param sigla Sigla oficial do estado (opcional).
     */
    public Estado(int idUnidadeGeografica, String nome, String descricao, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, String sigla) {
        super(idUnidadeGeografica, nome, descricao, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.sigla = sigla;
    }

    /**
     * Gera um resumo detalhado da unidade, incluindo sigla.
     *
     * @return String com ID, nome, risco e sigla do estado.
     */
    @Override
    public String gerarResumo() {
        return "ID: " + getIdUnidadeGeografica() + " | Nome: " + getNome() + " | Risco atual: " + getNivelRiscoAtual() + " | Sigla: " + sigla;
    }

    /**
     * Simula a distribuição de recursos emergenciais no estado.
     * Exibe uma mensagem no console com o nome e ID do estado.
     */
    public void distribuirRecursosEmergenciais() {
        System.out.println("Recursos emergenciais distribuídos no estado: " + getNome() + " (ID: " + getIdUnidadeGeografica() + ")");
    }
}
