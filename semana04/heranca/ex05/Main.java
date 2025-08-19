package semana04.heranca.ex05;

public class Main {
    public static void main(String[] args) {
        InvestimentoRendaFixa i1 = new InvestimentoRendaFixa("123456", 1000, 0.15, 12);

        i1.cacularValorFinal();
        i1.exibirValorFinal();
    }
}
