package semana04.polimorfismo.overriding.ex03;

public class Emprestimo {
    protected double valorEmprestado;

    public Emprestimo(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public double calcularParcela(int meses) {
        return valorEmprestado / meses;
    }
}
