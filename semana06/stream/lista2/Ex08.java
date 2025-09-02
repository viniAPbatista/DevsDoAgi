package semana06.stream.lista2;

import java.util.Comparator;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(4, 6, 3, 7, 88, 33, 22, 345, 78, 1);

        numeros = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(numeros);
    }
}
