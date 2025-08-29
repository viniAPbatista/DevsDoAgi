package semana05.hackatonTeste;

import java.util.Objects;

class Cliente {
    private String nome, cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}

