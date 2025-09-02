package semana06.stream.lista2;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numeros = numeros.stream()
                .filter(n -> n % 2 == 0)
                        .toList();

        System.out.println(numeros);
    }
}
