package semana06.stream.lista1;

import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Double> taxas = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        double produto = taxas.stream()
                .reduce(1.0, (a, b) -> a * b);

        System.out.println(produto);
    }
}
