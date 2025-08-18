package semana04.construtor.ex01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.imprimir();

        ContaBancaria p2 = new ContaBancaria("Vinicius", "123456789");
        p2.imprimir();

        ContaBancaria p3 = new ContaBancaria("Jose", "63781231", 5000);
        p3.imprimir();
    }
}
