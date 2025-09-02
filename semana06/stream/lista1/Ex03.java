package semana06.stream.lista1;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Double> saldos = Arrays.asList(-500.0, 1200.0, -100.0, 400.20);

        saldos = saldos.stream()
                .filter(n -> n < 0)
                .toList();

        System.out.println(saldos);
    }
}
