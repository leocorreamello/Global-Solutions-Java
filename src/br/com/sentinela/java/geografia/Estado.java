package br.com.sentinela.java.geografia;

public class Estado extends UnidadeGeografica {
    private String sigla;

    //Getters & Setters
    public String getSigla() {return sigla;}
    public void setSigla(String sigla) {this.sigla = sigla;}

    //Métodos
    /**
     * Construtor da classe Estado.
     *
     * @param id        ID unico da unidade geográfica.
     * @param nome      Nome do estado.
     * @param descricao Descrição do estado.
     * @param areaTotal Área total do estado em km².
     * @param sigla     Sigla oficial do estado (ex: SP, RJ).
     */
    public Estado(int id, String nome, String descricao, double areaTotal, String sigla) {
        super(id, nome, descricao, areaTotal);
        this.sigla = sigla;
    }

    /**
     * Gera um resumo detalhado da unidade, incluindo sigla.
     *
     * @return String com ID, nome, risco e sigla do estado.
     */
    @Override
    public String gerarResumo() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Risco atual: " + getNivelRiscoAtual() + " | Sigla: " + sigla;
    }

    /**
     * Simula a distribuição de recursos emergenciais no estado.
     * Exibe uma mensagem no console com o nome e ID do estado.
     */
    public void distribuirRecursosEmergenciais() {
        System.out.println("Recursos emergenciais distribuídos no estado: " + getNome() + " (ID: " + getId() + ")");
    }
}
