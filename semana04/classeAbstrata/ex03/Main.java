package semana04.classeAbstrata.ex03;

public class Main {
    public static void main(String[] args) {
        Investimento i1 = new RendaFixa();
        Investimento i2 = new RendaVariavel();

        i1.setValorAplicado(1000);
        System.out.println(i1.calcularRendimento());

        i2.setValorAplicado(1000);
        System.out.println(i2.calcularRendimento());
    }
}
