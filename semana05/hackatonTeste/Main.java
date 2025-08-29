package semana05.hackatonTeste;

import java.util.*;

public class Main {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarCliente(sc);
                    break;
                case 2:
                    cadastrarConta(sc);
                    break;
                case 3:
                    deposito(sc);
                    break;
                case 4:
                    saque(sc);
                    break;
                case 5:
                    transferencia(sc);
                    break;
                case 6:
                    consultarSaldo(sc);
                    break;
                case 7:
                    extrato(sc);
                    break;
                case 8:
                    listarClientes();
                    break;
                case 9:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    private static void cadastrarCliente(Scanner sc) {
        String nome;
        String cpf;

        System.out.println("===== CADASTRO DE CLIENTE =====");

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        Cliente clienteNovo = new Cliente(nome, cpf);

        if (clientes.contains(clienteNovo)) {
            System.out.println("ERRO! Já existe um cliente cadastrado com esse CPF!");

        } else {
            clientes.add(clienteNovo);
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    private static void cadastrarConta(Scanner sc) {
        String cpf;
        Cliente clienteEcontrado = null;

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEcontrado = cliente;
                break;
            }
        }

        if (clienteEcontrado != null) {
            contas.put(numeroConta, new Conta(numeroConta, clienteEcontrado));
            System.out.println("Conta cadastrada com sucesso!");
        } else {
            System.out.println("ERRO! Cliente não encontrado!");
        }
    }

    private static void deposito(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());

        Conta conta = contas.get(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Valor do depósito: ");
        double valor = Double.parseDouble(sc.nextLine());

        conta.depositar(valor, numero);
        System.out.println("Depósito realizado com sucesso!");
    }

    private static void saque(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());

        Conta conta = contas.get(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());

        conta.sacar(valor, numero);
        System.out.println("Saque realizado com sucesso!");
    }

    private static void transferencia(Scanner sc) {
        System.out.print("Número da conta origem : ");
        int numeroOrigem = Integer.parseInt(sc.nextLine());

        Conta contaOrigem = contas.get(numeroOrigem);

        System.out.print("Número da conta origem : ");
        int numeroDestino = Integer.parseInt(sc.nextLine());

        Conta contaDestino = contas.get(numeroDestino);

        System.out.print("Valor da transferencia: ");
        double valor = Double.parseDouble(sc.nextLine());

        contaDestino.transferir(valor, contaDestino);
        System.out.println("Saque realizado com sucesso!");

        if (contaOrigem == null || contaDestino == null) {
            System.out.println("Contas não encontrada!");
            return;
        }

        private static void consultarSaldo (Scanner sc){
            // Dica: solicitar número da conta
            // Exibir saldo atual
        }

        private static void listarClientes () {
            System.out.println("===== LISTAR CLIENTES =====");
            for (Cliente cliente : clientes) {
                System.out.println("\n" + cliente.toString());
            }
        }
    }
}
