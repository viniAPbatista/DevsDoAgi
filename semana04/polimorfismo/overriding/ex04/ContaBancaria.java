package semana04.polimorfismo.overriding.ex04;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void gerarRelatorio() {
        System.out.println("Relatorio generico!");
    }
}
