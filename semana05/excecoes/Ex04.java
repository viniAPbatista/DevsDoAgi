package semana05.excecoes;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        double valorEmprestimo;
        double taxaJuros;
        double valorParecelas;

        System.out.print("Digite a taxa de juros mensal: ");
        taxaJuros = sc.nextDouble();

        System.out.printf("Digite o valor do emprestimo: ");
        valorEmprestimo = sc.nextDouble();

        try {
            valorParecelas = parcelasEmprestimo(taxaJuros, valorEmprestimo);
            System.out.println("Valor das parcelas: " + valorParecelas);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double parcelasEmprestimo(double taxaJuros, double valorEmprestimo) throws Exception{
        double valorParcela;

        if(taxaJuros < 0) {
            throw new IllegalArgumentException("ERRO! Taxa de juros negativa!");
        }

        if (valorEmprestimo <= 0) {
            throw new ArithmeticException("ERRO! O valor deve ser maior que 0!");
        }

        valorParcela = valorEmprestimo * (taxaJuros * Math.pow(1 + taxaJuros, 12)) / (Math.pow(1 + taxaJuros, 12) - 1);

        return valorParcela;
    }
}
