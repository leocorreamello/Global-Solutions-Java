package main.java.br.com.sentinela.historico;

import main.java.br.com.sentinela.geolocalizacao.Setor;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

import java.time.LocalDate;

public class HistoricoGeral extends Historico {

    private double areaTotalMapeada;
    private CoberturaAtiva coberturaAtiva;
    private boolean houveEvento;
    private String tipoEvento;
    private String descricaoEvento;

    //Getters e Setters
    public double getAreaTotalMapeada() {return areaTotalMapeada;}
    public void setAreaTotalMapeada(double areaTotalMapeada) {this.areaTotalMapeada = areaTotalMapeada;}

    public CoberturaAtiva getCoberturaAtiva() {return coberturaAtiva;}
    public void setCoberturaAtiva(CoberturaAtiva coberturaAtiva) {this.coberturaAtiva = coberturaAtiva;}

    public boolean isHouveEvento() {return houveEvento;}
    public void setHouveEvento(boolean houveEvento) {this.houveEvento = houveEvento;}

    public String getTipoEvento() {return tipoEvento;}
    public void setTipoEvento(String tipoEvento) {this.tipoEvento = tipoEvento;}

    public String getDescricaoEvento() {return descricaoEvento;}
    public void setDescricaoEvento(String descricaoEvento) {this.descricaoEvento = descricaoEvento;}

    //Métodos

    /**
     * Construtor completo para registrar dados gerais de histórico de um setor.
     *
     * @param idHistorico ID do histórico
     * @param idSetor setor associado
     * @param dataRegistro data do registro
     * @param areaTotalMapeada área total mapeada no setor
     * @param coberturaAtiva estado da cobertura ativa
     * @param houveEvento indica se houve ocorrência de evento
     * @param tipoEvento tipo do evento ocorrido
     * @param descricaoEvento descrição do evento ocorrido
     */
    public HistoricoGeral(int idHistorico, Setor idSetor, LocalDate dataRegistro, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, boolean houveEvento, String tipoEvento, String descricaoEvento) {
        super(idHistorico, idSetor, dataRegistro);
        this.areaTotalMapeada = areaTotalMapeada;
        this.coberturaAtiva = coberturaAtiva;
        this.houveEvento = houveEvento;
        this.tipoEvento = tipoEvento;
        this.descricaoEvento = descricaoEvento;
    }

    /**
     * Construtor alternativo para registrar histórico geral sem especificar ID.
     *
     * @param idSetor setor associado
     * @param dataRegistro data do registro
     * @param areaTotalMapeada área total mapeada no setor
     * @param coberturaAtiva estado da cobertura ativa
     * @param houveEvento indica se houve ocorrência de evento
     * @param tipoEvento tipo do evento ocorrido
     * @param descricaoEvento descrição do evento ocorrido
     */
    public HistoricoGeral(Setor idSetor, LocalDate dataRegistro, double areaTotalMapeada, CoberturaAtiva coberturaAtiva, boolean houveEvento, String tipoEvento, String descricaoEvento) {
        super(0, idSetor, dataRegistro);
        this.areaTotalMapeada = areaTotalMapeada;
        this.coberturaAtiva = coberturaAtiva;
        this.houveEvento = houveEvento;
    }
}
