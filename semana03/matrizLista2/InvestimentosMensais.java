package semana03.matrizLista2;

import java.util.Scanner;

public class InvestimentosMensais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] investimento;
        float rentabilidade;
        int qntFundos, meses, fundo, fundoMaisRentavel, i, j;

        System.out.print("Digite quantos fundos voce possue: ");
        qntFundos = sc.nextInt();

        System.out.print("Digite quantos meses: ");
        meses = sc.nextInt();

        investimento = new float[qntFundos][meses];

        for(i = 0; i < qntFundos; i++) {
            for(j = 0; j < meses; j++) {
                System.out.printf("Digite o investimeto no fundo %d no mes %d: ", i + 1, j + 1);
                investimento[i][j] = sc.nextFloat();
            }
        }

        System.out.printf("Quanfo fundo voce deseja ver a rentabilidade: ");
        fundo = sc.nextInt();

        rentabilidade = rentabilidade(investimento, fundo);
        System.out.println("Rentabilidade: " + rentabilidade);

        fundoMaisRentavel = fundoMaisRentavel(investimento);
        System.out.println("Fundo mais rentavel: " + fundoMaisRentavel);
    }

    public static float rentabilidade(float [][] investimento, int fundo) {
        float dia1 = investimento[fundo][0];
        float ultimoDia = investimento[fundo][investimento[0].length - 1];
        float rentabilidade;

        rentabilidade = ((ultimoDia - dia1) / dia1) * 100;

        return rentabilidade;
    }

    public static int fundoMaisRentavel(float [][] investimentos) {

    }
}
