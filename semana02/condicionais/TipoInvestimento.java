package semana02.condicionais;

import java.util.Scanner;

public class TipoInvestimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Escolha uma opção de investimento: ");
        System.out.println("1 - CDB");
        System.out.println("2 - Poupança");
        System.out.println("3 - Tesouro Direto");
        System.out.println("4 - FII");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("CDB - Rendimento de 1.2% ao mês");
            }

            case 2 -> {
                System.out.println("Poupança - Rendimento de 0.5% ao mês");
            }

            case 3 -> {
                System.out.println("Tesouro Direto - Rendimento de 0.8% ao mês");
            }

            case 4 -> {
                System.out.println("FII - Rendimento de 1% ao mês");
            }

            default -> System.out.println("Opção invalida");
        }
    }
}
