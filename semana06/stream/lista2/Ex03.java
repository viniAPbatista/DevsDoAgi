package semana06.stream.lista2;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 10);

        Integer soma = numeros.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(soma);
    }
}
