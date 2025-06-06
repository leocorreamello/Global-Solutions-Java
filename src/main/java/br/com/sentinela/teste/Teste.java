package main.java.br.com.sentinela.teste;

import main.java.br.com.sentinela.geolocalizacao.*;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

import static main.java.br.com.sentinela.instancias.EstadosMock.*;

public class Teste {

    public static void main(String[] args) {






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
