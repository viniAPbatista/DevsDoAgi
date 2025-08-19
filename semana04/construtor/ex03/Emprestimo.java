package semana04.construtor.ex03;

public class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int prazoMeses;

    public Emprestimo(double valor, int prazoMeses) {
        this.valor = valor;
        this.prazoMeses = prazoMeses;
        this.taxaJuros = 1.5 / 100;
    }

    public Emprestimo(double valor, double taxaJuros, int prazoMeses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros / 100;
        this.prazoMeses = prazoMeses;
    }
}
