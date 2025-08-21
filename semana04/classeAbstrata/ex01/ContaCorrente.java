package semana04.classeAbstrata.ex01;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    public ContaCorrente() {
        super();
    }

    @Override
    public void atualizarMensal(){
        double saldoAtualizado;

        saldoAtualizado = getSaldo() - 15;
        System.out.printf("Saldo atualizado: %f \n", saldoAtualizado);

        setSaldo(saldoAtualizado);
    }
}
