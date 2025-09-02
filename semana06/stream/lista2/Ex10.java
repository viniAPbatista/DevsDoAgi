package semana06.stream.lista2;

import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> produtos = List.of(70, 80, 90, 100, 120, 130, 1, 2, 3, 4);

        Double total = produtos.stream()
                .filter(n -> n > 50)
                .map(n -> n * 0.9)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println(total);
    }
}
