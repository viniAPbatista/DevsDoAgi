package semana05.colecoes.objetosColecoes.ex10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String , Produto> produtos = new HashMap<>();

        cadastrarProdutos(produtos, "001", "lapis", 10);
        cadastrarProdutos(produtos, "002", "caneta", 30);
        cadastrarProdutos(produtos, "003", "borracha", 20);

        System.out.println(consultaCodigo(produtos, "001"));

        exibirProdutos(produtos);
    }

    public static void cadastrarProdutos(Map<String , Produto> produtos, String codigo, String nome, double quantidade) {
        produtos.put(codigo, new Produto(codigo, nome, quantidade));
    }

    public static Produto consultaCodigo(Map<String , Produto> produtos, String codigo) {
        return produtos.get(codigo);
    }

    public static void exibirProdutos(Map<String , Produto> produtos) {
        for (Map.Entry<String, Produto> entry : produtos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " | Produto: " + entry.getValue());
        }
    }
}
