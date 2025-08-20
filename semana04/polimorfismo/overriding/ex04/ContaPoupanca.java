package semana04.polimorfismo.overriding.ex04;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo * 1.005);
        System.out.println("Rendimento de 0.5% aplicado!");
    }
}
