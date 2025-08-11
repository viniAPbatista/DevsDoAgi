package semana02.vetores;

import java.util.Scanner;

public class CarteiraInvestimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] acoes = new float [5];
        float[] percentual = new float[5];
        float total;
        int i;

        for(i = 0; i < acoes.length; i++) {
            System.out.printf("Digite o valor da acao %d: ", i + 1);
            acoes[i] = sc.nextFloat();
        }

        total = totalInvestido(acoes);
        System.out.println("Total investido: " + total);

        percentual = percentualPorAcao(acoes, total);

        for(i = 0; i < percentual.length; i++) {
            System.out.printf("Percentual da acao %d: %.2f \n", i + 1, percentual[i]);
        }
    }

    public static float totalInvestido(float[] acoes) {
        int i;
        float total = 0;

        for(i = 0; i < acoes.length; i++) {
            total = total + acoes[i];
        }
        return total;
    }

    public static float[] percentualPorAcao(float[] acoes, float total) {
        int i;
        float[] porcentagem = new float [5];

        for(i = 0; i < acoes.length; i++) {
            porcentagem[i] = (acoes[i] / total) * 100;
        }
        return porcentagem;
    }
}
