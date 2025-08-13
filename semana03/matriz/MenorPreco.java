package semana03.matriz;

import java.util.Scanner;

public class MenorPreco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] precos = new float[2][3];
        float[] menorPreco;
        int i, j;

        for(i = 0; i < 2; i++) {
            for(j = 0; j < 3; j++) {
                System.out.printf("Digite os valores da loja %d: ", i + 1);
                precos[i][j] = sc.nextFloat();
            }
        }
        menorPreco = encontrarMenorPreco(precos);
        for(i = 0; i < menorPreco.length; i++) {
            System.out.printf("Menor preco loja %d: %.2f \n", i, menorPreco[i]);
        }
    }

    public static float[] encontrarMenorPreco(float [][] precos) {
        int i, j;
        float menor = precos[0][0];
        float[] menorPreco = new float[2];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                if(precos[i][j] < menor) {
                    menor = precos[i][j];
                }
                menorPreco[i] = menor;
            }
            menor = precos[1][0];
        }
        return menorPreco;
    }
}
