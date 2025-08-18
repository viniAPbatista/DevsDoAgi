package semana04.construtor.ex01;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    //construtor padrão
    public ContaBancaria() {
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0.0;
    }

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void imprimir() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
