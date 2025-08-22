package semana04.ExAplicado;

public class ContaCorrente extends Conta{
    //construtor inicia os atributos vazio
    public ContaCorrente() {
        super();
    }

    //construtor inicia os atributos com valores fornecidos
    public ContaCorrente(String numeroConta, double saldo, Cliente titular) {
        super(numeroConta, saldo, titular);
    }

    //sobrescreve o metodo aplicar jutos e implementa
    @Override
    public void aplicarJuros() {
        System.out.println("Juros indisponivel na Conta Corrente!");
        System.out.println("Saldo atual: " + getSaldo());
    }
}
