package main.java.br.com.sentinela.historico;

import main.java.br.com.sentinela.geolocalizacao.Setor;

import java.time.LocalDate;

public class Historico {
    private int idHistorico;
    private Setor idSetor;
    private LocalDate dataRegistro;

    //Getters e Setters
    public int getIdHistorico() {return idHistorico;}
    public void setIdHistorico(int idHistorico) {this.idHistorico = idHistorico;}

    public int getIdSetor() {return idSetor.getId();}

    public LocalDate getDataRegistro() {return dataRegistro;}
    public void setDataRegistro(LocalDate dataRegistro) {this.dataRegistro = dataRegistro;}

    //Métodos

    /**
     * Construtor para criar um registro de histórico.
     *
     * @param idHistorico ID do histórico
     * @param idSetor setor associado ao histórico
     * @param dataRegistro data do registro do histórico
     */
    public Historico(int idHistorico, Setor idSetor, LocalDate dataRegistro) {
        this.idHistorico = idHistorico;
        this.idSetor = idSetor;
        this.dataRegistro = dataRegistro;
    }
}
