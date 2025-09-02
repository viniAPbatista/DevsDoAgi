package semana06.stream.lista1;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<Double> saldos = Arrays.asList(100.00, 200.00, 300.00, 400.00);

        OptionalDouble media = saldos.stream()
                .mapToDouble()
                .average()
                .orElse(0);

        System.out.println(media);
    }
}
