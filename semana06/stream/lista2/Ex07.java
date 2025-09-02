package semana06.stream.lista2;

import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 4, 77, 1, 99, 44, 123, 5);

        numeros = numeros.stream()
                .sorted()
                .toList();

        System.out.println(numeros);
    }
}
