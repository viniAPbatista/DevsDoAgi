package semana05.hackatonTeste;

import java.time.LocalDateTime;

class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;
    private int contaOrigem, contaDestino;

    public Transacao(String tipo, double valor, int contaOrigem, int contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.data = LocalDateTime.now();
    }

    public Transacao(String tipo, double valor, int contaOrigem) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return data + " | " + tipo + " | Valor: " + valor + " | Origem: " + contaOrigem + " | Destino: " + contaDestino;
    }
}
