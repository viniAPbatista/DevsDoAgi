package semana04.classeAbstrata.ex04;

abstract class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int meses;

    public Emprestimo() {
        this.valor = 0.0;
        this.taxaJuros = 0.0;
        this.meses = 0;
    }

    public Emprestimo(double valor, double taxaJuros, int meses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.meses = meses;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getMeses() {
        return meses;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public abstract double calcularParcela();
}
