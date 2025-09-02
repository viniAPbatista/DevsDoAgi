package semana06.stream.lista1;

import java.util.Comparator;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<Double> valores = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        valores = valores.stream()
                        .sorted(Comparator.reverseOrder())
                        .toList();

        System.out.println(valores);
    }
}
