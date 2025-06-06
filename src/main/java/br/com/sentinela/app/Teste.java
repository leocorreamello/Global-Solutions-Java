package main.java.br.com.sentinela.app;

import main.java.br.com.sentinela.alerta.Alerta;
import main.java.br.com.sentinela.atores.Autoridade;
import main.java.br.com.sentinela.geolocalizacao.Cidade;
import main.java.br.com.sentinela.geolocalizacao.Estado;
import main.java.br.com.sentinela.geolocalizacao.Regiao;
import main.java.br.com.sentinela.geolocalizacao.Setor;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

import java.time.LocalDateTime;

public class Teste {

    public static void main(String[] args) {

        Estado saoPaulo = new Estado(
                1,
                "São Paulo",
                "Estado mais populoso do Brasil",
                2.5,
                3.2,
                248222.8,
                220000.0,
                CoberturaAtiva.PARCIALMENTE,
                "SP"
        );

        Cidade sorocaba = new Cidade(
                101,
                "Sorocaba",
                "Cidade de Sorocaba",
                3.0,
                3.5,
                1521.11,
                1500.0,
                CoberturaAtiva.SIM,
                saoPaulo,
                "SOR"
        );

        Regiao zonaRural = new Regiao(
                201,
                "Zona Rural",
                "Região industrial de Sorocaba com várias fábricas",
                4.2,
                3.8,
                320.5,
                315.0,
                CoberturaAtiva.SIM,
                sorocaba
        );

        Setor setorFazendasSul = new Setor(
                301,
                "Setor Fazendas Sul",
                "Área de plantações com alto risco de queimadas na estação seca",
                4.8,
                4.2,
                150.75,
                145.5,
                CoberturaAtiva.SIM,
                zonaRural,
                12.5,
                "Histórico de queimadas nos últimos 3 anos durante períodos de estiagem. " +
                        "Necessita de monitoramento intensificado entre junho e setembro."
        );

        Alerta alertaQueimada = new Alerta(
                1001,
                setorFazendasSul,
                "Alerta de Queimada - Setor Fazendas Sul",
                "Detectado foco de incêndio em área de plantação de cana-de-açúcar. Propagação rápida devido a ventos fortes e vegetação seca.",
                Alerta.TipoAlerta.QUEIMADA,
                "Focos de calor detectados por satélite às 14:30. Propagação na direção sudeste.",
                "Mobilizar equipes de combate a incêndio imediatamente. Acesso pelo portão sul da fazenda Santa Rita.",
                "Incêndio de grande porte em área rural. Fumaça pode afetar visibilidade e qualidade do ar.",
                "Evite a região. Mantenha janelas fechadas se estiver na direção do vento.",
                Alerta.NivelCriticidade.ALTO,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(48),
                "Sistema de Monitoramento por Satélite",
                Alerta.StatusAlerta.EM_ANDAMENTO
        );

        Autoridade brigadaIncendioRural = new Autoridade(
                2001,
                "Brigada de Incêndio Rural responsável pelo combate a queimadas na região de Sorocaba",
                true,
                "(15) 3333-4444",
                "brigada.rural@sorocaba.sp.gov.br",
                "Capitão Roberto Silva",
                Autoridade.TipoAutoridade.MUNICIPAL,
                "Brigada de Incêndio Rural de Sorocaba"
        );


        System.out.println(saoPaulo.gerarResumo());
        System.out.println(sorocaba.gerarResumo());
        System.out.println(zonaRural.gerarResumo());
        System.out.println("\n" + setorFazendasSul.gerarResumo() + "\n");

        setorFazendasSul.estimarPopulacao(setorFazendasSul, zonaRural);
        setorFazendasSul.enviarAlertaImediato();
        System.out.println("\n");

        alertaQueimada.enviarParaAutoridades();
        System.out.println("\n");

        System.out.println(brigadaIncendioRural.resolverAlertaQueimada(setorFazendasSul.getNome()));

    }
}