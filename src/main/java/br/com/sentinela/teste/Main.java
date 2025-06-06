package main.java.br.com.sentinela.teste;

import main.java.br.com.sentinela.alerta.Alerta;
import main.java.br.com.sentinela.atores.Autoridade;
import main.java.br.com.sentinela.geolocalizacao.Cidade;
import main.java.br.com.sentinela.geolocalizacao.Estado;
import main.java.br.com.sentinela.geolocalizacao.Regiao;
import main.java.br.com.sentinela.geolocalizacao.Setor;
import main.java.br.com.sentinela.utils.CoberturaAtiva;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do Estado
        System.out.println("=== CADASTRO DE ESTADO ===");
        System.out.print("ID: ");
        int idEstado = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nomeEstado = scanner.nextLine();
        System.out.print("Descrição: ");
        String descEstado = scanner.nextLine();
        System.out.print("Nível de risco atual: ");
        double riscoAtualE = Double.parseDouble(scanner.nextLine());
        System.out.print("Nível de risco previsto: ");
        double riscoPrevistoE = Double.parseDouble(scanner.nextLine());
        System.out.print("Área total (km²): ");
        double areaTotalE = Double.parseDouble(scanner.nextLine());
        System.out.print("Área monitorada (km²): ");
        double areaMonitoradaE = Double.parseDouble(scanner.nextLine());
        System.out.print("Cobertura ativa (SIM/NAO/PARCIALMENTE): ");
        CoberturaAtiva coberturaE = CoberturaAtiva.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Sigla: ");
        String siglaE = scanner.nextLine();

        Estado estado = new Estado(idEstado, nomeEstado, descEstado, riscoAtualE,
                riscoPrevistoE, areaTotalE, areaMonitoradaE, coberturaE, siglaE);

        // Cadastro da Cidade
        System.out.println("\n=== CADASTRO DE CIDADE ===");
        System.out.print("ID: ");
        int idCidade = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nomeCidade = scanner.nextLine();
        System.out.print("Descrição: ");
        String descCidade = scanner.nextLine();
        System.out.print("Nível de risco atual: ");
        double riscoAtualC = Double.parseDouble(scanner.nextLine());
        System.out.print("Nível de risco previsto: ");
        double riscoPrevistoC = Double.parseDouble(scanner.nextLine());
        System.out.print("Área total (km²): ");
        double areaTotalC = Double.parseDouble(scanner.nextLine());
        System.out.print("Área monitorada (km²): ");
        double areaMonitoradaC = Double.parseDouble(scanner.nextLine());
        System.out.print("Cobertura ativa (SIM/NAO/PARCIALMENTE): ");
        CoberturaAtiva coberturaC = CoberturaAtiva.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Sigla: ");
        String siglaC = scanner.nextLine();

        Cidade cidade = new Cidade(idCidade, nomeCidade, descCidade, riscoAtualC,
                riscoPrevistoC, areaTotalC, areaMonitoradaC, coberturaC, estado, siglaC);

        // Cadastro da Região
        System.out.println("\n=== CADASTRO DE REGIÃO ===");
        System.out.print("ID: ");
        int idRegiao = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nomeRegiao = scanner.nextLine();
        System.out.print("Descrição: ");
        String descRegiao = scanner.nextLine();
        System.out.print("Nível de risco atual: ");
        double riscoAtualR = Double.parseDouble(scanner.nextLine());
        System.out.print("Nível de risco previsto: ");
        double riscoPrevistoR = Double.parseDouble(scanner.nextLine());
        System.out.print("Área total (km²): ");
        double areaTotalR = Double.parseDouble(scanner.nextLine());
        System.out.print("Área monitorada (km²): ");
        double areaMonitoradaR = Double.parseDouble(scanner.nextLine());
        System.out.print("Cobertura ativa (SIM/NAO/PARCIALMENTE): ");
        CoberturaAtiva coberturaR = CoberturaAtiva.valueOf(scanner.nextLine().toUpperCase());

        Regiao regiao = new Regiao(idRegiao, nomeRegiao, descRegiao, riscoAtualR,
                riscoPrevistoR, areaTotalR, areaMonitoradaR, coberturaR, cidade);

        // Cadastro do Setor
        System.out.println("\n=== CADASTRO DE SETOR ===");
        System.out.print("ID: ");
        int idSetor = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nomeSetor = scanner.nextLine();
        System.out.print("Descrição: ");
        String descSetor = scanner.nextLine();
        System.out.print("Nível de risco atual: ");
        double riscoAtualS = Double.parseDouble(scanner.nextLine());
        System.out.print("Nível de risco previsto: ");
        double riscoPrevistoS = Double.parseDouble(scanner.nextLine());
        System.out.print("Área total (km²): ");
        double areaTotalS = Double.parseDouble(scanner.nextLine());
        System.out.print("Área monitorada (km²): ");
        double areaMonitoradaS = Double.parseDouble(scanner.nextLine());
        System.out.print("Cobertura ativa (SIM/NAO/PARCIALMENTE): ");
        CoberturaAtiva coberturaS = CoberturaAtiva.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Densidade populacional (hab/km²): ");
        double densidadePop = Double.parseDouble(scanner.nextLine());
        System.out.print("Observações: ");
        String observacoes = scanner.nextLine();

        Setor setor = new Setor(idSetor, nomeSetor, descSetor, riscoAtualS, riscoPrevistoS,
                areaTotalS, areaMonitoradaS, coberturaS, regiao, densidadePop, observacoes);

        // Cadastro do Alerta
        System.out.println("\n=== CADASTRO DE ALERTA ===");
        System.out.print("ID: ");
        int idAlerta = Integer.parseInt(scanner.nextLine());
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descrição: ");
        String descAlerta = scanner.nextLine();
        System.out.print("Tipo (QUEIMADA/INUNDACAO/DESLIZAMENTO/VENDAVAL/OUTRO): ");
        Alerta.TipoAlerta tipoAlerta = Alerta.TipoAlerta.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Informação para autoridades: ");
        String infoAutoridade = scanner.nextLine();
        System.out.print("Recomendação para autoridades: ");
        String recomAutoridade = scanner.nextLine();
        System.out.print("Informação para comunidade: ");
        String infoComunidade = scanner.nextLine();
        System.out.print("Recomendação para comunidade: ");
        String recomComunidade = scanner.nextLine();
        System.out.print("Nível de criticidade (BAIXO/MEDIO/ALTO/MUITO_ALTO): ");
        Alerta.NivelCriticidade criticidade = Alerta.NivelCriticidade.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Origem da geração: ");
        String origem = scanner.nextLine();
        System.out.print("Status (ATIVO/EM_ANDAMENTO/FINALIZADO/CANCELADO): ");
        Alerta.StatusAlerta status = Alerta.StatusAlerta.valueOf(scanner.nextLine().toUpperCase());

        // Data de emissão atual e validade de 48h
        LocalDateTime dataEmissao = LocalDateTime.now();
        LocalDateTime dataValidade = dataEmissao.plusHours(48);

        Alerta alerta = new Alerta(idAlerta, setor, titulo, descAlerta, tipoAlerta,
                infoAutoridade, recomAutoridade, infoComunidade, recomComunidade,
                criticidade, dataEmissao, dataValidade, origem, status);

        // Cadastro da Autoridade
        System.out.println("\n=== CADASTRO DE AUTORIDADE ===");
        System.out.print("ID: ");
        int idAutoridade = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nomeAutoridade = scanner.nextLine();
        System.out.print("Descrição: ");
        String descAutoridade = scanner.nextLine();
        System.out.print("Recebe alertas (true/false): ");
        boolean recebeAlertas = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Nome do responsável: ");
        String responsavel = scanner.nextLine();
        System.out.print("Tipo (MUNICIPAL/ESTADUAL/FEDERAL/ONG/PRIVADA): ");
        Autoridade.TipoAutoridade tipoAutoridade = Autoridade.TipoAutoridade.valueOf(scanner.nextLine().toUpperCase());

        Autoridade autoridade = new Autoridade(idAutoridade, descAutoridade,
                recebeAlertas, telefone, email, responsavel, tipoAutoridade, nomeAutoridade);

        // Exibindo informações dos objetos
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("\n=== RESUMO DOS CADASTROS ===");

        System.out.println("\n>> ESTADO");
        System.out.println(estado.gerarResumo());
        System.out.println("Sigla: " + estado.getSigla());
        System.out.println("Área total: " + estado.getAreaTotal() + " km²");

        System.out.println("\n>> CIDADE");
        System.out.println(cidade.gerarResumo());
        System.out.println("Sigla: " + cidade.getSigla());
        System.out.println("Área total: " + cidade.getAreaTotal() + " km²");

        System.out.println("\n>> REGIÃO");
        System.out.println(regiao.gerarResumo());
        System.out.println("Cidade: " + regiao.getIdCidade());
        System.out.println("Área total: " + regiao.getAreaTotal() + " km²");

        System.out.println("\n>> SETOR");
        System.out.println(setor.gerarResumo());
        System.out.println("Região: " + setor.getRegiao());
        System.out.println("Densidade populacional: " + setor.getDensidadeDemografica() + " hab/km²");
        System.out.println("Observações: " + setor.getObservacoes());

        System.out.println("\n>> ALERTA");
        System.out.println("ID: " + alerta.getIdAlerta());
        System.out.println("Título: " + alerta.getTitulo());
        System.out.println("Tipo: " + alerta.getTipoAlerta());
        System.out.println("Setor: " + alerta.getIdSetor().getNome());
        System.out.println("Criticidade: " + alerta.getNivelCriticidade());
        System.out.println("Emissão: " + alerta.getDataEmissao().format(dtf));
        System.out.println("Validade: " + alerta.getDataValidade().format(dtf));

        System.out.println("\n>> AUTORIDADE");
        System.out.println("ID: " + autoridade.getIdAutoridade());
        System.out.println("Nome: " + autoridade.getNome());
        System.out.println("Tipo: " + autoridade.getTipoAutoridade());
        System.out.println("Responsável: " + autoridade.getResponsavelNome());
        System.out.println("Recebe alertas: " + (autoridade.isRecebeAlertas() ? "Sim" : "Não"));

        // Demonstrando as funcionalidades
        System.out.println("\n=== DEMONSTRAÇÃO DE FUNCIONALIDADES ===");
        setor.estimarPopulacao(setor, regiao);
        setor.enviarAlertaImediato();
        alerta.enviarParaAutoridades();
        System.out.println(autoridade.resolverAlertaQueimada(setor.getNome()));

        scanner.close();
    }
}