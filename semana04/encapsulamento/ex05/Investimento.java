package semana04.encapsulamento.ex05;

public class Investimento {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;
    private double valorFinal;

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public void setValorInicial(double valorInicial) {
        if(valorInicial < 1000) {
            System.out.println("Valor insuficiente!");
        } else {
            this.valorInicial = valorInicial;
        }
    }

    public void setTaxaAnual(double taxaAnual) {
        if(taxaAnual >= 0.01 && taxaAnual <= 0.20) {
            this.taxaAnual = taxaAnual;
        } else {
            System.out.println("Taxa invalida!");
        }
    }

    public double calcularValorFuturo(int anos) {
        double potencia;

        potencia = Math.pow((1 + this.taxaAnual),anos);
        this.valorFinal = this.valorInicial * potencia;
        return this.valorFinal;
    }

    public void exibirResumo() {
        System.out.println("Tipo do investimento: " + this.tipoInvestimento);
        System.out.println("Valor inicial: " + this.valorInicial);
        System.out.println("Taxa anual: " + this.taxaAnual);
        System.out.println("Valor futuro: " + this.valorFinal);
    }
}
