package semana05.hackaton02;

public class RendaFixa extends Investimento{
    //construtores
    public RendaFixa() {
        super();
    }

    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    //overrride metodo abstrato
    @Override
    public double calcularRendimento() {
        double valorFinal;
        valorFinal = getValorInicial() * 1.05;
        return valorFinal;
    }
}
