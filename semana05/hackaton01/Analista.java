package semana05.hackaton01;

public class Analista extends Funcionario{
    //declarando atributos privados
    private double bonus;

    //construtores da classe
    public Analista() {
        super();
        this.bonus = 1000;
    }

    public Analista(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = 1000;
    }

    //getter atributo bonus
    public double getBonus() {
        return this.bonus;
    }
}
