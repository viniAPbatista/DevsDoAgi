package semana03.matriz;

import java.util.Scanner;

public class TotalVendido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] vendas = new float[3][2];
        float[] somaMes;
        int i, j;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 2; j++) {
                System.out.printf("Digite a quatidade de produtos no mes %d: ", j + 1);
                vendas[i][j] = sc.nextFloat();
            }
        }
        somaMes = somaVendasMes(vendas);
        for(i = 0; i < somaMes.length; i++) {
            System.out.printf("Soma mes %d: %.2f \n", i + 1, somaMes[i]);
        }
    }

    public static float[] somaVendasMes(float [][] vendas) {
        int i, j;
        float soma = 0;
        float[] somaMes = new float[3];

        for(i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                soma = soma + vendas[i][j];
            }
            somaMes[i] = soma;
            soma = 0;
        }
        return somaMes;
    }
}
