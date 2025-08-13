package semana03.matrizLista2;

import java.util.Scanner;

public class SaldosEmConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] saldos;
        float saldoCliente, saldoTotal;
        int clientes, dias, cliente, i, j;

        System.out.printf("Digite o numero de clientes: ");
        clientes = sc.nextInt();

        System.out.printf("Digite o numero de dias: ");
        dias = sc.nextInt();

        saldos = new float[clientes][dias];

        for(i = 0; i < clientes; i++){
            for(j = 0; j < dias; j++){
                System.out.printf("Digite o saldo do cliente %d no dia %d: ", i + 1, j + 1);
                saldos[i][j] = sc.nextFloat();
            }
        }

        System.out.print("Qual cliente voce deseja ver o saldo: ");
        cliente = sc.nextInt();

        saldoCliente = saldoFinal(saldos, cliente);
        System.out.println("Saldo final: " + saldoCliente);

        saldoTotal = saldoTotalTodos(saldos);
        System.out.println("Saldo total de todos os clientes: " + saldoTotal);

        imprimeExtratoCliente(saldos);
    }

    public static float saldoFinal(float [][] saldos, int cliente) {
        int j;
        float saldoFinal = 0;

        for(j = 0; j < saldos[0].length; j++){
            saldoFinal = saldoFinal + saldos[cliente - 1][j];
        }

        return saldoFinal;
    }

    public static float saldoTotalTodos(float [][] saldos) {
        int i, j;
        float soma = 0;

        for(i = 0; i < saldos.length; i++) {
            for(j = 0; j < saldos[0].length; j++) {
                soma = soma + saldos[i][j];
            }
        }

        return soma;
    }

    public static void imprimeExtratoCliente(float [][] saldos) {
        int i, j;

        for(i = 0; i < saldos.length; i++){
            System.out.printf("Cliente %d -> ", i + 1);
            for(j = 0; j < saldos[0].length; j++) {
                System.out.printf("%.2f    ", saldos[i][j]);
            }
            System.out.print("\n");
        }
    }
}
