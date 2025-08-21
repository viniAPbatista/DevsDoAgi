package semana04.classeAbstrata.ex05;

public class CambioEuro extends Cambio{
    public CambioEuro() {
        super();
    }

    public CambioEuro(double valorEmReais, double taxaCambio) {
        super(valorEmReais, taxaCambio);
    }

    @Override
    public double converter() {
        double euro;
        setTaxaCambio(6.0);

        euro = getValorEmReais() / getTaxaCambio();

        return euro;
    }
}
