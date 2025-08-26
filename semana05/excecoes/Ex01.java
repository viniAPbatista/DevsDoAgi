package semana05.excecoes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] saldos = new double[10];
        int indice;
        int i;

        for (i = 0; i < saldos.length; i++) {
            System.out.printf("Digite o valor do %d saldo: ", i + 1);
            saldos[i] = sc.nextDouble();
        }

        System.out.println("Digite o indice da conta: ");
        indice = sc.nextInt() - 1;

        try {
            System.out.println("Saldo da conta solicitada: " + saldos[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO! Conta não encontrada");
        }
    }
}
