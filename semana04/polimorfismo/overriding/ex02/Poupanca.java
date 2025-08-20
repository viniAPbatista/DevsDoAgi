package semana04.polimorfismo.overriding.ex02;

public class Poupanca extends Investimento{
    public Poupanca(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        this.valorAplicado = this.valorAplicado + (this.valorAplicado * 0.005);
        return valorAplicado;
    }
}
