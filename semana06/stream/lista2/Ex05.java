package semana06.stream.lista2;

import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<Integer> idades = List.of(1, 2, 3, 18, 33, 22, 55, 66, 4, 3, 5);

        Long maiores = idades.stream()
                .filter(n -> n >= 18)
                .count();

        System.out.println("Maiores de idade" + maiores);
    }
}
