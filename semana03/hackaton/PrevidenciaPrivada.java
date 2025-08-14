package semana03.hackaton;

import java.util.Scanner;

//Erick Molnar
//Anderson Martins
//Rauni Laun
//Israel Junior
//Vinicius Augusto Batista

public class PrevidenciaPrivada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Variáveis principais (poderão ser preenchidas na opção 1)
        int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0, i, anos = 0, qntTaxas = 0, j;
        double contribuicaoMensal = 0;
        double taxaMensal = 0;
        double[] taxasMensais = new double [anos];
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
                    // >>> INSERIR DADOS (ler do usuário e armazenar nas variáveis)
                    System.out.print("Digite a sua idade: ");
                    idadeAtual = sc.nextInt();

                    while(idadeAtual <= 0){
                        System.out.println("Idade invalida! Tente novamente.");
                        System.out.print("Digite a sua idade: ");
                        idadeAtual = sc.nextInt();
                    }

                    System.out.print("Digite a idade que voce deseja se aposentar: ");
                    idadeAposentadoria = sc.nextInt();

                    while(idadeAposentadoria <= 0){
                        System.out.println("Idade invalida! Tente novamente.");
                        System.out.print("Digite a sua idade de aposentadoria: ");
                        idadeAposentadoria = sc.nextInt();
                    }

                    System.out.print("Digite sua contribuição mensal: ");
                    contribuicaoMensal = sc.nextDouble();

                    while(contribuicaoMensal <= 0){
                        System.out.println("Valor invalido! Tente novamente.");
                        System.out.print("Digite sua contribuição mensal: ");
                        contribuicaoMensal = sc.nextDouble();
                    }

                    break;

                case 2:
                    // >>> CHAMAR O MÉTODO calcularSaldoAnual() e armazenar no vetor saldoAnual
                    System.out.print("Digite a taxa mensal esperada: ");
                    taxaMensal = sc.nextDouble();
                    taxaMensal = taxaMensal / 100;

                    saldoAnual = calcularSaldoAnual(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxaMensal);

//                    for(i = 0; i < saldoAnual.length; i++){
//                        System.out.printf("Saldo ao final do ano %d: %.2f \n", i + 1, saldoAnual[i]);
//                    }
                    break;

                case 3:
                    // >>> CHAMAR O MÉTODO gerarMatrizCenarios() e armazenar na matriz matrizCenarios
                    System.out.println("Informe a quantidade de taxas: ");
                    qntTaxas = sc.nextInt();

                    while (qntTaxas < 3){
                        System.out.println("Valor insuficiente! Tente novamente.");
                        System.out.println("Informe a quantidade de taxas: ");
                        qntTaxas = sc.nextInt();
                    }

                    taxasMensais = new double[qntTaxas];

                    for(i = 0; i < qntTaxas; i++){
                        System.out.printf("Digite a taxa %d: ", i + 1);
                        taxasMensais[i] = sc.nextDouble() / 100;
                    }
                    matrizCenarios = gerarMatrizCenarios(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxasMensais);

//                    for(i = 0; i < matrizCenarios.length; i++){
//                        System.out.println();
//                        for(j = 0; j < matrizCenarios[0].length; j++){
//                            System.out.printf("%.2f ||", matrizCenarios[i][j]);
//                        }
//                    }
                    break;

                case 4:
                    // >>> CHAMAR O MÉTODO calcularRendaMensal() e armazenar no vetor rendaMensal
                    System.out.print("Digite sua expectativa de vida: ");
                    expectativaVida = sc.nextInt();
                    rendaMensal = calcularRendaMensal(matrizCenarios, taxasMensais, expectativaVida);

//                    for(i = 0; i < rendaMensal.length; i++) {
//                        System.out.printf("Renda mensal: %.2f \n", rendaMensal[i]);
//                    }
                    break;

                case 5:
                    // >>> CHAMAR O MÉTODO exibirResultados() para mostrar tudo
                    exibirResultados(saldoAnual, matrizCenarios, taxasMensais, rendaMensal);
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

    // ================================
    // ===== MÉTODOS ESTÁTICOS ========
    // ================================

    // 1. Cálculo do saldo acumulado ano a ano (Vetor)
    public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaMensal) {
        // >>> IMPLEMENTAR O CÁLCULO DO SALDO ANUAL
        int anos = 0, meses = 0, i;
        double saldo = 0;
        double[] saldoAnual;

        anos = idadeAposentadoria - idadeAtual;
        meses = anos *  12;

        saldoAnual = new double[anos];


        for( i = 0; i < anos; i++){
            meses = (i + 1) * 12;
            saldo = contribuicaoMensal * (Math.pow((1 + taxaMensal), meses) - 1) / taxaMensal;
            saldoAnual[i] = saldo;
        }

        return saldoAnual;
    }

    // 2. Projeção com cenários diferentes (Matriz)
        // >>> IMPLEMENTAR O CÁLCULO DA MATRIZ DE CENÁRIOS
    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasMensais) {
        int anos = idadeAposentadoria - idadeAtual;
        int totalMeses = anos * 12;
        double[][] matriz = new double[taxasMensais.length][anos];

        for (int i = 0; i < taxasMensais.length; i++) {
            double saldo = 0;
            double taxa = taxasMensais[i];

            for (int mes = 1; mes <= totalMeses; mes++) {
                saldo *= (1 + taxa);
                saldo += contribuicaoMensal;

                if (mes % 12 == 0) {
                    int ano = mes / 12 - 1;
                    matriz[i][ano] = saldo;
                }
            }
        }

        return matriz;
    }

    // 3. Cálculo da renda mensal na aposentadoria
    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasMensais, int expectativaVida) {
        // >>> IMPLEMENTAR O CÁLCULO DA RENDA MENSAL PARA CADA CENÁRIO
            double[] saldosAcumulados = new double[matrizCenarios.length];

            for (int i = 0; i < matrizCenarios.length; i++) {
                saldosAcumulados[i] = matrizCenarios[i][matrizCenarios[i].length-1];
            }
            double[] rendaMensal = new double[matrizCenarios.length];
            for (int i = 0; i < rendaMensal.length ; i++) {
                rendaMensal[i] =  saldosAcumulados[i] * (taxasMensais[i] / (1-Math.pow((1+taxasMensais[i]),(-expectativaVida*12))));
            }
            return rendaMensal;
    }

    // 4. Exibir todos os resultados
    public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasMensais, double[] rendaMensal) {
        // >>> IMPLEMENTAR A EXIBIÇÃO DOS RESULTADOS
        int i, j;

        System.out.println("==========SALDOO ANUAL==========");
        for(i = 0; i < saldoAnual.length; i++){
            System.out.printf("Saldo ao final do ano %d: %.2f \n", i + 1, saldoAnual[i]);
        }

        System.out.println("==========MATRIZ CENARIOS==========");
        for(i = 0; i < matrizCenarios.length; i++){
            System.out.println();
            for(j = 0; j < matrizCenarios[0].length; j++){
                System.out.printf("%.2f ||", matrizCenarios[i][j]);
            }
        }

        System.out.println();
        System.out.println("==========RENDA MENSAL==========");
        for(i = 0; i < rendaMensal.length; i++) {
            System.out.printf("\nRenda mensal: %.2f ", rendaMensal[i]);
        }
    }
}
