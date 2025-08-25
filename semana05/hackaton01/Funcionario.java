package semana05.hackaton01;

public class Funcionario {
    //atributos declarados privados
    private String nome;
    private double salario;
    private double bonus;

    //construtores
    public Funcionario() {
        this.nome = "";
        this.salario = 0.0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //getters e setters dos atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }
}
