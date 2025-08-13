package semana03.vetores;

import java.util.Scanner;

public class Drawdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];

        System.out.println("Digite os preços de fechamento da ação (10 dias):");
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        double[] dd = drawdowns(precos);

        System.out.println("\nDrawdowns diários (%):");
        for (int i = 0; i < dd.length; i++) {
            System.out.printf("Dia %d: %.2f%%\n", (i + 1), dd[i]);
        }

        double maiorDD = maiorDrawdown(precos);
        System.out.printf("\nMaior drawdown do período: %.2f%%\n", maiorDD);

        sc.close();
    }

    public static double[] drawdowns(double[] precos) {
        double[] dd = new double[precos.length];
        double maxAnterior = precos[0];

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > maxAnterior) {
                maxAnterior = precos[i];
            }
            dd[i] = ((precos[i] - maxAnterior) / maxAnterior) * 100;
        }

        return dd;
    }

    public static double maiorDrawdown(double[] precos) {
        double[] dd = drawdowns(precos);
        double menor = dd[0];

        for (double valor : dd) {
            if (valor < menor) {
                menor = valor;
            }
        }

        return menor;
    }
}