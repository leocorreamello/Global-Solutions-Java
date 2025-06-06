package main.java.br.com.sentinela.geolocalizacao;

public class Cidade extends UnidadeGeografica {
    private Estado idEstado;
    private String sigla;

    //Getters & Setters
    public int getEstado() {return idEstado.getId();}

    public String getSigla() {return sigla;}
    public void setSigla(String sigla) {this.sigla = sigla;}

    //Métodos
    /**
     * Construtor da classe Cidade.
     *
     * @param id         Identificador único da cidade.
     * @param nome       Nome da cidade.
     * @param descricao  Descrição da cidade.
     * @param areaTotal  Área total da cidade em km².
     * @param idEstado   Objeto Estado ao qual a cidade pertence.
     * @param sigla      Sigla oficial da cidade (opcional).
     */
    public Cidade(int id, String nome, String descricao, double areaTotal, Estado idEstado, String sigla) {
        super(id, nome, descricao, areaTotal);
        this.idEstado = idEstado;
        this.sigla = sigla;
    }

    /**
     * Gera um resumo da cidade com ID, nome, risco atual e sigla.
     *
     * @return Texto formatado com os principais dados da cidade.
     */
    @Override
    public String gerarResumo() {
        return "ID: " + getId() + " | Nome: " + getNome() + " | Risco atual: " + getNivelRiscoAtual() + " | Sigla: " + sigla;
    }

    /**
     * Simula o acionamento de autoridades municipais em caso de emergência.
     * Exibe uma mensagem no console com o nome e ID da cidade.
     */
    public void acionarAutoridadesMunicipais() {
        System.out.println("Autoridades municipais acionadas para cidade: " + getNome() + " (ID: " + getId() + ")");
    }
}