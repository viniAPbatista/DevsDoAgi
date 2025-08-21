package semana04.interfaces.ex01;

public class Main {
    public static void main(String[] args) {
        IPagamento p1 = new PagamentoBoleto();
        IPagamento p2 = new PagamentoCartao();

        p1.processarPagamento(1000);
        p2.processarPagamento(500);
    }
}
