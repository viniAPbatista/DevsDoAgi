package semana05.colecoes.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> cliente = new HashMap<>();
        String numeroConta;
        double saldo;
        double deposito;

        System.out.println("Digite o numero da conta: ");
        numeroConta = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();

        adicionarCliente(cliente, numeroConta, saldo);

        System.out.println("Quanto deseja depositar: ");
        deposito = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o numero da conta que deseja depositar: ");
        numeroConta = sc.nextLine();
        depositar(cliente, numeroConta, deposito, saldo);

        System.out.println("===== EXIBIR CONTAS ===== ");
        exibirSaldos(cliente);
    }

    public static void adicionarCliente(Map<String, Double> cliente, String numeroConta, double saldo) {
        cliente.put(numeroConta, saldo);
    }

    public static void depositar(Map<String, Double> cliente, String numeroConta, double deposito, double saldo) {
        boolean existeConta;

        existeConta = cliente.containsKey(numeroConta);

        if(existeConta) {
            cliente.get(numeroConta);
            cliente.put(numeroConta, deposito + saldo);
        } else {
            System.out.println("Conta inexistente!");
        }
    }

    public static void exibirSaldos(Map<String, Double> cliente) {
        System.out.println("Clientes e saldos: " + cliente);
    }
}
