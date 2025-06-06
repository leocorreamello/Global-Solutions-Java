package main.java.br.com.sentinela.instancias;

import main.java.br.com.sentinela.geolocalizacao.Setor;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

public class SetorMock {
    // Cuiabá - Popular
    public static final Setor setorNortePopularCuiaba = new Setor(
            2001,
            "Setor Norte",
            "Parte norte do bairro Popular em Cuiabá.",
            8.0,
            7.4,
            5.0,
            4.8,
            CoberturaAtiva.SIM,
            RegiaoMock.popularCuiaba,
            3500.0,
            "Área residencial com comércio local."
    );
    public static final Setor setorSulPopularCuiaba = new Setor(
            2002,
            "Setor Sul",
            "Parte sul do bairro Popular em Cuiabá.",
            8.3,
            7.6,
            5.0,
            4.7,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.popularCuiaba,
            3200.0,
            "Região com escolas e praças."
    );

    // Cuiabá - Jardim Imperial
    public static final Setor setorLesteJardimImperialCuiaba = new Setor(
            2003,
            "Setor Leste",
            "Parte leste do Jardim Imperial em Cuiabá.",
            7.6,
            6.9,
            4.3,
            4.1,
            CoberturaAtiva.SIM,
            RegiaoMock.jardimImperialCuiaba,
            2800.0,
            "Área predominantemente residencial."
    );
    public static final Setor setorOesteJardimImperialCuiaba = new Setor(
            2004,
            "Setor Oeste",
            "Parte oeste do Jardim Imperial em Cuiabá.",
            8.0,
            7.2,
            4.2,
            3.9,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.jardimImperialCuiaba,
            2600.0,
            "Comércio local e pequenas indústrias."
    );

    // Sinop - Menino Jesus
    public static final Setor setorCentralMeninoJesusSinop = new Setor(
            2005,
            "Setor Central",
            "Centro do bairro Menino Jesus em Sinop.",
            7.5,
            6.8,
            4.5,
            4.3,
            CoberturaAtiva.SIM,
            RegiaoMock.meninoJesusSinop,
            3000.0,
            "Área com maior densidade populacional."
    );
    public static final Setor setorPerifericoMeninoJesusSinop = new Setor(
            2006,
            "Setor Periférico",
            "Periferia do bairro Menino Jesus em Sinop.",
            7.9,
            7.1,
            4.5,
            4.4,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.meninoJesusSinop,
            2100.0,
            "Região em expansão urbana."
    );

    // Sinop - Jardim Botânico
    public static final Setor setorVerdeJardimBotanicoSinop = new Setor(
            2007,
            "Setor Verde",
            "Área verde do Jardim Botânico em Sinop.",
            7.1,
            6.3,
            4.0,
            3.8,
            CoberturaAtiva.SIM,
            RegiaoMock.jardimBotanicoSinop,
            1800.0,
            "Próximo a parques e áreas de lazer."
    );
    public static final Setor setorResidencialJardimBotanicoSinop = new Setor(
            2008,
            "Setor Residencial",
            "Área residencial do Jardim Botânico em Sinop.",
            7.5,
            6.7,
            4.0,
            4.0,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.jardimBotanicoSinop,
            2200.0,
            "Condomínios e casas familiares."
    );

    // Belém - Nazaré
    public static final Setor setorNorteNazareBelem = new Setor(
            2009,
            "Setor Norte",
            "Parte norte do bairro Nazaré em Belém.",
            7.3,
            6.5,
            6.0,
            5.7,
            CoberturaAtiva.SIM,
            RegiaoMock.nazareBelem,
            4000.0,
            "Área histórica e turística."
    );
    public static final Setor setorSulNazareBelem = new Setor(
            2010,
            "Setor Sul",
            "Parte sul do bairro Nazaré em Belém.",
            7.7,
            7.0,
            6.0,
            5.3,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.nazareBelem,
            3500.0,
            "Região com hospitais e escolas."
    );

    // Belém - Marco
    public static final Setor setorLesteMarcoBelem = new Setor(
            2011,
            "Setor Leste",
            "Parte leste do bairro Marco em Belém.",
            7.0,
            6.2,
            5.3,
            5.0,
            CoberturaAtiva.SIM,
            RegiaoMock.marcoBelem,
            3300.0,
            "Comércio diversificado."
    );
    public static final Setor setorOesteMarcoBelem = new Setor(
            2012,
            "Setor Oeste",
            "Parte oeste do bairro Marco em Belém.",
            7.4,
            6.8,
            5.2,
            5.0,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.marcoBelem,
            3100.0,
            "Área residencial consolidada."
    );

    // Santarém - Santíssimo
    public static final Setor setorCentralSantissimoSantarem = new Setor(
            2013,
            "Setor Central",
            "Centro do bairro Santíssimo em Santarém.",
            7.7,
            6.9,
            4.0,
            3.8,
            CoberturaAtiva.SIM,
            RegiaoMock.santissimoSantarém,
            2500.0,
            "Área de comércio local."
    );
    public static final Setor setorPerifericoSantissimoSantarem = new Setor(
            2014,
            "Setor Periférico",
            "Periferia do bairro Santíssimo em Santarém.",
            8.1,
            7.2,
            4.0,
            3.7,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.santissimoSantarém,
            1800.0,
            "Região de expansão urbana."
    );

    // Santarém - Aeroporto Velho
    public static final Setor setorLesteAeroportoVelhoSantarem = new Setor(
            2015,
            "Setor Leste",
            "Parte leste do bairro Aeroporto Velho em Santarém.",
            7.4,
            6.7,
            3.6,
            3.5,
            CoberturaAtiva.SIM,
            RegiaoMock.aeroportoVelhoSantarém,
            2000.0,
            "Próximo ao aeroporto."
    );
    public static final Setor setorOesteAeroportoVelhoSantarem = new Setor(
            2016,
            "Setor Oeste",
            "Parte oeste do bairro Aeroporto Velho em Santarém.",
            7.8,
            7.1,
            3.6,
            3.5,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.aeroportoVelhoSantarém,
            1700.0,
            "Área residencial."
    );

    // Palmas - Plano Diretor Sul
    public static final Setor setorNortePlanoDiretorSulPalmas = new Setor(
            2017,
            "Setor Norte",
            "Parte norte do Plano Diretor Sul em Palmas.",
            6.6,
            5.8,
            7.5,
            7.0,
            CoberturaAtiva.SIM,
            RegiaoMock.planoDiretorSulPalmas,
            2700.0,
            "Área administrativa."
    );
    public static final Setor setorSulPlanoDiretorSulPalmas = new Setor(
            2018,
            "Setor Sul",
            "Parte sul do Plano Diretor Sul em Palmas.",
            7.0,
            6.2,
            7.5,
            7.0,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.planoDiretorSulPalmas,
            2500.0,
            "Região residencial."
    );

    // Palmas - Taquaralto
    public static final Setor setorCentralTaquaraltoPalmas = new Setor(
            2019,
            "Setor Central",
            "Centro do bairro Taquaralto em Palmas.",
            6.3,
            5.6,
            6.5,
            6.2,
            CoberturaAtiva.SIM,
            RegiaoMock.taquaraltoPalmas,
            2300.0,
            "Comércio e serviços."
    );
    public static final Setor setorPerifericoTaquaraltoPalmas = new Setor(
            2020,
            "Setor Periférico",
            "Periferia do bairro Taquaralto em Palmas.",
            6.7,
            6.0,
            6.5,
            6.3,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.taquaraltoPalmas,
            1900.0,
            "Área em desenvolvimento."
    );

    // Gurupi - Centro
    public static final Setor setorNorteCentroGurupi = new Setor(
            2021,
            "Setor Norte",
            "Parte norte do Centro em Gurupi.",
            6.0,
            5.3,
            5.5,
            5.2,
            CoberturaAtiva.SIM,
            RegiaoMock.centroGurupi,
            2100.0,
            "Comércio central."
    );
    public static final Setor setorSulCentroGurupi = new Setor(
            2022,
            "Setor Sul",
            "Parte sul do Centro em Gurupi.",
            6.4,
            5.7,
            5.5,
            5.3,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.centroGurupi,
            1800.0,
            "Área residencial."
    );

    // Gurupi - Setor Universitário
    public static final Setor setorLesteSetorUniversitarioGurupi = new Setor(
            2023,
            "Setor Leste",
            "Parte leste do Setor Universitário em Gurupi.",
            5.8,
            5.1,
            4.5,
            4.3,
            CoberturaAtiva.SIM,
            RegiaoMock.setorUniversitarioGurupi,
            1600.0,
            "Próximo à universidade."
    );
    public static final Setor setorOesteSetorUniversitarioGurupi = new Setor(
            2024,
            "Setor Oeste",
            "Parte oeste do Setor Universitário em Gurupi.",
            6.2,
            5.5,
            4.5,
            4.4,
            CoberturaAtiva.PARCIALMENTE,
            RegiaoMock.setorUniversitarioGurupi,
            1400.0,
            "Área de expansão."
    );
}