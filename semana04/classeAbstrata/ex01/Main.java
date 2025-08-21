package semana04.classeAbstrata.ex01;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente("12345", 1000);
        Conta c2 = new ContaPoupanca();

        c2.setNumero("1234567");
        c2.setSaldo(1000);

        c1.atualizarMensal();
        c2.atualizarMensal();

        c1.atualizarMensal();
        c2.atualizarMensal();
    }
}
