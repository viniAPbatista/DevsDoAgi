package semana04.encapsulamento.ex01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Vinicius Batista");
        cb.setNumeroConta("123456789");
        cb.depositar(10000);

        cb.sacar(5000);

        cb.exibirInformacoes();
    }
}
