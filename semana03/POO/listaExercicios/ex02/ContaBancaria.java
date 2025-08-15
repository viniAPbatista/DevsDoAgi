package semana03.POO.listaExercicios.ex02;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public void depositar(double valor) {
        System.out.println("Valor depositado!");
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        System.out.println("Valor sacado!");
        saldo = saldo - valor;
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}
