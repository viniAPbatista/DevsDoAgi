package semana04.classeAbstrata.ex05;

import java.security.PublicKey;

abstract class Cambio {
    private double valorEmReais;
    private double taxaCambio;

    public Cambio() {
        this.valorEmReais = 0.0;
        this.taxaCambio = 0.0;
    }

    public Cambio(double valorEmReais, double taxaCambio) {
        this.valorEmReais = valorEmReais;
        this.taxaCambio = taxaCambio;
    }

    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public double getValorEmReais() {
        return valorEmReais;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public abstract double converter();
}
