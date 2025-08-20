package semana04.polimorfismo.overloading.ex01;

public class Main {
    public static void main(String[] args) {
        double valor1, valor2, valor3;

        CalculadoraFinanceira i1 = new CalculadoraFinanceira();

        valor1 = i1.calcularJuros(1000, 0.01, 10);
        valor2 = i1.calcularJuros(1000, 0.01);
        valor3 = i1.calcularJuros(1000);

        System.out.println("Valor: " + valor1);
        System.out.println("Valor: " + valor2);
        System.out.println("Valor: " + valor3);
    }
}
