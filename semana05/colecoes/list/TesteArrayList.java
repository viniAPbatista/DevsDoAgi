package semana05.colecoes.list;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("ana");
        nomes.add("julio");
        nomes.add("vinicius");

        System.out.println("Nomes: " + nomes);

        for (String nome : nomes) {
            System.out.println("Nomes: " + nome);
        }
    }
}
