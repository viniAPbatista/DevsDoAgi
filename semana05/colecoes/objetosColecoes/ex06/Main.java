package semana05.colecoes.objetosColecoes.ex06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();
        Map<Integer, Conta> contas = new HashMap<>();

        Cliente c1 = new Cliente("1", "Vini", "123");
        Cliente c2 = new Cliente("2", "Duda", "456");
        clientes.add(c1);
        clientes.add(c2);

        contas.put(1001, new Conta("1001", 5000, c1));
        contas.put(2002, new Conta("2002", 7000, c2));

        for (Conta conta : contas.values()) {
            System.out.println(conta);
        }
    }
}
