package semana04.classeAbstrata.ex03;

public class RendaVariavel extends Investimento{
    public RendaVariavel() {
        super();
    }

    public RendaVariavel(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        double valor;

        valor = getValorAplicado() * 1.1;
        setValorAplicado(valor);

        return valor;
    }
}
