package br.com.sentinela.java.geografia;

public class Regiao extends UnidadeGeografica {
    private Cidade idCidade;

    //Getters & Setters
    public int getIdCidade() {return idCidade.getId();}

    //Métodos
    /**
     * Construtor da classe Regiao.
     *
     * @param id         Identificador único da região.
     * @param nome       Nome da região.
     * @param descricao  Descrição da região.
     * @param areaTotal  Área total da região em km².
     * @param idCidade   Objeto Cidade ao qual a região pertence.
     */
    public Regiao(int id, String nome, String descricao, double areaTotal, Cidade idCidade) {
        super(id, nome, descricao, areaTotal);
        this.idCidade = idCidade;
    }

    /**
     * Gera um resumo da região com ID, nome e risco atual.
     *
     * @return Texto formatado com os principais dados da região.
     */
    @Override
    public String gerarResumo() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Risco atual: " + getNivelRiscoAtual();
    }

    /**
     * Simula a priorização do mapeamento para essa região.
     * Exibe uma mensagem com nome e ID da região.
     */
    public void priorizarMapeamento() {
        System.out.println("Priorizando mapeamento na região: " + getNome() + " (ID: " + getId() + ")");
    }
}