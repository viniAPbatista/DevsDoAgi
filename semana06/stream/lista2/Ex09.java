package semana06.stream.lista2;

import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

        numeros = numeros.stream()
                .distinct()
                .toList();

        System.out.println(numeros);
    }
}
