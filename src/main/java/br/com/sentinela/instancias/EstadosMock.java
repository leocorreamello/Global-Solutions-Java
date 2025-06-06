package main.java.br.com.sentinela.instancias;

import main.java.br.com.sentinela.geolocalizacao.Estado;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

/**
 * Classe que representa um mock de estados com dados fictícios para testes.
 * Contém informações sobre o nível de risco, área total, área mapeada e cobertura ativa.
 */
public class EstadosMock {
    public static final Estado matoGrosso = new Estado(
            1,
            "Mato Grosso",
            8.5, // nível de risco atual
            7.2, // média de risco
            903357.9, // área total em km²
            850000.0, // área mapeada em km²
            CoberturaAtiva.SIM,
            "MT"
    );

    public static final Estado para = new Estado(
            2,
            "Pará",
            7.8,
            6.9,
            1247689.5,
            1200000.0,
            CoberturaAtiva.PARCIALMENTE,
            "PA"
    );

    public static final Estado tocantins = new Estado(
            3,
            "Tocantins",
            6.5,
            5.8,
            277620.9,
            250000.0,
            CoberturaAtiva.PARCIALMENTE,
            "TO"
    );
}
