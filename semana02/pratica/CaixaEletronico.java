package semana02.pratica;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldo, saque;

        System.out.print("Digite seu saldo: ");
        saldo = sc.nextFloat();

        while (saldo > 0) {
            System.out.print("Quanto deseja sacar ?");
            saque = sc.nextFloat();

            if(saque < 0) {
                System.out.println("Novo saldo: " + saldo);
                System.exit(0);
            }

            if(saldo > saque) {
                saldo = saldo - saque;
                System.out.println("Novo saldo: " + saldo);
            }

            if(saldo < saque) {
                System.out.println("Saldo insuficiente!");
            }

            if(saldo == saque) {
                saldo = saldo - saque;
                System.out.println("Saldo zerado! Conta Vazia!");
            }
        }
    }
}
