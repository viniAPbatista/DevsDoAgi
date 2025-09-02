package semana05.colecoes.objetosColecoes.ex09;

public class Pedido {
    private String idPedido;
    private String nomeCliente;
    private String itemPedido;

    public Pedido(String idPedido, String nomeCliente, String itemPedido) {
        this.idPedido = idPedido;
        this.nomeCliente = nomeCliente;
        this.itemPedido = itemPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getItemPedido() {
        return itemPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido='" + idPedido + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", itemPedido='" + itemPedido + '\'' +
                '}';
    }
}
