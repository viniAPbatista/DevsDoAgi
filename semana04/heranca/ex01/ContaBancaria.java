package semana04.heranca.ex01;

public class ContaBancaria {
    protected String titular;
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}