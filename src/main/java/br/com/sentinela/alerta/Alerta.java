package main.java.br.com.sentinela.alerta;

import main.java.br.com.sentinela.geolocalizacao.Setor;

import java.time.LocalDateTime;

public class Alerta {
    public enum TipoAlerta {
        CLIMA, QUEIMADA, FOCO_CALOR, OUTRO
    }

    public enum NivelCriticidade {
        BAIXO, MEDIO, ALTO, EXTREMO
    }

    public enum StatusAlerta {
        PENDENTE, EM_ANDAMENTO, RESOLVIDO, CANCELADO
    }

    private int idAlerta;
    private Setor idSetor;
    private String titulo;
    private String descricao;
    private TipoAlerta tipoAlerta;

    private String informacaoAutoridade;
    private String recomendacaoAutoridade;
    private String informacaoComunidade;
    private String recomendacaoComunidade;

    private NivelCriticidade nivelCriticidade;
    private LocalDateTime dataEmissao;
    private LocalDateTime dataValidade;

    private String origemGeracao;
    private StatusAlerta statusAlerta;

    //Getters e Setters
    public int getIdAlerta() {return idAlerta;}
    public void setIdAlerta(int idAlerta) {this.idAlerta = idAlerta;}

    public int getIdSetor() {return idSetor.getId();}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public TipoAlerta getTipoAlerta() {return tipoAlerta;}
    public void setTipoAlerta(TipoAlerta tipoAlerta) {this.tipoAlerta = tipoAlerta;}

    public String getInformacaoAutoridade() {return informacaoAutoridade;}
    public void setInformacaoAutoridade(String informacaoAutoridade) {this.informacaoAutoridade = informacaoAutoridade;}

    public String getRecomendacaoAutoridade() {return recomendacaoAutoridade;}
    public void setRecomendacaoAutoridade(String recomendacaoAutoridade) {this.recomendacaoAutoridade = recomendacaoAutoridade;}

    public String getInformacaoComunidade() {return informacaoComunidade;}
    public void setInformacaoComunidade(String informacaoComunidade) {this.informacaoComunidade = informacaoComunidade;}

    public String getRecomendacaoComunidade() {return recomendacaoComunidade;}
    public void setRecomendacaoComunidade(String recomendacaoComunidade) {this.recomendacaoComunidade = recomendacaoComunidade;}

    public NivelCriticidade getNivelCriticidade() {return nivelCriticidade;}
    public void setNivelCriticidade(NivelCriticidade nivelCriticidade) {this.nivelCriticidade = nivelCriticidade;}

    public LocalDateTime getDataEmissao() {return dataEmissao;}
    public void setDataEmissao(LocalDateTime dataEmissao) {this.dataEmissao = dataEmissao;}

    public LocalDateTime getDataValidade() {return dataValidade;}
    public void setDataValidade(LocalDateTime dataValidade) {this.dataValidade = dataValidade;}

    public String getOrigemGeracao() {return origemGeracao;}
    public void setOrigemGeracao(String origemGeracao) {this.origemGeracao = origemGeracao;}

    public StatusAlerta getStatusAlerta() {return statusAlerta;}
    public void setStatusAlerta(StatusAlerta statusAlerta) {this.statusAlerta = statusAlerta;}

    //Métodos

    /**
     * Construtor completo para criar um alerta com todos os campos informados.
     *
     * @param idAlerta ID do alerta
     * @param idSetor setor associado ao alerta
     * @param titulo título do alerta
     * @param descricao descrição do alerta
     * @param tipoAlerta tipo do alerta
     * @param informacaoAutoridade informação específica para a autoridade
     * @param recomendacaoAutoridade recomendação para a autoridade
     * @param informacaoComunidade informação específica para a comunidade
     * @param recomendacaoComunidade recomendação para a comunidade
     * @param nivelCriticidade nível de criticidade do alerta
     * @param dataEmissao data e hora de emissão do alerta
     * @param dataValidade data e hora de validade do alerta
     * @param origemGeracao origem da geração do alerta
     * @param statusAlerta status atual do alerta
     */
    public Alerta(int idAlerta, Setor idSetor, String titulo, String descricao, TipoAlerta tipoAlerta, String informacaoAutoridade, String recomendacaoAutoridade, String informacaoComunidade, String recomendacaoComunidade, NivelCriticidade nivelCriticidade, LocalDateTime dataEmissao, LocalDateTime dataValidade, String origemGeracao, StatusAlerta statusAlerta) {
        this.idAlerta = idAlerta;
        this.idSetor = idSetor;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipoAlerta = tipoAlerta;
        this.informacaoAutoridade = informacaoAutoridade;
        this.recomendacaoAutoridade = recomendacaoAutoridade;
        this.informacaoComunidade = informacaoComunidade;
        this.recomendacaoComunidade = recomendacaoComunidade;
        this.nivelCriticidade = nivelCriticidade;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
        this.origemGeracao = origemGeracao;
        this.statusAlerta = statusAlerta;
    }

    /**
     * Construtor reduzido para criar um alerta com os campos essenciais.
     *
     * @param idAlerta ID do alerta
     * @param idSetor setor associado
     * @param titulo título do alerta
     * @param descricao descrição do alerta
     * @param tipoAlerta tipo do alerta
     * @param nivelCriticidade nível de criticidade
     * @param dataEmissao data e hora de emissão
     * @param origemGeracao origem da geração
     * @param statusAlerta status atual
     */
    public Alerta(int idAlerta, Setor idSetor, String titulo, String descricao, TipoAlerta tipoAlerta, NivelCriticidade nivelCriticidade, LocalDateTime dataEmissao, String origemGeracao, StatusAlerta statusAlerta) {
        this.idAlerta = idAlerta;
        this.idSetor = idSetor;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipoAlerta = tipoAlerta;
        this.nivelCriticidade = nivelCriticidade;
        this.dataEmissao = dataEmissao;
        this.origemGeracao = origemGeracao;
        this.statusAlerta = statusAlerta;
    }

    /**
     * Simula o envio do alerta para as autoridades, exibindo as principais informações no console.
     */
    public void enviarParaAutoridades(){
        System.out.println("=== ENVIO DE ALERTA PARA AUTORIDADES ===");
        System.out.println("ID do Alerta: " + idAlerta);
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Nível de Criticidade: " + nivelCriticidade);
        System.out.println("Informação para Autoridade: " + informacaoAutoridade);
        System.out.println("Recomendação para Autoridade: " + recomendacaoAutoridade);
        System.out.println("Emitido em: " + dataEmissao);
        System.out.println("Validade até: " + dataValidade);
        System.out.println("=========================================");
    }
}