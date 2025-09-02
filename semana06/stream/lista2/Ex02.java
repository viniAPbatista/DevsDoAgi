package semana06.stream.lista2;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(6, 7, 8, 9, 11, 12, 13, 14, 99);

        numeros = numeros.stream()
                .filter(n -> n > 10)
                .toList();

        System.out.println(numeros);
    }
}
