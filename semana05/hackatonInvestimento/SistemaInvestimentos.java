package semana05.hackatonInvestimento;

import java.util.*;

public class SistemaInvestimentos {
    Scanner sc = new Scanner(System.in);
    // Atributos
    private Map<String, Cliente> clientes;  // chave = CPF

    // Construtor
    public SistemaInvestimentos() {
        clientes = new HashMap<>();
    }

    // Métodos sugeridos
    public void cadastrarCliente(Scanner sc) {
        String nome;
        String cpf;
        String email;

        System.out.println("Digite seu nome: ");
        nome = sc.next();

        while (!nome.matches("^[a-zA-Z]+$")) {
            System.out.println("Nome invalido! Tente novamente.");
            System.out.println("Digite seu nome: ");
            nome = sc.next();
        }

        System.out.println("Digite seu cpf: ");
        cpf = sc.next();

        while (!cpf.matches("^\\d+$")) {
            System.out.println("CPF invalido! Tente novamente.");
            System.out.println("Digite seu CPF: ");
            cpf = sc.next();
        }

        System.out.println("Digite seu email: ");
        email = sc.next();

        if (clientes.containsKey(cpf)) {
            System.out.println("CPF já cadastrado!");
        } else {
            Cliente novoCliente = new Cliente(nome, cpf, email);

            clientes.put(cpf, novoCliente);

            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    public Cliente buscarCliente(String cpf) {
       Cliente buscarCliente = clientes.get(cpf);

       if(buscarCliente == null) {
           System.out.println("Cliente não encontrado!");
           return null;
       } else {
           System.out.println("Cliente econtrado!");
           return buscarCliente;
       }
    }

    public void adicionarInvestimento(Scanner sc) {
        // Busca o cliente e adiciona o investimento
        String tipoInvestimento = "1";
        double valor;

        System.out.println("Buscar cliente pelo CPF: ");
        String cpf = sc.next();

        Cliente cliente = buscarCliente(cpf);

        if(cliente == null) {
            return;
        }

            int tipo = 0;

            System.out.println("===== ESCOLHA O INVESTIMENTO =====");
            System.out.println("1 - Tesouro direto");
            System.out.println("2 - CDB");
            System.out.println("3 - ACOES");
            System.out.println("0 - SAIR");
            tipoInvestimento = sc.next();

            switch (tipoInvestimento) {
                case "1" -> {
                    tipoInvestimento = "Tesouro Direto";
                    tipo = 1;
                    break;
                }
                case "2" -> {
                    tipoInvestimento = "CDB";
                    tipo = 2;
                    break;
                }
                case "3" -> {
                    tipoInvestimento = "Acoes";
                    tipo = 3;
                    break;
                }
                case "0" -> {
                    System.out.println("SAIR");
                    return;
                }
                default -> System.out.println("Opcao invalida!");
            }


            if (tipo != 1 && tipo != 2 && tipo != 3) {
                System.out.println("Digite uma opção valida!");
            } else {

                System.out.println("Digite o valor do inevstimento: ");
                valor = sc.nextDouble();

                try {
                    cliente.adicionarInvestimento(tipoInvestimento, valor);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

    }

    public void listarInvestimentos(Scanner sc) {
        // Lista todos os investimentos de um cliente
        System.out.println("Digite o cpf: ");
        String cpf = sc.next();

        Cliente cliente = buscarCliente(cpf);

        if(cliente == null) {
            System.out.println(" ");
        } else {
            for (Investimento investimento : cliente.getInvestimentos()) {
                System.out.println(investimento);
            }
        }
    }

    public void relatorioGeral() {
        // Lista todos os clientes e seus totais investidos
        for (Map.Entry<String, Cliente> cliente : clientes.entrySet()){
            System.out.println(cliente);
            for (Investimento investimento :cliente.getValue().getInvestimentos()){
                System.out.println(investimento);
            }
            System.out.println("TOTAL INVESTIDO: " + cliente.getValue().getTotalInvestimento());
            System.out.println("--------------------");
        }
    }
}

