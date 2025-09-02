package semana06.stream.lista1;

import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<Double> valores = List.of(1001.0, 3242.0, 500.0, 200.0, 234234.0);

        boolean maiores = valores.stream()
                .anyMatch(n -> n > 1000000.00);

        System.out.println(maiores);
    }
}
