package semana04.encapsulamento.ex01;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    //metodo saldo - apenas valores positivos
    public void depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("===== EXTRATO =====");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Saldo: " + this.saldo);
    }
}