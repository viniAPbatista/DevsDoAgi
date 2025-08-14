package semana03.hackaton;

import java.util.Scanner;
/*
HACKTOON 14/08 - Devs do Agi 2º Semestre/2025

Erick Maicon Lima de Almeida
Gabriel Fabri
Gabriel Rosa
Henrique De Antonio Neto
Nelson Damico
 */

//numero de cenarios - validacao
//falta de comentarios = - 5 pontos
//O método 2 pedia 3 diferentes cenários, porém vocês repetem o 1° cenário no método 2 e permite o usuário
//colocar menos de 3 cenários = - 3 pontos;

public class TesterHackatonGrupo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0;
        double contribuicaoMensal = 0;
        double[] taxasMensais = null;
        double[] saldoAnual = null;
        double[][] matrizCenarios = null;
        double[] rendaMensal = null;

        do {
            System.out.println("\n===== MENU SIMULADOR DE PREVIDÊNCIA =====");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Calcular saldo anual (vetor)");
            System.out.println("3 - Gerar matriz de cenários");
            System.out.println("4 - Calcular renda mensal na aposentadoria");
            System.out.println("5 - Exibir todos os resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com a idade atual do cliente: ");
                    idadeAtual = sc.nextInt();
                    System.out.println("Entre com a idade de aposentadoria do cliente: ");
                    idadeAposentadoria = sc.nextInt();
                    System.out.println("Entre com a expectativa de vida do cliente após a aposentadoria: ");
                    expectativaVida = sc.nextInt();
                    System.out.println("Entre com a contribuição mensal: ");
                    contribuicaoMensal = sc.nextDouble();

                    System.out.println("Quantos cenários de taxa mensal o cliente deseja conferir?: ");
                    int quantTaxas = sc.nextInt();

                    taxasMensais = new double[quantTaxas];
                    for (int i = 0; i < taxasMensais.length; i++){
                        System.out.println("Entre com o valor da taxa " + (i+1) + ": ");
                        taxasMensais[i] = sc.nextDouble()/100;
                    }
                    System.out.println("Dados inseridos com sucesso!");
                    break;

                case 2:
                    if (idadeAtual > 0 && contribuicaoMensal > 0 && taxasMensais != null && taxasMensais.length > 0) {

                        saldoAnual = calcularSaldoAnual(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxasMensais[0]);
                        System.out.println("Cálculo do saldo anual finalizado!");
                    } else {
                        System.out.println("Por favor, insira os dados na Opção 1 primeiro.");
                    }
                    break;

                case 3:
                    if (idadeAtual > 0 && contribuicaoMensal > 0 && taxasMensais != null && taxasMensais.length > 0) {
                        matrizCenarios = gerarMatrizCenarios(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxasMensais);
                        System.out.println("Matriz de cenários gerada com sucesso!");
                    } else {
                        System.out.println("Por favor, insira os dados na Opção 1 primeiro.");
                    }
                    break;

                case 4:
                    if (matrizCenarios != null && taxasMensais != null && taxasMensais.length > 0) {
                        rendaMensal = calcularRendaMensal(matrizCenarios, taxasMensais, expectativaVida);
                        System.out.println("Cálculo da renda mensal finalizado!");
                    } else {
                        System.out.println("Por favor, gere a matriz de cenários na Opção 3 primeiro.");
                    }
                    break;

                case 5:
                    if (matrizCenarios != null && rendaMensal != null) {

                        exibirResultados(saldoAnual, matrizCenarios, taxasMensais, rendaMensal);
                    } else {
                        System.out.println("Por favor, execute as opções 1, 3 e 4 primeiro.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("⚠ Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaMensal) {
        int anosContribuicao = idadeAposentadoria - idadeAtual;
        double[] saldoAnual = new double[anosContribuicao];

        for (int ano = 0; ano < anosContribuicao; ano++) {
            int meses = (ano + 1) * 12;
            if (taxaMensal == 0) {
                saldoAnual[ano] = contribuicaoMensal * meses;
            } else {
                double saldo = contribuicaoMensal * (Math.pow(1 + taxaMensal, meses) - 1) / taxaMensal;
                saldoAnual[ano] = saldo;
            }
        }
        return saldoAnual;
    }

    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasMensais) {
        int anosDeContribuicao = idadeAposentadoria - idadeAtual;
        int numCenarios = taxasMensais.length;
        double[][] matrizCenarios = new double[numCenarios][anosDeContribuicao];

        for (int i = 0; i < numCenarios; i++) {
            double taxaMensal = taxasMensais[i];

            if (taxaMensal == 0) {
                for (int j = 0; j < anosDeContribuicao; j++) {
                    matrizCenarios[i][j] = contribuicaoMensal * ((j + 1) * 12);
                }
            } else {
                for (int j = 0; j < anosDeContribuicao; j++) {
                    int mesesTotais = (j + 1) * 12;
                    double saldo = contribuicaoMensal * (Math.pow(1 + taxaMensal, mesesTotais) - 1) / taxaMensal;
                    matrizCenarios[i][j] = saldo;
                }
            }
        }
        return matrizCenarios;
    }

    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasMensais, int expectativaVida) {
        int numCenarios = matrizCenarios.length;
        double[] rendaMensal = new double[numCenarios];
        int mesesAposentadoria = expectativaVida * 12;

        for (int i = 0; i < numCenarios; i++) {
            double saldoFinal = matrizCenarios[i][matrizCenarios[i].length - 1];
            double taxaMensal = taxasMensais[i];

            if (taxaMensal == 0) {
                rendaMensal[i] = saldoFinal / mesesAposentadoria;
            } else {
                rendaMensal[i] = saldoFinal * (taxaMensal / (1 - Math.pow(1 + taxaMensal, -mesesAposentadoria)));
            }
        }
        return rendaMensal;
    }

    public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasMensais, double[] rendaMensal) {

        if(saldoAnual != null) {
            System.out.println("\n===== SALDO ANUAL (PRIMEIRO CENÁRIO) =====");
            for(int i = 0; i < saldoAnual.length; i++) {
                System.out.printf("Ano %d: R$ %.2f\n", (i + 1), saldoAnual[i]);
            }
        }
        if(matrizCenarios != null) {
            System.out.println("\n===== MATRIZ DE CENÁRIOS =====");
            for(int i = 0; i < matrizCenarios.length; i++) {
                System.out.printf("Cenário %d (Taxa %.2f%% a.m.):\n", (i+1), taxasMensais[i] * 100);
                for(int j = 0; j < matrizCenarios[i].length; j++) {
                    System.out.printf("  Ano %d: R$ %.2f\n", (j + 1), matrizCenarios[i][j]);
                }
            }
        }
        if(rendaMensal != null) {
            System.out.println("\n===== RENDA MENSAL NA APOSENTADORIA =====");
            for(int i = 0; i < rendaMensal.length; i++) {
                System.out.printf("Cenário %d (Taxa %.2f%% a.m.): R$ %.2f\n", (i+1), taxasMensais[i] * 100, rendaMensal[i]);
            }
        }
    }
}