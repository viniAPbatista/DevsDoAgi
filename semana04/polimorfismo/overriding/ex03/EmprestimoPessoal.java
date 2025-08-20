package semana04.polimorfismo.overriding.ex03;

public class EmprestimoPessoal extends Emprestimo{
    public EmprestimoPessoal(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses) {
        return meses * 0.02 * this.valorEmprestado;
    }
}
