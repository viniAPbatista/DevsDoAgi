package semana05.colecoes.objetosColecoes.ex07;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Feedback> feedbacks = new HashSet<>();

        feedbacks.add(new Feedback("789", "987", "Produto_pesismo"));
        feedbacks.add(new Feedback("132", "321", "Produto_otimo"));
        feedbacks.add(new Feedback("456", "654", "Produto_bom"));
        feedbacks.add(new Feedback("789", "111", "Produto_pesismo")); //teste erro idCliente
        feedbacks.add(new Feedback("111", "321", "Produto_pesismo")); //teste erro idProduto

        List<Feedback> listaFeedbacks = feedbacks.stream().sorted(Comparator.comparing(Feedback::getIdCliente)).toList();

        for(Feedback clientes : listaFeedbacks) {
            System.out.println(clientes);
        }
    }
}
