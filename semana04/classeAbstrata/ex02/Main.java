package semana04.classeAbstrata.ex02;

public class Main {
    public static void main(String[] args) {
        Cartao c1 = new CartaoCredito();
        Cartao c2 = new CartaoDebito();

        c1.setLimite(1000);
        c1.processarCompra(500);

        System.out.println(c1.getLimite());

        c2.setSaldo(1000);
    }
}
