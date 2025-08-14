package semana03.matrizLista2;

import java.util.Scanner;

public class SaldosMensais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int clientes, meses;
        System.out.print("Quantos clientes existem: ");
        clientes = sc.nextInt();

        System.out.print("Quantos meses: ");
        meses = sc.nextInt();

        double[][] saldos = new double[clientes][meses];

        for (int i = 0; i < clientes; i++) {
            for (int j = 0; j < meses; j++) {
                System.out.printf("Digite o saldo do cliente %d no mês %d: ", i + 1, j + 1);
                saldos[i][j] = sc.nextDouble();
            }
        }

        double[] medias = jurosMediosClientes(saldos);

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Cliente %d → Juros médio mensal: %.2f%%\n", i + 1, medias[i] * 100);
        }

        sc.close();
    }

    public static double calcularJurosMensal(double saldoAnterior, double saldoAtual) {
        return (saldoAtual / saldoAnterior) - 1;
    }

    public static double[] jurosMediosClientes(double[][] saldos) {
        int clientes = saldos.length;
        int meses = saldos[0].length;
        double[] medias = new double[clientes];

        for (int i = 0; i < clientes; i++) {
            double soma = 0;
            int contador = 0;
            for (int j = 0; j < meses - 1; j++) {
                double taxa = calcularJurosMensal(saldos[i][j], saldos[i][j + 1]);
                soma += taxa;
                contador++;
            }
            medias[i] = soma / contador;
        }

        return medias;
    }
}
