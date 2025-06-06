package main.java.br.com.sentinela.atores;



public class Autoridade {
    public enum TipoAutoridade {
        MUNICIPAL,
        ESTADUAL,
        FEDERAL,
        ONG,
        PRIVADA
    }

    private int idAutoridade;
    private String nome;
    private TipoAutoridade tipoAutoridade;
    private String responsavelNome;
    private String email;
    private String telefone;
    private boolean recebeAlertas;
    private String descricao;

    /**
     * Construtor da classe Autoridade com os dados obrigatórios.
     * @param idAutoridade
     * @param nome
     * @param tipoAutoridade
     * @param email
     * @param recebeAlertas
     */
    public Autoridade(int idAutoridade, String nome, TipoAutoridade tipoAutoridade, String email, boolean recebeAlertas) {
        this.idAutoridade = idAutoridade;
        this.nome = nome;
        this.tipoAutoridade = tipoAutoridade;
        this.email = email;
        this.recebeAlertas = recebeAlertas;
    }

    /**
     * Construtor da classe Autoridade com todos os dados.
     * @param idAutoridade
     * @param descricao
     * @param recebeAlertas
     * @param telefone
     * @param email
     * @param responsavelNome
     * @param tipoAutoridade
     * @param nome
     */
    public Autoridade(int idAutoridade, String descricao, boolean recebeAlertas, String telefone, String email, String responsavelNome, TipoAutoridade tipoAutoridade, String nome) {
        this.idAutoridade = idAutoridade;
        this.descricao = descricao;
        this.recebeAlertas = recebeAlertas;
        this.telefone = telefone;
        this.email = email;
        this.responsavelNome = responsavelNome;
        this.tipoAutoridade = tipoAutoridade;
        this.nome = nome;
    }

    public int getIdAutoridade() { return idAutoridade; }
    public void setIdAutoridade(int idAutoridade) { this.idAutoridade = idAutoridade; }

    public String getNome() { return nome; }
    public void setNome(String nome) {this.nome = nome;}

    public TipoAutoridade getTipoAutoridade() {return tipoAutoridade;}
    public void setTipoAutoridade(TipoAutoridade tipoAutoridade) {this.tipoAutoridade = tipoAutoridade;}

    public String getResponsavelNome() {return responsavelNome;}
    public void setResponsavelNome(String responsavelNome) {this.responsavelNome = responsavelNome;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public boolean isRecebeAlertas() {return recebeAlertas;}
    public void setRecebeAlertas(boolean recebeAlertas) {this.recebeAlertas = recebeAlertas;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    /**
     * Simula a resolução de um alerta de queimada em um determinado setor.
     *
     * @param setor Nome do setor onde ocorre a queimada
     * @return Mensagem descrevendo as ações tomadas para resolver o alerta
     */
    public String resolverAlertaQueimada(String setor) {
        if (!recebeAlertas) {
            return "A autoridade " + nome + " não está configurada para receber alertas.";
        }

        StringBuilder resposta = new StringBuilder();
        resposta.append("ALERTA DE QUEIMADA - SETOR: ").append(setor).append("\n");
        resposta.append("Autoridade responsável: ").append(nome).append(" (").append(tipoAutoridade).append(")\n");

        if (responsavelNome != null && !responsavelNome.isEmpty()) {
            resposta.append("Responsável: ").append(responsavelNome).append("\n");
        }

        resposta.append("Contato: ").append(email);
        if (telefone != null && !telefone.isEmpty()) {
            resposta.append(" / ").append(telefone);
        }
        resposta.append("\n");

        // Ações específicas com base no tipo de autoridade
        switch (tipoAutoridade) {
            case MUNICIPAL:
                resposta.append("Ações: Mobilização da brigada municipal de incêndio, comunicação à população local.");
                break;
            case ESTADUAL:
                resposta.append("Ações: Envio de helicópteros com agentes, coordenação com brigadas municipais.");
                break;
            case FEDERAL:
                resposta.append("Ações: Mobilização de recursos nacionais, coordenação com autoridades estaduais.");
                break;
            case ONG:
                resposta.append("Ações: Apoio às brigadas oficiais, resgate de fauna ameaçada.");
                break;
            case PRIVADA:
                resposta.append("Ações: Evacuação de funcionários, mobilização de recursos internos.");
                break;
            default:
                resposta.append("Ações: Monitoramento da situação e comunicação às autoridades competentes.");
        }

        return resposta.toString();
    }
}
