package main.java.br.com.sentinela.instancias;

import main.java.br.com.sentinela.geolocalizacao.Regiao;
import main.java.br.com.sentinela.utils.CoberturaAtiva;
import main.java.br.com.sentinela.instancias.CidadeMock;

public class RegiaoMock {
    public static final Regiao popularCuiaba = new Regiao(
            1001,
            "Popular",
            "Bairro Popular em Cuiabá.",
            8.2,
            7.5,
            10.0,
            9.5,
            CoberturaAtiva.SIM,
            CidadeMock.cuiaba
    );

    public static final Regiao jardimImperialCuiaba = new Regiao(
            1002,
            "Jardim Imperial",
            "Bairro Jardim Imperial em Cuiabá.",
            7.8,
            7.0,
            8.5,
            8.0,
            CoberturaAtiva.PARCIALMENTE,
            CidadeMock.cuiaba
    );

    public static final Regiao meninoJesusSinop = new Regiao(
            1003,
            "Menino Jesus",
            "Bairro Menino Jesus em Sinop.",
            7.7,
            7.0,
            9.0,
            8.7,
            CoberturaAtiva.SIM,
            CidadeMock.sinop
    );

    public static final Regiao jardimBotanicoSinop = new Regiao(
            1004,
            "Jardim Botânico",
            "Bairro Jardim Botânico em Sinop.",
            7.3,
            6.5,
            8.0,
            7.8,
            CoberturaAtiva.PARCIALMENTE,
            CidadeMock.sinop
    );

    // Belém
    public static final Regiao nazareBelem = new Regiao(
            1005,
            "Nazaré",
            "Bairro Nazaré em Belém.",
            7.5,
            6.8,
            12.0,
            11.0,
            CoberturaAtiva.SIM,
            CidadeMock.belem
    );
    public static final Regiao marcoBelem = new Regiao(
            1006,
            "Marco",
            "Bairro Marco em Belém.",
            7.2,
            6.5,
            10.5,
            10.0,
            CoberturaAtiva.PARCIALMENTE,
            CidadeMock.belem
    );

    // Santarém
    public static final Regiao santissimoSantarém = new Regiao(
            1007,
            "Santíssimo",
            "Bairro Santíssimo em Santarém.",
            7.9,
            7.0,
            8.0,
            7.5,
            CoberturaAtiva.SIM,
            CidadeMock.santarem
    );
    public static final Regiao aeroportoVelhoSantarém = new Regiao(
            1008,
            "Aeroporto Velho",
            "Bairro Aeroporto Velho em Santarém.",
            7.6,
            7.0,
            7.2,
            7.0,
            CoberturaAtiva.PARCIALMENTE,
            CidadeMock.santarem
    );

    // Palmas
    public static final Regiao planoDiretorSulPalmas = new Regiao(
            1009,
            "Plano Diretor Sul",
            "Bairro Plano Diretor Sul em Palmas.",
            6.8,
            6.0,
            15.0,
            14.0,
            CoberturaAtiva.SIM,
            CidadeMock.palmas
    );
    public static final Regiao taquaraltoPalmas = new Regiao(
            1010,
            "Taquaralto",
            "Bairro Taquaralto em Palmas.",
            6.5,
            5.8,
            13.0,
            12.5,
            CoberturaAtiva.PARCIALMENTE,
            CidadeMock.palmas
    );

    // Gurupi
    public static final Regiao centroGurupi = new Regiao(
            1011,
            "Centro",
            "Bairro Centro em Gurupi.",
            6.2,
            5.5,
            11.0,
            10.5,
            CoberturaAtiva.SIM,
            CidadeMock.gurupi
    );
    public static final Regiao setorUniversitarioGurupi = new Regiao(
            1012,
            "Setor Universitário",
            "Bairro Setor Universitário em Gurupi.",
            6.0,
            5.3,
            9.0,
            8.7,
            CoberturaAtiva.PARCIALMENTE,
            CidadeMock.gurupi
    );
}
