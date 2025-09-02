package semana06.stream.lista1;

import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Double> saldos = List.of();

        double media = saldos.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(media);
    }
}
