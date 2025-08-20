package semana04.polimorfismo.overriding.ex01;

public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento aprovado no pix no valor de " + this.valor);
    }
}
