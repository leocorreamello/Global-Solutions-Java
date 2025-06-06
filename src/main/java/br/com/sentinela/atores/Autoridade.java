package main.java.br.com.sentinela.atores;

enum TipoAutoridade {
    MUNICIPAL,
    ESTADUAL,
    FEDERAL,
    ONG,
    PRIVADA
}

public class Autoridade {
    private int idAutoridade;
    private String nome;
    private TipoAutoridade tipoAutoridade;
    private String responsavelNome;
    private String email;
    private String telefone;
    private boolean recebeAlertas;
    private String descricao;

    public int getIdAutoridade() { return idAutoridade; }
    public void setIdAutoridade(int idAutoridade) { this.idAutoridade = idAutoridade; }
    public String getNome() { return nome; }
    public void setNome(String nome) {this.nome = nome;}
    public TipoAutoridade getTipoAutoridade() {return tipoAutoridade;}
    public void setTipoAutoridade(TipoAutoridade tipoAutoridade) {this.tipoAutoridade = tipoAutoridade;}
    public String getResponsavelNome() {return responsavelNome;}
    public void setResponsavelNome(String responsavelNome) {this.responsavelNome = responsavelNome;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public boolean isRecebeAlertas() {return recebeAlertas;}
    public void setRecebeAlertas(boolean recebeAlertas) {this.recebeAlertas = recebeAlertas;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
}
