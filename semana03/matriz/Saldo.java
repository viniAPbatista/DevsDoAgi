package semana03.matriz;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] saldo = new float[2][3];
        float[] saldoMaximoConta;
        float saldoTotal;
        int i, j;

        for(i = 0; i < saldo.length; i++) {
            for(j = 0; j < saldo[0].length; j++) {
                System.out.print("Digite o seu saldo: ");
                saldo[i][j] = sc.nextFloat();
            }
        }

        saldoTotal = saldoTotalAcuulado(saldo);
        System.out.println("Saldo total: " + saldoTotal);

        saldoMaximoConta = saldoMaximoPorLinha(saldo);
        for(i = 0; i < saldoMaximoConta.length; i++) {
            System.out.printf("Saldo maximo conta %d: %.2f \n", i + 1, saldoMaximoConta[i]);
        }
    }

    public static float saldoTotalAcuulado(float[][] saldo) {
        int i, j;
        float soma = 0;

        for(i = 0; i < saldo.length; i++){
            for (j = 0; j < saldo[0].length; j++) {
                soma = soma + saldo[i][j];
            }
        }

        return soma;
    }

    public static float[] saldoMaximoPorLinha(float[][] saldos) {
        int i, j;
        float maior = saldos[0][0];
        float[] maiorMes = new float[2];

        for(i = 0; i < saldos.length; i++){
            for(j = 0; j < saldos[0].length; j++) {
                if(saldos[i][j] > maior){
                    maior = saldos[i][j];
                }
            }
            maiorMes[i] = maior;
            maior = 0;
        }

        return maiorMes;
    }
}
