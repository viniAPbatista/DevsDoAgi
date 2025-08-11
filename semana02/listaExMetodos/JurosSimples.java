package br.com.devsdoagi.semana02.listaExMetodos;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float inicial, taxa, rendimento;
        int anos;

        System.out.print("Digite o valor inicial: ");
        inicial = sc.nextFloat();

        System.out.printf("Digite a taxa anual: ");
        taxa = sc.nextFloat();

        System.out.printf("Digite o tempo em anos do investimento: ");
        anos = sc.nextInt();

        rendimento = calcularJurosSimples(inicial, taxa, anos);

        System.out.printf("Rendimento: %.2f", rendimento);
    }

    public static float calcularJurosSimples(float inicial, float taxa, int anos) {
        return inicial * (taxa / 100) * anos;
    }
}
