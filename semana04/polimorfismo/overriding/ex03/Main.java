package semana04.polimorfismo.overriding.ex03;

public class Main {
    public static void main(String[] args) {
        int i;

        Emprestimo[] valores = {
                new Emprestimo(100),
                new EmprestimoPessoal(100),
                new EmprestimoEmpresarial(100)
        };

        for(i = 0; i < valores.length; i++) {
            System.out.println("Valor " + valores[i].calcularParcela(12));
        }
    }
}
