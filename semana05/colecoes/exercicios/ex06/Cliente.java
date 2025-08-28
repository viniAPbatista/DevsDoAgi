package semana05.colecoes.exercicios.ex06;

import java.util.List;

public class Cliente {
    private String nome;
    private double saldo;

    public Cliente() {
        this.nome = "";
        this.saldo = 0.0;
    }

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }
    }
