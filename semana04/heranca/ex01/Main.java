package semana04.heranca.ex01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Vinicius", "1234567", 2000, 1000);

        c1.sacarComChequeEspecial(500);

        c1.exibirExtrato();
    }
}