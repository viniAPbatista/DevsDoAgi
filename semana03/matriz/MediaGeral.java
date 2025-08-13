package semana03.matriz;

import java.util.Scanner;

public class MediaGeral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] vendas = new float[3][3];
        float[] somaVendedores;
        float mediaGeral;
        int i, j;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.printf("Digite as vendas do vendedor %d: ", i + 1);
                vendas[i][j] = sc.nextFloat();
            }
        }

        mediaGeral = calculaMediaGeral(vendas);
        System.out.println("Media geral: " + mediaGeral);

        somaVendedores = somaPorVendedor(vendas);
        for(i = 0; i < somaVendedores.length; i++) {
            System.out.printf("Soma vendedor %d: %f \n", i, somaVendedores[i]);
        }
    }

    public static float calculaMediaGeral(float [][] vendas) {
        int i, j;
        float soma = 0;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                soma = soma + vendas[i][j];
            }
        }

        return soma / 9;
    }

    public static float[] somaPorVendedor(float [][] vendas) {
        int i, j;
        float[] somaVendedores = new float[3];
        float soma = 0;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                soma = soma + vendas[i][j];
            }
            somaVendedores[i] = soma;
            soma = 0;
        }

        return somaVendedores;
    }
}
