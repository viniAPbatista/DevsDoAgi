package semana05.colecoes.objetosColecoes.ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pedido> pedidos = new ArrayList<>();

        adicionarPedido(sc, pedidos);
        adicionarPedido(sc, pedidos);
        adicionarPedido(sc, pedidos);
        adicionarPedido(sc, pedidos);
        adicionarPedido(sc, pedidos);
        adicionarPedido(sc, pedidos);

        exibirPedidos(pedidos);

        buscarNomeCliente(pedidos, sc);
    }

    public static void adicionarPedido(Scanner sc, List<Pedido> pedidos) {
        String id;
        String nome;
        String item;

        System.out.println("Digite o id do pedido: ");
        id = sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nome = sc.nextLine();

        System.out.println("Digite o item do pedido: ");
        item = sc.nextLine();

        Pedido novoPedido = new Pedido(id, nome, item);

        pedidos.add(novoPedido);
    }

    public static void exibirPedidos(List<Pedido> pedidos) {
        for(Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public static Pedido buscarNomeCliente(List<Pedido> pedidos, Scanner sc) {
        System.out.println("Qual nome deseja buscar: ");
        String nome = sc.nextLine();

        for (Pedido pedido : pedidos) {
            if (pedido.getNomeCliente().equalsIgnoreCase(nome)) {
                return pedido;
            }
        }

        return null;
    }
}
