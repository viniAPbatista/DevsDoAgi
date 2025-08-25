package semana05.hackaton01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double salario;

        System.out.println("===== CADASTRO DE FUNCIONARIOS ===== \n");
        System.out.println("===== GERENTE =====");

        //instanciado o objeto gerente
        Funcionario gerente = new Gerente();

        //entrada de dados do usuario
        System.out.print("Digite o nome do Gerente: ");
        nome = sc.nextLine();
        //set no nome do gerente digitado pelo usuario
        gerente.setNome(nome);

        System.out.print("Digite o salario do gerente: ");
        salario = sc.nextDouble();
        //set salario do gerente digitado pelo usuario
        gerente.setSalario(salario);
        sc.nextLine();
        //pula linha  - apenas formatação de saida
        System.out.println("\n");

        System.out.println("===== ANALISTA =====");

        //instancia o objeto analista
        Funcionario analista = new Analista();

        System.out.print("Digite o nome do Analista: ");
        nome = sc.nextLine();
        //set no nome do analista
        analista.setNome(nome);

        System.out.print("Digite o salario do Analista: ");
        salario = sc.nextDouble();
        //set no salario do analista
        analista.setSalario(salario);
        System.out.println("\n");

        System.out.println("===== EXIBIR INFORMACOES ===== \n");
        System.out.println("===== INFORMACOES GERENTE =====");
        //informacoes gerente utulizandos os getters
        System.out.println("NOME: " + gerente.getNome());
        System.out.println("SALARIO: " + gerente.getSalario());
        System.out.println("BONUS: " + gerente.getBonus());
        System.out.println("\n");

        System.out.println("===== INFORMACOES ANALISTA =====");
        //informacoes analista utilizando os getters
        System.out.println("NOME: " + analista.getNome());
        System.out.println("SALARIO: " + analista.getSalario());
        System.out.println("BONUS: " + analista.getBonus());
    }
}
