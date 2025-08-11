package br.com.devsdoagi.semana02.listaExMetodos;

import java.util.Scanner;

public class ConverterMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float reais, taxa, dolar;

        System.out.print("Digite o valor em real: ");
        reais = sc.nextFloat();

        System.out.print("Digite a taxa o dolar: ");
        taxa = sc.nextFloat();

        dolar =  converterMoeda(reais, taxa);

        System.out.printf("Valor em dolar: %.2f", dolar);
    }

    public static float converterMoeda(float real, float taxa) {
        return real / taxa;
    }
}
