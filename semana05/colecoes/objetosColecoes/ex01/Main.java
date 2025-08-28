package semana05.colecoes.objetosColecoes.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Cliente clienteEcontrado;

        clientes.add(new Cliente("123", "Vinicius", "098"));
        clientes.add(new Cliente("456", "Guilherme", "765"));
        clientes.add(new Cliente("789", "Igor", "432"));
        clientes.add(new Cliente("012", "Bruno", "109"));
        clientes.add(new Cliente("345", "Pedro", "876"));

        for (Cliente cliente1 : clientes) {
            System.out.println("ID: " + cliente1.getId() + " Nome: " + cliente1.getNome() + " cpf: " + cliente1.getCpf());
        }

        System.out.println("===== BUSCAR CLIENTE =====");

        clienteEcontrado = buscarCliente(clientes, "12345678");

        if (clienteEcontrado != null) {
            System.out.println("ID: " + clienteEcontrado.getId() + " Nome: " + clienteEcontrado.getNome() + " cpf: " + clienteEcontrado.getCpf());
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public static Cliente buscarCliente(List<Cliente> clientes, String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return cliente;
            }
        }
        return null;
    }
}