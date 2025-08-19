package semana03.matrizLista2;

import java.util.Scanner;

public class SaquesDepositos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] valores;
        int movimentacoes, contas, i, j;
        float totalSacado, totalDepositado;
        float [] saldoFinal;

        System.out.print("Dgite a quantidade de movimentacoes: ");
        movimentacoes = sc.nextInt();

        System.out.print("Digite a quantidade de contas: ");
        contas = sc.nextInt();

        valores = new float[contas][movimentacoes];

        for(i = 0; i < valores.length; i++) {
            for(j = 0; j < valores[0].length; j++) {
                System.out.printf("Digite a movimentacao %d do cliente %d: ", j + 1, i + 1);
                valores[i][j] = sc.nextFloat();
            }
        }

        totalSacado = totalSaques(valores);
        System.out.println("Total sacado em todas as contas: " + totalSacado);

        totalDepositado = totalDepositos(valores);
        System.out.println("Total depositado em todas as contas: " + totalDepositado);

        saldoFinal = saldoFinalContas(valores);
        for(i = 0; i < saldoFinal.length; i++) {
            System.out.printf("Saldo final conta %d: %f \n", i + 1, saldoFinal[i]);
        }
    }

    public static float totalSaques(float [][] valores) {
        float totalSacado = 0;
        int i, j;

        for(i = 0;i < valores.length; i++) {
            for(j = 0; j < valores[0].length; j++) {
                if(valores[i][j] < 0) {
                    totalSacado = totalSacado + valores[i][j];
                }
            }
        }

        return totalSacado;
    }

    public static float totalDepositos(float [][] valores) {
        float totalDepositado = 0;
        int i, j;

        for(i = 0;i < valores.length; i++) {
            for(j = 0; j < valores[0].length; j++) {
                if(valores[i][j] > 0) {
                    totalDepositado = totalDepositado + valores[i][j];
                }
            }
        }

        return totalDepositado;
    }

    public static float[] saldoFinalContas(float [][] valores) {
        float saldoFinal = 0;
        float [] saldoFinalContas = new float[valores.length];
        int i, j;

        for(i = 0; i < valores.length; i++) {
            for(j = 0; j < valores[0].length; j++) {
                saldoFinal = saldoFinal + valores[i][j];
            }
            saldoFinalContas[i] = saldoFinal;
            saldoFinal = 0;
        }

        return saldoFinalContas;
    }
}
