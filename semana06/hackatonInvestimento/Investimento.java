package semana06.hackatonInvestimento;

public class Investimento {
    private String tipo;
    private double valor;

    // Construtor
    public Investimento ( String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    //Getters
    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "INVESTIMENTO: " + tipo + " VALOR: " + valor;
    }
}

