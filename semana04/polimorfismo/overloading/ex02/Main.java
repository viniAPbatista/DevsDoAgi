package semana04.polimorfismo.overloading.ex02;

public class Main {
    public static void main(String[] args) {
        double valor1, valor2, valor3;

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();

        valor1 = c1.somaTotal(10, 20);
        valor2 = c1.somaTotal(10, 20, 0.10);
        valor3 = c1.somaTotal(10, 20, 30, 40, 50);

        System.out.println("Valor: " + valor1);
        System.out.println("Valor: " + valor2);
        System.out.println("Valor: " + valor3);
    }
}
