package semana03.matriz;

import java.util.Scanner;

public class TotalInvestido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] investidos = new float[3][2];
        float[] soma;
        int i, j;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 2; j++) {
                System.out.printf("Digite o ibesvimento do fundo %d: ", i + 1);
                investidos[i][j] = sc.nextFloat();
            }
        }

        soma = somaDasLinhas(investidos);
        for (i = 0; i < 3; i++) {
            System.out.printf("Total investidos no fundoo %d: %.2f \n",i ,soma[i]);
        }
    }

    public static float[] somaDasLinhas(float[][] investidos) {
        int i, j;
        float soma = 0;
        float[] somaLinha = new float[3];

        for(i = 0; i < 3; i++){
            for(j = 0; j < 2; j++) {
                soma = soma + investidos[i][j];
            }
            somaLinha[i] = soma;
            soma = 0;
        }

        return somaLinha;
    }
}
