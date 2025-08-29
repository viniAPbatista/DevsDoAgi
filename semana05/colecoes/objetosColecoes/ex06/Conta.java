package semana05.colecoes.objetosColecoes.ex06;

public class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(String numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CONTA: " + numero + " - SALDO: " + saldo + " - TITULAR: " + titular;
    }
}
