package main.java.br.com.sentinela.teste;

import main.java.br.com.sentinela.geografia.*;

public class Teste {

    public static void main(String[] args) {

        UnidadeGeografica unidade = new UnidadeGeografica(1, "Brasil", "Unidade Geografica Brasil", 5000.0);
        Estado estado = new Estado(2, "São Paulo", "Estado de São Paulo", 5000.0, "SP");
        Cidade cidade = new Cidade(3, "Sorocaba", "Cidade de Sorocaba", 200.0, estado, "SO");
        Regiao regiao = new Regiao(4, "Aguá Branca", "Região de Aguá Branca nos arredores de Sorocaba", 300.0, cidade);
        Setor setor = new Setor(5, "Floresta", "Floresta densa em Aguá Branca", 50.0, regiao, 250.0, "Floresta com fauna diversificada e rica em biodiversidade");

        System.out.println(unidade.gerarResumo());
        System.out.println(estado.gerarResumo());
        System.out.println(cidade.gerarResumo());
        System.out.println(regiao.gerarResumo());
        System.out.println(setor.gerarResumo());

        estado.distribuirRecursosEmergenciais();

        cidade.acionarAutoridadesMunicipais();

        regiao.priorizarMapeamento();

        setor.enviarAlertaImediato();
        setor.estimarPopulacao(setor, regiao);
    }

}
