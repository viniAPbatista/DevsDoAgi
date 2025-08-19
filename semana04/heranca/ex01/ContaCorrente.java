package semana04.heranca.ex01;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacarComChequeEspecial(double valorSaque) {
        if(this.limiteChequeEspecial >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}