package semana03.matriz;

import java.util.Scanner;

public class Taxa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] taxas = new float[2][2];
        float[] media;
        float menor;
        int i, j;

        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                System.out.printf("Digite a taxa do mes %d: ", j + 1);
                taxas[i][j] = sc.nextFloat();
            }
        }

        menor = menorTaxa(taxas);
        System.out.println("Menor taxa: " + menor);

        media = mediaTaxas(taxas);
        for(i = 0; i < 2; i++) {
            System.out.printf("Media taxa %d: %f \n", i + 1, media[i]);
        }
    }

    public static float menorTaxa(float[][] taxas) {
        int i, j;
        float menor = taxas[0][0];

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                if(taxas[i][j] < menor){
                    menor = taxas[i][j];
                }
            }
        }
        return menor;
    }

    public static float[] mediaTaxas(float [][] taxas) {
        int i, j;
        float soma = 0;
        float [] medias = new float[3];

        for(j = 0; j < 2; j++) {
            for(i = 0; i < 2; i++) {
                soma = soma + taxas[j][i];
            }
            medias[j] = soma / 2;
            soma = 0;
        }
        return medias;
    }
}
