package semana05.correcaoHackaton.src;

import java.util.ArrayList;
import java.util.List;

class Conta {
    private Integer numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato;

    public Conta() {
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(Integer numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public Cliente getTitular() {
        return titular;
    }

    public Integer getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    // Dicas para os métodos a implementar:
    // - depositar(double valor): adicionar ao saldo, registrar transação
    public void depositar(double valor){
        if(valor<=0){
            System.out.println("Valor de depósito inválido!");
            return;
        }
        saldo += valor;
        extrato.add(new Transacao("Depósito", valor, numero, numero));
        System.out.println("Depósito realizado com sucesso.");
    }
    // - sacar(double valor): verificar saldo, subtrair valor, registrar transação
    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido!");
            return;
        }
        if(valor > saldo){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        saldo -= valor;
        extrato.add(new Transacao("Saque", valor, numero, numero));
        System.out.println("Saque realizado com sucesso.");
    }

    // - transferir(double valor, Conta destino): verificar saldo, atualizar saldos, registrar transações em ambas contas
    public void transferir(double valor, Conta destino){
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }
        saldo -= valor;
        destino.saldo += valor;
        this.extrato.add(new Transacao("Transferência Enviada", valor, this.numero, destino.numero));
        destino.extrato.add(new Transacao("Transferência Recebida", valor, this.numero, destino.numero));
        System.out.println("Transferência realizada com sucesso.");
    }
    // - mostrarExtrato(): percorrer lista de transações e imprimir
    public void mostrarExtrato(){
        if (extrato.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
            return;
        }
        for (Transacao transacao : extrato) {
            System.out.println(transacao);
        }
    }
}

