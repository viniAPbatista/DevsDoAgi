package semana04.ExAplicado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, cpf, numeroConta;
        double saldo, saque;

        System.out.println("===== BEM VINDO AO AGIBANK =====");

        //pega informações do usuario
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        System.out.println("===== INFORMCOES CONTA CORRENTE =====");

        //cria o objeto na classe cliente com os atributos fornecidos
        Cliente cliente1 = new Cliente();
        cliente1.setNome(nome);
        cliente1.setCpf(cpf);

        //cria o objeto na classe contaCorrente com o Objeto cliente
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setTitular(cliente1);

        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        //solicita e valida ate um deposito valido
        System.out.print("Deposite na sua conta corrente: ");
        saldo = sc.nextDouble();
        while(saldo <= 0) {
            System.out.println("Saldo invalido! Tente novamente.");
            System.out.println("Deposite na sua conta corrente: ");
            saldo = sc.nextDouble();
        }
        contaCorrente.depositar(saldo);
        sc.nextLine();

        System.out.print("Digite o numero da sua conta corrente: ");
        numeroConta = sc.nextLine();
        contaCorrente.setNumeroConta(numeroConta);

        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        //solicita e valida ate um saque valido
        System.out.println("Quanto deseja sacar: ");
        saque = sc.nextDouble();
        while(saque > contaCorrente.getSaldo() || saque < 0) {
            System.out.println("Saque invalido! Tente novamente!");
            System.out.println("Quanto deseja sacar: ");
            saque = sc.nextDouble();
        }
        contaCorrente.sacar(saque);

        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        //chama o metodo para aplicar os juros
        System.out.println("Verificando seu juros e saldo atual!");
        contaCorrente.aplicarJuros();

        System.out.println("===== INFORMCOES CONTA POUPANCA =====");
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setTitular(cliente1);

        //solicita e valida ate um deposito valido
        System.out.print("Deposite na sua conta poupanca: ");
        saldo = sc.nextDouble();
        while(saldo <= 0) {
            System.out.println("Saldo invalido! Tente novamente.");
            System.out.println("Deposite na sua conta poupanca: ");
            saldo = sc.nextDouble();
        }
        contaPoupanca.setSaldo(saldo);
        sc.nextLine();

        System.out.print("Digite o numero da sua conta poupanca: ");
        numeroConta = sc.nextLine();
        contaPoupanca.setNumeroConta(numeroConta);

        //solicita e valida ate um saque valido
        System.out.print("Quanto deseja sacar: ");
        saque = sc.nextDouble();
        while(saque > contaPoupanca.getSaldo() || saque < 0) {
            System.out.println("Saque invalido! Tente novamente!");
            System.out.println("Quanto deseja sacar: ");
            saque = sc.nextDouble();
        }
        contaPoupanca.sacar(saque);

        //chama o metodo para aplicar os juros
        System.out.println("Verificando seu juros e saldo atual!");
        contaPoupanca.aplicarJuros();

        System.out.println("===== OPERACOES FINALIZADAS =====");
    }
}
// 1: 10
// 2: 10
// 3: 10
// 4: 20
// 5: 10
// 6: 10
// 7: 10
// 8: 20
//Total: 100