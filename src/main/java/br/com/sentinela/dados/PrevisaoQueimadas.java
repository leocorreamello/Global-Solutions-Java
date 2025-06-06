package main.java.br.com.sentinela.dados;

import main.java.br.com.sentinela.geolocalizacao.Setor;

import java.time.LocalDate;

public class PrevisaoQueimadas extends DadosOperacionais{
    public enum AcuraciaPrevista {
        ACERTOU, ERROU, INCONCLUSIVO
    }

    private LocalDate dataEstimativa;
    private double chanceEstimada; // (5,2)
    private String metodoPrevisao;
    private String descricaoAnalise;
    private AcuraciaPrevista acuraciaPrevista;

    //Getters e Setters
    public LocalDate getDataEstimativa() {return dataEstimativa;}
    public void setDataEstimativa(LocalDate dataEstimativa) {this.dataEstimativa = dataEstimativa;}

    public double getChanceEstimada() {return chanceEstimada;}
    public void setChanceEstimada(double chanceEstimada) {this.chanceEstimada = chanceEstimada;}

    public String getMetodoPrevisao() {return metodoPrevisao;}

    public void setMetodoPrevisao(String metodoPrevisao) {this.metodoPrevisao = metodoPrevisao;}

    public String getDescricaoAnalise() {return descricaoAnalise;}
    public void setDescricaoAnalise(String descricaoAnalise) {this.descricaoAnalise = descricaoAnalise;}

    public AcuraciaPrevista getAcuraciaPrevista() {return acuraciaPrevista;}
    public void setAcuraciaPrevista(AcuraciaPrevista acuraciaPrevista) {this.acuraciaPrevista = acuraciaPrevista;}

    //Métodos

    /**
     * Construtor completo para registrar uma previsão de queimada com análise detalhada.
     *
     * @param idOperacional ID da entrada operacional
     * @param idSetor setor associado
     * @param dataRegistro data do registro
     * @param dataEstimativa data estimada para ocorrência da queimada
     * @param chanceEstimada probabilidade estimada da queimada (em %)
     * @param metodoPrevisao método utilizado para prever a queimada
     * @param descricaoAnalise descrição da análise realizada
     * @param acuraciaPrevista resultado da previsão após validação
     */
    public PrevisaoQueimadas(int idOperacional, Setor idSetor, LocalDate dataRegistro, LocalDate dataEstimativa, double chanceEstimada, String metodoPrevisao, String descricaoAnalise, AcuraciaPrevista acuraciaPrevista) {
        super(idOperacional, idSetor, dataRegistro);
        this.dataEstimativa = dataEstimativa;
        this.chanceEstimada = chanceEstimada;
        this.metodoPrevisao = metodoPrevisao;
        this.descricaoAnalise = descricaoAnalise;
        this.acuraciaPrevista = acuraciaPrevista;
    }

    /**
     * Construtor básico para registrar uma previsão de queimada com dados essenciais.
     *
     * @param idOperacional ID da entrada operacional
     * @param idSetor setor associado
     * @param dataRegistro data do registro
     * @param dataEstimativa data estimada para ocorrência da queimada
     * @param chanceEstimada probabilidade estimada da queimada (em %)
     */
    public PrevisaoQueimadas(int idOperacional, Setor idSetor, LocalDate dataRegistro, LocalDate dataEstimativa, double chanceEstimada) {
        super(idOperacional, idSetor, dataRegistro);
        this.dataEstimativa = dataEstimativa;
        this.chanceEstimada = chanceEstimada;
    }
}
