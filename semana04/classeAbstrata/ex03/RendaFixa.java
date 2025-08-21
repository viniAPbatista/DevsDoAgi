package semana04.classeAbstrata.ex03;

public class RendaFixa extends Investimento{
    public RendaFixa(double valorAplicado) {
        super(valorAplicado);
    }

    public RendaFixa() {
        super();
    }

    @Override
    public double calcularRendimento() {
        double valor;

        valor = getValorAplicado() * 1.05;
        setValorAplicado(valor);

        return valor;
    }
}
