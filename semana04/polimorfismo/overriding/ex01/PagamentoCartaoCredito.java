package semana04.polimorfismo.overriding.ex01;

public class PagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado no cartao no valor de " + this.valor);
    }
}
