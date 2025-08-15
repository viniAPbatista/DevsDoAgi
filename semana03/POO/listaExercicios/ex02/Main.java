package semana03.POO.listaExercicios.ex02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.titular = "Vinicius Batista";
        minhaConta.numeroConta = "1234567890";
        minhaConta.saldo = 1000;

        minhaConta.depositar(500);
        minhaConta.sacar(400);

        minhaConta.exibirSaldo();
    }
}
