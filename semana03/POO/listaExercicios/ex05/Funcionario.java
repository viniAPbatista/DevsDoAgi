package semana03.POO.listaExercicios.ex05;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;
    public double descontoIR;

    public double calcularSalarioLiquido() {
        return salarioBruto - salarioBruto * descontoIR - salarioBruto * descontoINSS;
    }

    public void exibirFolhaDePagamento() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto IR: " + descontoIR);
        System.out.println("Salario Liquido: " + calcularSalarioLiquido());
    }
}
