package main.java.br.com.sentinela.instancias;

import main.java.br.com.sentinela.geolocalizacao.Cidade;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

import static main.java.br.com.sentinela.instancias.EstadosMock.*;

public class CidadeMock {

    // Cidades do Mato Grosso
    public static final Cidade cuiaba = new Cidade(
            101,
            "Cuiabá",
            "Capital do Mato Grosso, frequentemente afetada por queimadas urbanas e rurais.",
            8.0,
            7.0,
            350.5,
            340.0,
            CoberturaAtiva.SIM,
            matoGrosso,
            "CBA"
    );

    public static final Cidade sinop = new Cidade(
            102,
            "Sinop",
            "Importante polo agrícola, com histórico de queimadas em áreas de expansão.",
            7.5,
            6.8,
            400.0,
            390.0,
            CoberturaAtiva.PARCIALMENTE,
            matoGrosso,
            "SNP"
    );

    // Cidades do Pará
    public static final Cidade belem = new Cidade(
            201,
            "Belém",
            "Capital do Pará, próxima a áreas de floresta e sujeita a riscos ambientais.",
            7.2,
            6.5,
            1058.0,
            1000.0,
            CoberturaAtiva.PARCIALMENTE,
            para,
            "BEL"
    );

    public static final Cidade santarem = new Cidade(
            202,
            "Santarém",
            "Cidade estratégica na região amazônica, monitorada por queimadas.",
            7.9,
            7.0,
            229.0,
            220.0,
            CoberturaAtiva.PARCIALMENTE,
            para,
            "STR"
    );

    // Cidades do Tocantins
    public static final Cidade palmas = new Cidade(
            301,
            "Palmas",
            "Capital do Tocantins, com áreas urbanas e rurais vulneráveis a queimadas.",
            6.8,
            6.0,
            2218.9,
            2100.0,
            CoberturaAtiva.SIM,
            tocantins,
            "PLM"
    );

    public static final Cidade gurupi = new Cidade(
            302,
            "Gurupi",
            "Município do sul do estado, com histórico de queimadas em áreas agrícolas.",
            6.2,
            5.5,
            1845.0,
            1800.0,
            CoberturaAtiva.PARCIALMENTE,
            tocantins,
            "GRP"
    );
}
