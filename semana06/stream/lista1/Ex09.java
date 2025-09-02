package semana06.stream.lista1;

import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<Integer> valores = List.of(1, 2, 3, 4, 5, -1, -2, 5);

        Integer positivos = valores.stream()
                .filter(n -> n > 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(positivos);
    }
}
