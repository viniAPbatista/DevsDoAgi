package semana04.classeAbstrata.ex01;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, double saldo){
        super(numero, saldo);
    }

    public ContaPoupanca(){
        super();
    }

    public void atualizarMensal() {
        double saldoAtualizado;

        saldoAtualizado = getSaldo() * 1.005;
        System.out.printf("Saldo atualizado: %f \n", saldoAtualizado);

        setSaldo(saldoAtualizado);
    }
}
