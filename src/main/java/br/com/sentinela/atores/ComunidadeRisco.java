package main.java.br.com.sentinela.atores;

import main.java.br.com.sentinela.geolocalizacao.Setor;
import main.java.br.com.sentinela.utils.CoberturaAtiva;
import main.java.br.com.sentinela.utils.CoordenadaGeografica;

enum TipoComunidade {
    INDIGENA,
    REMOTA,
    URBANA,
    RURAL,
    NAO_ESPECIFICADO
}

public class ComunidadeRisco {
    private int idComunidade;
    private Setor setor;
    private String nome;
    private String descricao;
    private CoberturaAtiva coberturaAtiva;
    private CoordenadaGeografica coordenadas;
    private int populacaoEstimativa;
    private TipoComunidade tipoComunidade;
    private boolean recebeSirenes;

    /**
     * Construtor da classe ComunidadeRisco com os dados obrigatórios.
     *
     * @param idComunidade Identificador único da comunidade.
     * @param coberturaAtiva Cobertura ativa de comunicação com a comunidade.
     * @param coordenadas Coordenadas geográficas da comunidade.
     * @param recebeSirenes Indica se a comunidade recebe alertas por sirenes.
     */
    public ComunidadeRisco(int idComunidade, CoberturaAtiva coberturaAtiva, CoordenadaGeografica coordenadas, boolean recebeSirenes) {
        this.idComunidade = idComunidade;
        this.coberturaAtiva = coberturaAtiva;
        this.coordenadas = coordenadas;
        this.recebeSirenes = recebeSirenes;
    }

    /**
     * Construtor da classe ComunidadeRisco com todos os dados.
     *
     * @param idComunidade Identificador único da comunidade.
     * @param setor Setor geográfico ao qual a comunidade pertence.
     * @param nome Nome da comunidade.
     * @param descricao Descrição da comunidade.
     * @param coberturaAtiva Cobertura ativa de comunicação com a comunidade.
     * @param coordenadas Coordenadas geográficas da comunidade.
     * @param populacaoEstimativa População estimada da comunidade.
     * @param tipoComunidade Tipo de comunidade (indígena, remota, urbana, rural, nao_listada).
     * @param recebeSirenes Indica se a comunidade recebe alertas por sirenes.
     */
    public ComunidadeRisco(int idComunidade, Setor setor, String nome, String descricao,
                           CoberturaAtiva coberturaAtiva, CoordenadaGeografica coordenadas,
                           int populacaoEstimativa, TipoComunidade tipoComunidade, boolean recebeSirenes) {
        this.idComunidade = idComunidade;
        this.setor = setor;
        this.nome = nome;
        this.descricao = descricao;
        this.coberturaAtiva = coberturaAtiva;
        this.coordenadas = coordenadas;
        this.populacaoEstimativa = populacaoEstimativa;
        this.tipoComunidade = tipoComunidade;
        this.recebeSirenes = recebeSirenes;
    }

    public int getIdComunidade() { return idComunidade; }
    public void setIdComunidade(int idComunidade) { this.idComunidade = idComunidade; }

    public Setor getSetor() { return setor; }
    public void setSetor(Setor setor) { this.setor = setor; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public CoberturaAtiva getCoberturaAtiva() { return coberturaAtiva; }
    public void setCoberturaAtiva(CoberturaAtiva coberturaAtiva) { this.coberturaAtiva = coberturaAtiva; }

    public CoordenadaGeografica getCoordenadas() { return coordenadas; }
    public void setCoordenadas(CoordenadaGeografica coordenadas) { this.coordenadas = coordenadas; }

    public int getPopulacaoEstimativa() { return populacaoEstimativa; }
    public void setPopulacaoEstimativa(int populacaoEstimativa) { this.populacaoEstimativa = populacaoEstimativa; }

    public TipoComunidade getTipoComunidade() { return tipoComunidade; }
    public void setTipoComunidade(TipoComunidade tipoComunidade) { this.tipoComunidade = tipoComunidade; }

    public boolean isRecebeSirenes() { return recebeSirenes; }
    public void setRecebeSirenes(boolean recebeSirenes) { this.recebeSirenes = recebeSirenes; }
}
