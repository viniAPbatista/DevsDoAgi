package semana05.colecoes.objetosColecoes.ex02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Assinantes> assinantes = new HashSet<>();

        assinantes.add(new Assinantes("1", "Vinicius", "vinicius@gmail.com"));
        assinantes.add(new Assinantes("2", "Igor", "Igor@gmail.com"));
        assinantes.add(new Assinantes("3", "Joao", "vinicius@gmail.com"));

        for( Assinantes assinantes1 : assinantes) {
            System.out.println("ID: " + assinantes1.getId() + " - NOME: " + assinantes1.getNome() + " - EMAIL: " + assinantes1.getEmail());
        }
    }
}
