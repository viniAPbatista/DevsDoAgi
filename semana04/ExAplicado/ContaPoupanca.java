package semana04.ExAplicado;

public class ContaPoupanca extends Conta{
    //construtor inicia os atributos vazio
    public ContaPoupanca() {
        super();
    }

    //construtor inicia os atributos com valores fornecidos
    public ContaPoupanca(String numeroConta, double saldo, Cliente titular) {
        super(numeroConta, saldo, titular);
    }

    //sobrescreve e aplica a logica do metodo aplicar juros
    @Override
    public void aplicarJuros() {
        double saldo;

        saldo = getSaldo();

        saldo = saldo * 1.01;

        setSaldo(saldo);

        System.out.println("Juros aplicado na conta poupanca!");
        System.out.println("Saldo atual: " + saldo);
    }
}
