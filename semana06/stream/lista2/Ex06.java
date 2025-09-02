package semana06.stream.lista2;

import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<String> objetos = List.of("caneta", "copo", "lapis");

        objetos = objetos.stream()
                .map(n -> n.toUpperCase())
                .toList();

        System.out.println(objetos);
    }
}
