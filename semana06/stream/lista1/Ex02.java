package semana06.stream.lista1;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Double> depositos = Arrays.asList(500.00, 120.00, 700.0, 1001.00);

        double maior = depositos.stream()
                .max(Double :: compareTo)
                .orElse(0.0);

        System.out.println(maior);
    }
}
