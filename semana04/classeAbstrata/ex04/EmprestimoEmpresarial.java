package semana04.classeAbstrata.ex04;

public class EmprestimoEmpresarial extends Emprestimo{
    public EmprestimoEmpresarial() {
        super();
    }

    public EmprestimoEmpresarial(double valor, double taxaJuros, int meses) {
        super(valor, taxaJuros, meses);
    }

    @Override
    public double calcularParcela() {
        double parcela = 0;

        parcela = (getValor() * (1 + getTaxaJuros() * getMeses())) / getMeses();
        parcela = parcela - (parcela * 0.1);

        return parcela;
    }
}
