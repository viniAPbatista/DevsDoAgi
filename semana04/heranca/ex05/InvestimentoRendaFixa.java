package semana04.heranca.ex05;

public class InvestimentoRendaFixa extends Investimento{
    private double taxaAnual;
    private double periodoMeses;
    private double valorFinal;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodoMeses) {
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double cacularValorFinal() {
        this.valorFinal = this.valorInicial * ( 1 + this.taxaAnual * (this.periodoMeses / 12));

        return valorFinal;
    }

    public void exibirValorFinal() {
        System.out.println("Valor final: " + this.valorFinal);
    }
}
