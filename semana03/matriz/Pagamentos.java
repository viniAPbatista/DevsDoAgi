package semana03.matriz;

import java.util.Scanner;

public class Pagamentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] pagamentos = new float[3][3];
        float media;
        float maiorpagador;
        int i, j;

        for(i= 0; i < pagamentos.length; i++) {
            for(j= 0; j < pagamentos[0].length; j++) {
                System.out.printf("Digite o pagamento do cliente %d: ", i + 1);
                pagamentos[i][j] = sc.nextFloat();
            }
        }

        media = mediaTotalPagamentos(pagamentos);
        System.out.println("Media total pagamentos: " + media);

        maiorpagador = clienteMaiorPagamento(pagamentos);
        System.out.println("Maior Pagador: " + maiorpagador);
    }

    public static float mediaTotalPagamentos(float[][] pagamentos) {
        int i, j;
        float soma = 0;

        for(i = 0; i < pagamentos.length; i++){
            for(j = 0; j < pagamentos[0].length; j++) {
                soma = soma + pagamentos[i][j];
            }
        }
        return soma / (pagamentos.length * pagamentos[0].length);
    }

    public static float clienteMaiorPagamento(float[][] pagamentos) {
        int i, j;
        float maior = pagamentos[0][0];
        float[] maiorPagador = new float [3];

        for(i = 0; i < pagamentos.length; i++){
            for(j = 0; j < pagamentos[0].length; j++) {
                if(pagamentos[i][j] > maior){
                    maior = pagamentos[i][j];
                }
            }
            maiorPagador[i] = maior;
        }

        for(i = 1; i < maiorPagador.length; i++) {
            if(maiorPagador[i] > maiorPagador[i - 1]) {
                maior = maiorPagador[i];
            }
        }

        return maior;
    }
}
