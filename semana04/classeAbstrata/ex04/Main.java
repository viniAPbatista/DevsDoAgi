package semana04.classeAbstrata.ex04;

public class Main {
    public static void main(String[] args) {
        Emprestimo e1 = new EmprestimoPessoal();
        Emprestimo e2 = new EmprestimoEmpresarial();

        e1.setMeses(10);
        e1.setValor(1000);
        e1.setTaxaJuros(0.1);
        System.out.println(e1.calcularParcela());

        e2.setMeses(10);
        e2.setValor(1000);
        e2.setTaxaJuros(0.1);
        System.out.println(e2.calcularParcela());
    }
}
