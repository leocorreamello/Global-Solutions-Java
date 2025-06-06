package main.java.br.com.sentinela.dados;

import main.java.br.com.sentinela.geolocalizacao.Setor;

import java.time.LocalDate;

public class DadosOperacionais {
    private int idOperacional;
    private Setor idSetor;
    private LocalDate dataRegistro;

    // Getters e Setters
    public int getIdOperacional() {return idOperacional;}
    public void setIdOperacional(int idOperacional) {this.idOperacional = idOperacional;}

    public int getIdSetor() {return idSetor.getId();}

    public LocalDate getDataRegistro() {return dataRegistro;}
    public void setDataRegistro(LocalDate dataRegistro) {this.dataRegistro = dataRegistro;}

    //Métodos

    /**
     * Construtor para criar um registro de dados operacionais.
     *
     * @param idOperacional ID da entrada operacional
     * @param idSetor setor associado ao dado operacional
     * @param dataRegistro data do registro do dado
     */
    public DadosOperacionais(int idOperacional, Setor idSetor, LocalDate dataRegistro) {
        this.idOperacional = idOperacional;
        this.idSetor = idSetor;
        this.dataRegistro = dataRegistro;
    }
}
