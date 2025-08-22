package semana04.ExAplicado;

abstract class Conta implements IOperacoesBinarias{
    private String numeroConta;
    private double saldo;
    private Cliente titular;

    //getter e setters devido aos atributos privados
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //contrutor inicia os atributos vazio
    public Conta() {
        this.numeroConta = "";
        this.saldo = 0.0;
        this.titular = null;
    }

    //contrutor inicia os atributos com valores fornecidos
    public Conta(String numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //metodo abstrato
    public abstract void aplicarJuros();

    //sobrescreve e implementa os metodos depositar e sacar
    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }
}
