package semana05.colecoes.objetosColecoes.ex01;

public class Cliente {
    private String id;
    private String nome;
    private String cpf;

    public Cliente(String id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
