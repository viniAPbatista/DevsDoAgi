package semana04.heranca.ex03;

public class TransferenciaBancaria extends Transacao{
    private String contaOrigem;
    private String contaDestino;

    public TransferenciaBancaria(String id, double valor, String data, String contaOrigem, String contaDestino) {
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void resumoTransferencia() {
        System.out.printf("Transferencia de valor %.2f de %s para %s! \n", valor, contaOrigem, contaDestino);
    }
}
