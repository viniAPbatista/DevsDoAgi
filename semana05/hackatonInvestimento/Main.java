//Vinicius Batista
//Matheus Reis
//Luan Dos santos

package semana05.hackatonInvestimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SistemaInvestimentos sistemaInvestimentos = new SistemaInvestimentos();
        String opcao = "1";

        System.out.println("===== BEM VINDO AO AAGI-INVEST =====");

        while (opcao != "0") {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Adicionar investimento");
            System.out.println("3 - Listar investimentos de um cliente");
            System.out.println("4 - Relatorio geral");
            System.out.println("0 - Sair");

            try {
                opcao = sc.next();
            } catch (Exception e) {
                System.out.println("===== ERRO =====");
                System.out.println("Caractere invalido! Digite um numero!");
                continue;               //volta ao while
            }

            switch (opcao) {
                case "1" -> {
                    System.out.println("===== CADASTRAR CLIENTE =====");
                    sistemaInvestimentos.cadastrarCliente(sc);
                    break;
                }

                case "2" -> {
                    System.out.println("===== ADICIONAR INVESTIMENTOS =====");
                    sistemaInvestimentos.adicionarInvestimento(sc);
                    break;
                }

                case "3" -> {
                    System.out.println("===== LISTAR INVESTIMENTOS =====");
                    sistemaInvestimentos.listarInvestimentos(sc);
                    break;
                }

                case "4" -> {
                    System.out.println("===== RELATORIO GERAL =====");
                    sistemaInvestimentos.relatorioGeral();
                    break;
                }

                case "0" -> {
                    System.out.println("===== SAIR =====");
                    opcao = "0";
                    break;
                }

                default -> {
                    System.out.println("===== ERRO =====");
                    System.out.println("Valor invalido! Tente novamente!");
                }
            }
        }
    }
}

//Funcionalidade – Cadastro de Clientes = 15/15
//Funcionalidade -  Cadastro de Investimentos = 15/15
//Funcionalidades - Listagens e Relatórios 10/10
//Uso de Map 10/10
//Uso de List 10/10
//Tratamento de Exceções 10/10
//Organização do Código 10/10
//Legibilidade e Nomes 5/5
//Interação com o Usuário 5/5
//Comentários e Documentação 10/10

//Nota: 100 pontos