package semana04.polimorfismo.overriding.ex04;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + (this.saldo - 20));
        System.out.println("Desconto de 20 reais aplicado!");
    }
}
