package main.java.br.com.sentinela.historico;

import main.java.br.com.sentinela.geolocalizacao.Setor;

import java.time.LocalDate;

public class HistoricoRisco extends Historico{
    private double nivelRisco;
    private String justificativa;
    private double mediaRisco;

    //Getters e Setters
    public double getNivelRisco() {return nivelRisco;}
    public void setNivelRisco(double nivelRisco) {this.nivelRisco = nivelRisco;}

    public String getJustificativa() {return justificativa;}
    public void setJustificativa(String justificativa) {this.justificativa = justificativa;}

    public double getMediaRisco() {return mediaRisco;}
    public void setMediaRisco(double mediaRisco) {this.mediaRisco = mediaRisco;}

    //Métodos

    /**
     * Construtor completo para registrar dados de risco com justificativa.
     *
     * @param idHistorico ID do histórico
     * @param idSetor setor associado
     * @param dataRegistro data do registro
     * @param nivelRisco nível de risco registrado
     * @param justificativa justificativa da avaliação de risco
     * @param mediaRisco média de risco calculada
     */
    public HistoricoRisco(int idHistorico, Setor idSetor, LocalDate dataRegistro, double nivelRisco, String justificativa, double mediaRisco) {
        super(idHistorico, idSetor, dataRegistro);
        this.nivelRisco = nivelRisco;
        this.justificativa = justificativa;
        this.mediaRisco = mediaRisco;
    }

    /**
     * Construtor alternativo para registrar dados de risco sem justificativa.
     *
     * @param idHistorico ID do histórico
     * @param idSetor setor associado
     * @param dataRegistro data do registro
     * @param nivelRisco nível de risco registrado
     * @param mediaRisco média de risco calculada
     */
    public HistoricoRisco(int idHistorico, Setor idSetor, LocalDate dataRegistro, double nivelRisco, double mediaRisco) {
        super(idHistorico, idSetor, dataRegistro);
        this.nivelRisco = nivelRisco;
        this.mediaRisco = mediaRisco;
    }
}
