package semana06.stream.lista1;

import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> valores = List.of(1, 2, 3, -6, -7, -8);

         valores = valores.stream()
                .filter(n -> n < 0)
                 .toList();

        System.out.println(valores);
    }
}
