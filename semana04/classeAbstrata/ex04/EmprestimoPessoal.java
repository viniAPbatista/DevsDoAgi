package semana04.classeAbstrata.ex04;

public class EmprestimoPessoal extends Emprestimo{
    public EmprestimoPessoal() {
        super();
    }

    public EmprestimoPessoal(double valor, double taxaJuros, int meses) {
        super(valor, taxaJuros, meses);
    }

    @Override
    public double calcularParcela() {
        double parcela = 0;

        parcela = (getValor() * (1 + getTaxaJuros() * getMeses())) / getMeses();

        return parcela;
    }
}
