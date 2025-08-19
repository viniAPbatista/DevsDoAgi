package semana04.encapsulamento.ex05;

public class Main {
    public static void main(String[] args) {
        Investimento i = new Investimento();

        i.setTipoInvestimento("Renda fixa!");
        i.setValorInicial(5000);
        i.setTaxaAnual(0.05);

        i.calcularValorFuturo(10);

        i.exibirResumo();
    }
}
