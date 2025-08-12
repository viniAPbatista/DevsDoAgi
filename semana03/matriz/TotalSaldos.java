package semana02.matriz;

import java.util.Scanner;

public class TotalSaldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] saldos = new float[3][2];
        float total;
        float [] media;
        int i, j;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 2; j++) {
                System.out.printf("Digite um valor (cliente %d): ", i + 1);
                saldos[i][j] = sc.nextFloat();
            }
        }

        total = somaTotal(saldos);
        System.out.println("Soma total: " + total);

        media = mediaClientes(saldos);
        for(i = 0; i < media.length; i++) {
            System.out.printf("Media cliente %d: %f \n", i + 1, media[i]);
        }
    }

    public static float somaTotal(float [][] saldos) {
        int i, j;
        float soma = 0;

        for(i= 0; i < 3; i++) {
            for(j = 0; j < 2; j++) {
                soma = soma + saldos[i][j];
            }
        }
        return soma;
    }

    public static float[] mediaClientes(float [][] saldos) {
        int i, j;
        float soma = 0;
        float[] media = new float [3];

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 2; j++) {
                soma = soma + saldos[i][j];
            }
            media[i] = soma / saldos[j].length;
            soma = 0;
        }
        return media;
    }
}
