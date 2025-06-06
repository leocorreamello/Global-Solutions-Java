package main.java.br.com.sentinela.dados;

import main.java.br.com.sentinela.geolocalizacao.Setor;

import java.time.LocalDate;

public class Clima extends DadosOperacionais{
    private double temperatura;  // (4,2)
    private double umidade;      // (4,2)
    private double pressao;      // (6,2)
    private String vento;
    private double indiceUv;     // (3,1)

    //Getters e Setters
    public double getTemperatura() {return temperatura;}
    public void setTemperatura(double temperatura) {this.temperatura = temperatura;}

    public double getUmidade() {return umidade;}
    public void setUmidade(double umidade) {this.umidade = umidade;}

    public double getPressao() {return pressao;}
    public void setPressao(double pressao) {this.pressao = pressao;}

    public String getVento() {return vento;}
    public void setVento(String vento) {this.vento = vento;}

    public double getIndiceUv() {return indiceUv;}
    public void setIndiceUv(double indiceUv) {this.indiceUv = indiceUv;}

    //Métodos

    /**
     * Construtor completo para registrar dados climáticos com todas as variáveis.
     *
     * @param idOperacional ID da entrada operacional
     * @param idSetor setor ao qual os dados pertencem
     * @param dataRegistro data de registro da coleta
     * @param temperatura valor da temperatura registrada
     * @param umidade valor da umidade registrada
     * @param pressao valor da pressão atmosférica registrada
     * @param vento descrição do vento registrado
     * @param indiceUv índice UV registrado
     */
    public Clima(int idOperacional, Setor idSetor, LocalDate dataRegistro, double temperatura, double umidade, double pressao, String vento, double indiceUv) {
        super(idOperacional, idSetor, dataRegistro);
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.vento = vento;
        this.indiceUv = indiceUv;
    }

    /**
     * Construtor parcial para registrar dados climáticos básicos (sem vento e índice UV).
     *
     * @param idOperacional ID da entrada operacional
     * @param idSetor setor ao qual os dados pertencem
     * @param dataRegistro data de registro da coleta
     * @param temperatura valor da temperatura registrada
     * @param umidade valor da umidade registrada
     * @param pressao valor da pressão atmosférica registrada
     */
    public Clima(int idOperacional, Setor idSetor, LocalDate dataRegistro, double temperatura, double umidade, double pressao) {
        super(idOperacional, idSetor, dataRegistro);
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }
}
