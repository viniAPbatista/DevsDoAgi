package semana04.classeAbstrata.ex02;

public class CartaoDebito extends Cartao{
    private double saldo;

    public CartaoDebito() {
        super();
        this.saldo = 0.0;
    }

    public CartaoDebito(String numero, double limite, double saldo) {
        super(numero, limite);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void processarCompra(double valor) {
        this.saldo -= valor;
    }
}
