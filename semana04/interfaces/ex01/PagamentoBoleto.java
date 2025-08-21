package semana04.interfaces.ex01;

public class PagamentoBoleto implements IPagamento{
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de %.2f realizado via boleto! \n", valor);
    }
}
