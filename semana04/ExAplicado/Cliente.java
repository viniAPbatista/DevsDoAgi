package semana04.ExAplicado;

public class Cliente {
    private String nome;
    private String cpf;

    //construtor inicia os atributos vazios
    public Cliente() {
        this.nome = "";
        this.cpf = "";
    }

    //construtor inicia os atributos com dados fornecidos
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //getters e setters por conta das variaveis privadas
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
