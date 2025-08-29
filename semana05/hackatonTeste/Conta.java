package semana05.hackatonTeste;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }



    public void depositar(double valor, int numero) {
        Transacao deposito = new Transacao("Deposito", valor, numero, numero);
        if (valor > 0){
            this.saldo += valor;
            extrato.add(deposito);
        }
        else {
            System.out.println("Digite um valor maior que 0 ");
        }

    }
    public void sacar(double valor, int numero){
        Transacao sacar = new Transacao("Saque", valor, numero, numero);
        if (valor < 0 && valor <= saldo){
            this.saldo -= valor;
            extrato.add(sacar);
        } else {
            System.out.println("Digite um valor maior que 0 ");
        }
    }

    public void mostrarExtrato(){
        System.out.println(this.extrato);
    }

    public void transferir(double valor, Conta destino){
        Transacao tranferencia = new Transacao("Transferencia", valor, numero, destino.getNumero());
        if(this.saldo > valor && valor > 0){
            this.saldo -= valor;
            destino.saldo += valor;
            extrato.add(tranferencia);

        } else {
            System.out.println("Digite um valor maior que 0 e maior que seu saldo");
        }
    }
}

