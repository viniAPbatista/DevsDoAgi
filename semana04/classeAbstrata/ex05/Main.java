package semana04.classeAbstrata.ex05;

public class Main {
    public static void main(String[] args) {
        Cambio c1 = new CambioDolar();
        Cambio c2 = new CambioEuro();

        c1.setValorEmReais(500);
        c2.setValorEmReais(600);

        System.out.println(c1.converter());
        System.out.println(c2.converter());
    }
}
