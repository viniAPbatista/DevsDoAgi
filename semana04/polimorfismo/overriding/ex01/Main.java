package semana04.polimorfismo.overriding.ex01;

public class Main {
    public static void main(String[] args) {
        int i;

        Pagamento[] pagamentos = {
                new Pagamento(100),
                new PagamentoCartaoCredito(5000, "1234567"),
                new PagamentoPix(300, "09876")
        };

        for(i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento();
        }
    }
}
