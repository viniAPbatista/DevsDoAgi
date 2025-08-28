package semana05.colecoes.exercicios.ex06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Cliente> cliente = new ArrayList<>();

        adicionarCliente(cliente, "Claudia", 3000);
        adicionarCliente(cliente, "Vinicius", 5000);
        adicionarCliente(cliente, "Joao", 1000);
        adicionarCliente(cliente, "Igor", 100);

        ordenarPorSaldo(cliente);

        exibirCliente(cliente);
    }

    public static void adicionarCliente(List<Cliente> cliente, String nome, double saldo) {
        cliente.add(new Cliente(nome, saldo));
    }

    public static void ordenarPorSaldo(List<Cliente> cliente) {
        cliente.sort(Comparator.comparing(Cliente::getSaldo));
    }

    public static void exibirCliente(List<Cliente> cliente) {
        for(Cliente cliente1 : cliente) {
            System.out.println("Cliente: " + cliente1.getNome() + " - Saldo: " + cliente1.getSaldo());
        }
    }
}
