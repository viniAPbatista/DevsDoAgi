package semana03.POO.listaExercicios.ex01;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();
        Produto prod2 = new Produto();

        prod.nome = "Arroz";
        prod.preco = 10.50;
        prod.quantidade = 0;

        prod2.nome = "Feijao";
        prod2.preco = 15.50;
        prod2.quantidade = 0;

        prod.adicionarEstoque(4);
        prod.removerEstoque(2);

        prod2.adicionarEstoque(10);
        prod2.removerEstoque(5);

        prod.exibirDados();
        prod2.exibirDados();
    }
}
