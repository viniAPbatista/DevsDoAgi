package semana05.colecoes.objetosColecoes.ex07;

import java.util.Objects;

public class Feedback {
    private String idCliente;
    private String idProduto;
    private String comentario;

    public Feedback(String idCliente, String idProduto, String comentario) {
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.comentario = comentario;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getComentario() {
        return comentario;
    }

    public String getIdProduto() {
        return idProduto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return Objects.equals(idCliente, feedback.idCliente) && Objects.equals(idProduto, feedback.idProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, idProduto);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "idCliente='" + idCliente + '\'' +
                ", idProduto='" + idProduto + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
