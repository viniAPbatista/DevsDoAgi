package semana05.hackaton02;

public class RendaVariavel extends Investimento{
    //construtores
    public RendaVariavel() {
        super();
    }

    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }

    //overrride metodos abstratos
    @Override
    public double calcularRendimento() {
        double valorFinal;
        valorFinal = getValorInicial() * 1.10;
        return valorFinal;
    }
}
