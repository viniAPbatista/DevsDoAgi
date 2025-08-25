package semana05.hackaton01;

public class Gerente extends Funcionario{
    //declarando atributos privados
    private double bonus;

    //construtores da classe
    public Gerente() {
        super();
        this.bonus = 2000;
    }

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = 2000;
    }

    //getter atributo bonus
    public double getBonus() {
        return this.bonus;
    }
}
