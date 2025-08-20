package semana04.polimorfismo.overriding.ex03;

public class EmprestimoEmpresarial extends Emprestimo{
    public EmprestimoEmpresarial(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses) {
        return (valorEmprestado * 0.01 * meses) + 100;
    }
}
