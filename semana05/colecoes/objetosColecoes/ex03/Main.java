package semana05.colecoes.objetosColecoes.ex03;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Produto> estoque = new HashMap<>();

        criarProduto(estoque, "123", "Caneta", 10);
        criarProduto(estoque, "456", "Lapis", 7);
        criarProduto(estoque, "789", "Borracha", 1);

        buscarProduto(estoque, "789");

        exibirProdutos(estoque);
    }

    public static void criarProduto(Map<String, Produto> estoque, String codigo, String nome, double quantidade) {
        Produto produto1 = new Produto(codigo);
        estoque.put(produto1.getCodigo(), new Produto(nome, quantidade));
    }

    public static void exibirProdutos(Map<String, Produto> estoque) {
        for(Map.Entry<String, Produto> produto : estoque.entrySet()){
            System.out.println("CHAVE: " + produto.getKey() + " - PRODUTO: " + produto.getValue().getNome() + " - QUANTIDADE: " + produto.getValue().getQuantidade());
        }
    }

    public static void buscarProduto(Map<String, Produto> estoque, String codigo) {
        boolean existe;

        existe = estoque.containsKey(codigo);

        if (existe) {
            System.out.println("Produto existente!");
        } else {
            System.out.println("Produto não existe!");
        }
    }
}
