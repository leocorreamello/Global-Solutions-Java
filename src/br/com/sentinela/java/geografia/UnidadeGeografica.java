package br.com.sentinela.java.geografia;

public class UnidadeGeografica {
    private int id;
    private String nome;
    private String descricao;
    private double nivelRiscoAtual;
    private double mediaRisco;
    private double areaTotal;
    private double areaTotalMapeada;
    private enum coberturaAtiva {}

    //Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getNivelRiscoAtual() { return nivelRiscoAtual; }
    public void setNivelRiscoAtual(double nivelRiscoAtual) { this.nivelRiscoAtual = nivelRiscoAtual; }

    public double getMediaRisco() { return mediaRisco; }
    public void setMediaRisco(double mediaRisco) { this.mediaRisco = mediaRisco; }

    public double getAreaTotal() { return areaTotal; }
    public void setAreaTotal(double areaTotal) { this.areaTotal = areaTotal; }

    public double getAreaTotalMapeada() { return areaTotalMapeada; }
    public void setAreaTotalMapeada(double areaTotalMapeada) { this.areaTotalMapeada = areaTotalMapeada; }

    //Métodos
    /**
     * Construtor da unidade geográfica com os dados principais.
     *
     * @param id        Identificador da unidade.
     * @param nome      Nome da unidade.
     * @param descricao Descrição da unidade.
     * @param areaTotal Área total da unidade em km².
     */
    public UnidadeGeografica(int id, String nome, String descricao, double areaTotal) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.areaTotal = areaTotal;
        this.areaTotalMapeada = 0.0;
        this.nivelRiscoAtual = 0.0;
        this.mediaRisco = 0.0;
    }

    /**
     * Gera um resumo contendo ID, nome e risco atual da unidade.
     *
     * @return String com informações resumidas da unidade.
     */
    public String gerarResumo() {
        return "ID: " + id + " | Nome: " + nome + " | Risco atual: " + nivelRiscoAtual;
    }
}