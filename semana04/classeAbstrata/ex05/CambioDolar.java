package semana04.classeAbstrata.ex05;

public class CambioDolar extends Cambio{
    public CambioDolar() {
        super();
    }

    public CambioDolar(double valorEmReais, double taxaCambio) {
        super(valorEmReais, taxaCambio);
    }

    public double converter() {
        double dolar;
        setTaxaCambio(5.0);

        dolar = getValorEmReais() / getTaxaCambio();

        return dolar;
    }
}
