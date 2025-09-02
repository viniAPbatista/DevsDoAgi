package semana06.stream.lista1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Double> valores = Arrays.asList(6000.00, 3000.00, 7000.00, 2000.00, 1000.00);
        double soma = valores.stream()
                .filter(n -> n > 5000.00)
                .reduce((double) 0, (a, b) -> a + b);
        System.out.println(soma);
    }
}
