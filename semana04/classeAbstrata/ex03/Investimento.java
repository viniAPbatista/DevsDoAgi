package semana04.classeAbstrata.ex03;

abstract class Investimento {
    private double valorAplicado;

    public Investimento() {
        this.valorAplicado = 0.0;
    }

    public Investimento(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }

    public double getValorAplicado() {
        return this.valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public abstract double calcularRendimento();
}
