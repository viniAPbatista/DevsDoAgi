package semana04.polimorfismo.overriding.ex02;

public class Cdb extends Investimento{
    public Cdb(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        this.valorAplicado = this.valorAplicado + (this.valorAplicado * 0.01);
        return this.valorAplicado;
    }
}
