package semana04.polimorfismo.overloading.ex01;

public class CalculadoraFinanceira {
    protected double capital;
    protected double juros;
    protected int meses;

    public double calcularJuros(double capital, double juros, int meses) {
        return capital * juros * meses;
    }

    public double calcularJuros(double capital, double juros) {
        return capital * juros * 12;
    }

    public double calcularJuros(double capital) {
        return capital * 0.015 * 12;
    }
}
