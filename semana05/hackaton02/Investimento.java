package semana05.hackaton02;

abstract class Investimento {
    //atributo privado
    private double valorInicial;

    //getters e setters atributos privados
    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    //construtores
    public Investimento() {
        this.valorInicial = 0.0;
    }

    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    //metodo abstrato
    public abstract double calcularRendimento();
}
