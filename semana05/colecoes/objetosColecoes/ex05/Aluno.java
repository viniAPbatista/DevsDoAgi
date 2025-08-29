package semana05.colecoes.objetosColecoes.ex05;

public class Aluno {
    private String nome;
    private String id;

    public Aluno(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "NOME: " + nome + " - ID: " + id;
    }
}
