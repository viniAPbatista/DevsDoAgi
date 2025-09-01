package semana05.correcaoHackaton.src;

import java.util.*;

public class BancoDigitalHackaton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;
        Set<Cliente> clientes = new HashSet<>();
        Map<Integer, Conta> contas = new HashMap<>();
        int proximoNumeroConta = 0;

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

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = sc.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);
                    if (clientes.contains(cliente)) {
                        System.out.println("Cliente com CPF já cadastrado!");
                    } else {
                        clientes.add(cliente);
                        System.out.println("Cliente cadastrado com sucesso!");
                    }
                    break;
                }
                case 2: {
                    System.out.print("CPF do cliente: ");
                    String cpf = sc.nextLine();

                    Cliente titular = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equalsIgnoreCase(cpf)) {
                            titular = c;
                            break;
                        }
                    }

                    if (titular == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        int numeroConta = proximoNumeroConta++;
                        Conta novaConta = new Conta(numeroConta, titular);
                        contas.put(numeroConta, novaConta);
                        System.out.println("Conta criada com sucesso! Número da conta: " + numeroConta);
                    }
                    break;

                }
                case 3: {
                    System.out.print("Número da conta para depósito: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();

                    Conta conta = contas.get(numeroConta);
                    if (conta == null) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }

                    System.out.print("Valor para depósito: R$ ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    conta.depositar(valor);
                    break;
                }
                case 4: {
                    System.out.print("Número da conta para saque: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();

                    Conta conta = contas.get(numeroConta);
                    if (conta == null) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }

                    System.out.print("Valor para saque: R$ ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    conta.sacar(valor);
                    break;
                }
                case 5: {
                    System.out.print("Conta origem: ");
                    int origem = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Conta destino: ");
                    int destino = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Valor para transferência: R$ ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    Conta contaOrigem = contas.get(origem);
                    Conta contaDestino = contas.get(destino);

                    if (contaOrigem == null || contaDestino == null) {
                        System.out.println("Conta origem ou destino não encontrada.");
                        break;
                    }

                    contaOrigem.transferir(valor, contaDestino);
                    break;
                }
                case 6: {
                    System.out.print("Número da conta para consultar saldo: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();

                    Conta conta = contas.get(numeroConta);
                    if (conta == null) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }

                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                }
                case 7: {
                    System.out.print("Número da conta para extrato: ");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();

                    Conta conta = contas.get(numeroConta);
                    if (conta == null) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }

                    conta.mostrarExtrato();
                    break;
                }
                case 8: {
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (Cliente cliente : clientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                }
                case 9:
                    rodando = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}

