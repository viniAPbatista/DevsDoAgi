package semana04.interfaces.ex01;

public class PagamentoCartao implements IPagamento{
    public void processarPagamento(double valor){
        System.out.printf("Pagamento de %.2f realizado via cartao! \n", valor);
    }
}
