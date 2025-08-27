package semana05.colecoes.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> produtos = new HashSet<>();
        String nomeProduto;

        System.out.println("Digite o nome do produto que deseja adicionar: ");
        nomeProduto = sc.nextLine();

        adicionarProduto(produtos, nomeProduto);

        System.out.println("===== EXIBIR PRODUTOS =====");
        exibirProdutos(produtos);
    }

    public static void adicionarProduto(Set<String> produtos, String nomeproduto) {
        produtos.add("Consorcio");
        produtos.add("Emprestimo");

        if(produtos.contains(nomeproduto)) {
            System.out.println("Produto ja existente!");
        } else {
            produtos.add(nomeproduto);
        }
    }

    public static void exibirProdutos(Set<String> produtos) {
        System.out.println("Produtos: " + produtos);
    }
}
