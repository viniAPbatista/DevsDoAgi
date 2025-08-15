package semana03.POO.listaExercicios.ex01;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);

    public String nome;
    public double preco;
    public int quantidade;

    public void  adicionarEstoque(int quantidade) {
        System.out.printf("Adicionou %d produtos \n", quantidade);
        this.quantidade += quantidade;
    }

    public void  removerEstoque(int quantidade) {
        System.out.printf("Removeu %d produtos \n", quantidade);
        this.quantidade -= quantidade;
    }

    public void  exibirDados() {
        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Preco: %.2f \n", preco);
        System.out.printf("Quantidade: %d \n", quantidade);
    }
}
