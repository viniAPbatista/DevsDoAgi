package semana06.stream.lista2;

import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        Integer produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(produto);
    }
}
