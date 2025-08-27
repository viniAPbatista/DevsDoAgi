package semana05.colecoes.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> contas = new HashSet<>();
        int numeroConta;
        boolean existeConta;
        System.out.println("Digite o numero da conta que deseja adicionar: ");
        numeroConta = sc.nextInt();

        adicionarConta(contas, numeroConta);

        System.out.println("Digite o numero da conta que deseja verificar: ");
        numeroConta = sc.nextInt();

        existeConta = existeConta(contas, numeroConta);
        if(existeConta) {
            System.out.println("Conta existente!");
        } else {
            System.out.println("Conta não existe!");
        }

        System.out.println("===== EXIBIR CONTAS =====");
        exibirContas(contas);
    }

    public static void adicionarConta(Set<Integer> contas, int numeroConta) {
        contas.add(numeroConta);
        contas.add(1);
        contas.add(2);
        contas.add(3);
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta) {
        return contas.contains(numeroConta);
    }

    public static void exibirContas(Set<Integer> contas) {
        System.out.println("Contas existentes: " + contas);
    }
}
