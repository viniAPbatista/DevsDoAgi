package semana04.polimorfismo.overriding.ex02;

public class Investimento {
    protected double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento() {
        return 0;
    }
}
