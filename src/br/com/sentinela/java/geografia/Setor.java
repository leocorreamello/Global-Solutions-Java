package br.com.sentinela.java.geografia;

public class Setor extends UnidadeGeografica {
    private Regiao idRegiao;
    private double densidadeDemografica;
    private String observacoes;

    //Getters & Setters
    public int getRegiao() {return idRegiao.getId();}

    public double getDensidadeDemografica() {return densidadeDemografica;}
    public void setDensidadeDemografica(double densidadeDemografica) {this.densidadeDemografica = densidadeDemografica;}

    public String getObservacoes() {return observacoes;}
    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}

    //Métodos
    /**
     * Construtor da classe Setor.
     *
     * @param id                    Identificador do setor.
     * @param nome                  Nome do setor.
     * @param descricao             Descrição da unidade.
     * @param areaTotal             Área total em km².
     * @param idRegiao              Objeto Regiao ao qual o setor pertence.
     * @param densidadeDemografica  Densidade populacional estimada por km².
     * @param observacoes           Observações adicionais sobre o setor.
     */
    public Setor(int id, String nome, String descricao, double areaTotal, Regiao idRegiao,
                 double densidadeDemografica, String observacoes) {
        super(id, nome, descricao, areaTotal);
        this.idRegiao = idRegiao;
        this.densidadeDemografica = densidadeDemografica;
        this.observacoes = observacoes;
    }

    /**
     * Gera um resumo completo do setor, incluindo densidade e observações.
     *
     * @return Texto formatado com ID, nome, risco e detalhes do setor.
     */
    @Override
    public String gerarResumo() {
        return "ID: " + getId() + " | Nome: " + getNome() +
                " | Risco atual: " + getNivelRiscoAtual() +
                " | Densidade Demográfica: " + densidadeDemografica +
                " | Observações: " + observacoes;
    }

    /**
     * Emite um alerta imediato simulando uma situação de emergência.
     * Exibe o nome e ID do setor.
     */
    public void enviarAlertaImediato() {
        System.out.println("ALERTA IMEDIATO emitido no setor: " + getNome() + " (ID: " + getId() + ")");
    }

    /**
     * Estima a população do setor com base na densidade demográfica e área.
     *
     * @param setor  Objeto setor a ser analisado.
     * @param regiao Objeto região onde o setor está inserido.
     */
    public void estimarPopulacao(Setor setor, Regiao regiao) {
        System.out.println("Estimativa de população no setor: " +
                getAreaTotal() * densidadeDemografica + " habitantes. (" +
                setor.getNome() + " em " + regiao.getNome() + ")");
    }
}