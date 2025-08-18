package semana04.encapsulamento.ex03;

public class Main {
    public static void main(String[] args) {
        ClienteVip cliente = new ClienteVip();

        cliente.setNome("Vinicius Batista");
        cliente.setCpf("123456789");
        cliente.setLimiteCredito(10000);

        cliente.exibirCliente();
    }
}
