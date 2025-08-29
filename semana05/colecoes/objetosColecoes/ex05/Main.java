package semana05.colecoes.objetosColecoes.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Aluno>> matriculados = new HashMap<>();

        adicionarAlunos(matriculados, "Vini", "0101", "1");
        adicionarAlunos(matriculados, "Duda", "0202", "2");
        adicionarAlunos(matriculados, "Alefe", "0303", "1");

        exibirAlunos(matriculados);
    }

    public static void adicionarAlunos(Map<String, List<Aluno>> matriculados, String nome, String id, String codigoCurso) {
        matriculados.putIfAbsent(codigoCurso, new ArrayList<>());
        matriculados.get(codigoCurso).add(new Aluno(nome, id));
    }

    public static void exibirAlunos(Map<String, List<Aluno>> matriculados) {
        for (Map.Entry<String, List<Aluno>> entry : matriculados.entrySet()) {
            System.out.println("CURSO: " + entry.getKey() + " - ALUNOS: " + entry.getValue());
        }
    }
}
