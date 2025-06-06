package main.java.br.com.sentinela.geolocalizacao;

import main.java.br.com.sentinela.utils.CoberturaAtiva;

public class Cidade extends UnidadeGeografica {
    private Estado idEstado;
    private String sigla;

    public int getEstado() {return idEstado.getIdUnidadeGeografica();}

    public String getSigla() {return sigla;}
    public void setSigla(String sigla) {this.sigla = sigla;}

    /**
     * Construtor da classe Cidade com todos os atributos obrigatórios
     * @param idUnidadeGeografica
     * @param nome
     * @param nivelRiscoAtual
     * @param mediaRisco
     * @param areaTotal
     * @param areaTotalMapeada
     * @param coberturaAtiva
     * @param idEstado
     */
    public Cidade(int idUnidadeGeografica, String nome, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, Estado idEstado) {
        super(idUnidadeGeografica, nome, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.idEstado = idEstado;
    }

    /**
     * Construtor da classe Cidade com todos os atributos
     * @param idUnidadeGeografica
     * @param nome
     * @param descricao
     * @param nivelRiscoAtual
     * @param mediaRisco
     * @param areaTotal
     * @param areaTotalMapeada
     * @param coberturaAtiva
     * @param idEstado
     * @param sigla
     */
    public Cidade(int idUnidadeGeografica, String nome, String descricao, double nivelRiscoAtual, double mediaRisco, double areaTotal, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, Estado idEstado, String sigla) {
        super(idUnidadeGeografica, nome, descricao, nivelRiscoAtual, mediaRisco, areaTotal, areaTotalMapeada, coberturaAtiva);
        this.idEstado = idEstado;
        this.sigla = sigla;
    }

    /**
     * Gera um resumo da cidade com tipo, nome, risco atual e sigla.
     *
     * @return Texto formatado com os principais dados da cidade.
     */
    @Override
    public String gerarResumo() {
        return super.gerarResumo() + " | Sigla: " + sigla;
    }

    /**
     * Simula o acionamento de autoridades municipais em caso de emergência.
     * Exibe uma mensagem no console com o nome e ID da cidade.
     */
    public void acionarAutoridadesMunicipais() {
        System.out.println("Autoridades municipais acionadas para cidade: " + getNome() + " (ID: " + getIdUnidadeGeografica() + ")");
    }
}