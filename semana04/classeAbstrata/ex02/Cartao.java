package semana04.classeAbstrata.ex02;

abstract class Cartao {
    private String numero;
    private double limite;

    public Cartao() {
        this.numero = null;
        this.limite = 0.0;
    }

    public Cartao(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public abstract void processarCompra(double valor);
}
