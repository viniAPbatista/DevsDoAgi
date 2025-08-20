package semana04.polimorfismo.overriding.ex01;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento generico no valor de " + this.valor);
    }
}
