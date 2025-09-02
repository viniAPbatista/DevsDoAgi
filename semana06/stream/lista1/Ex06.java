package semana06.stream.lista1;

import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Double> valores = List.of(100001.00, 100.00, 100003123.00, 80.99);

        double maiores = valores.stream()
                .filter(n -> n > 100000.00)
                .count();

        System.out.println(maiores);
    }
}
