package semana04.exAplicadoVarejo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String email;
        String codigo;
        String nomeProduto;
        double preco;
        double desconto;
        int opcao = 1;

        Cliente cliente1 = new Cliente();

        System.out.println("===== CADASTRO =====");
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        cliente1.setNome(nome);

        System.out.print("Digite seu email: ");
        email = sc.nextLine();
        cliente1.setEmail(email);

        while(opcao != 0) {
            System.out.println("===== SELECIONE UM TIPO DE PRODUTO =====");
            System.out.println("1 - PRODUTO FISICO");
            System.out.println("2 - PRODUTO DIGITAL");
            System.out.println("0 - SAIR");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("===== CRIANDO PRODUTO FISICO =====");

                    Produto produto1 = new ProdutoFisico();
                    produto1.setComprador(cliente1);

                    System.out.print("Digite o codigo do produto: ");
                    codigo = sc.nextLine();
                    produto1.setCodigo(codigo);

                    System.out.print("Digite o nome do produto: ");
                    nomeProduto = sc.nextLine();
                    produto1.setNome(nomeProduto);

                    System.out.print("Digite o preco do produto: ");
                    preco = sc.nextDouble();
                    produto1.setPreco(preco);

                    System.out.println("===== APLICAR DESCONTO =====");

                    System.out.print("Porcentagem de desconto: ");
                    desconto = sc.nextDouble();
                    System.out.println("Valor antes do desconto: " + produto1.getPreco());
                    produto1.aplicarDesconto(desconto / 100);
                    System.out.println("Valor apos o desconto: " + produto1.getPreco());

                    System.out.println("===== AUMENTAR O PRECO =====");
                    System.out.print("Porcentagem de aumento: ");
                    desconto = sc.nextDouble();
                    System.out.println("Valor antes do aumento: " + produto1.getPreco());
                    produto1.aumentarPreco(desconto / 100);
                    System.out.println("Valor apos aumento: " + produto1.getPreco());

                    System.out.println("===== VERIFICAR FRETE =====");
                    produto1.calcularFrete();
                }

                case 2 -> {
                    System.out.println("===== CRIANDO PRODUTO DIGITAL =====");

                    Produto produto2 = new ProdutoDigital();
                    produto2.setComprador(cliente1);

                    System.out.print("Digite o codigo do produto: ");
                    codigo = sc.nextLine();
                    produto2.setCodigo(codigo);

                    System.out.print("Digite o nome do produto: ");
                    nomeProduto = sc.nextLine();
                    produto2.setNome(nomeProduto);

                    System.out.print("Digite o preco do produto: ");
                    preco = sc.nextDouble();
                    produto2.setPreco(preco);

                    System.out.println("===== APLICAR DESCONTO =====");

                    System.out.print("Porcentagem de desconto: ");
                    desconto = sc.nextDouble();
                    System.out.println("Valor antes do desconto: " + produto2.getPreco());
                    produto2.aplicarDesconto(desconto / 100);
                    System.out.println("Valor apos o desconto: " + produto2.getPreco());

                    System.out.println("===== AUMENTAR O PRECO =====");

                    System.out.print("Porcentagem de aumento: ");
                    desconto = sc.nextDouble();
                    System.out.println("Valor antes do aumento: " + produto2.getPreco());
                    produto2.aumentarPreco(desconto / 100);
                    System.out.println("Valor apos aumento: " + produto2.getPreco());

                    System.out.println("===== VERIFICAR FRETE =====");
                    produto2.calcularFrete();
                }

                case 0 -> System.out.println("Encerrando o programa...");
            }
        }
    }
}
