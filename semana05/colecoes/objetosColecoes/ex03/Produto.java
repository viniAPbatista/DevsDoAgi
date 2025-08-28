package semana05.colecoes.objetosColecoes.ex03;

public class Produto {
    private String codigo;
    private String nome;
    private double quantidade;

    public Produto(String codigo, String nome, double quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}
