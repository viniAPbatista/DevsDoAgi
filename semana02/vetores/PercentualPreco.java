package semana02.vetores;

import java.util.Scanner;

public class PercentualPreco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] preco = new float[5];
        float[] variacoes = new float[5];
        int i;

        for(i = 0; i < preco.length; i++) {
            System.out.printf("Digite o preco no dia %d: ", i + 1);
            preco[i] = sc.nextFloat();
        }

        variacoes = variacoesDiarias(preco);

        for(i = 0; i < variacoes.length - 1; i++) {
            System.out.printf("Variacao %d: %.2f \n", i + 1, variacoes[i]);
        }
    }

    public static float[] variacoesDiarias(float[] preco) {
        int i;
        float[] variacoes = new float [5];
        float variacaoDia;

        for(i = 0; i < preco.length - 1; i++) {
            variacaoDia = (preco[i + 1] / preco[i] - 1) * 100;
            variacoes[i] = variacaoDia;
        }
        return variacoes;
    }
}