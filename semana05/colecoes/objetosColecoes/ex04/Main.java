package semana05.colecoes.objetosColecoes.ex04;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();

        adicionarContato(contatos, "Vini", "23456", "vini@gmail.com");
        adicionarContato(contatos, "Alef", "23456", "teste@gmail.com");
        adicionarContato(contatos, "Rafa", "23456", "teste1@gmail.com");
        adicionarContato(contatos, "Ana", "09876", "vini@gmail.com");   //erro, email igual, ignora

        exibirContatos(contatos);
    }

    public static void adicionarContato(Set<Contato> contatos, String nome, String telefone, String email) {
        contatos.add(new Contato(nome, telefone, email));
    }

    public static void exibirContatos(Set<Contato> contatos) {
        List<Contato> listaContatos = contatos.stream().sorted(Comparator.comparing(Contato::getNome)).toList();

        for(Contato contato : listaContatos) {
            System.out.println(contato);
        }
    }
}
