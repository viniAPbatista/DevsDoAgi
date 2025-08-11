package br.com.devsdoagi.semana02.lista01;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        float numero, media, aproxima;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = sc.nextFloat();

        System.out.println("Digite a média: ");
        media = sc.nextFloat();

        aproxima = (numero / media) * 100;

        System.out.printf("Valor porcentagem media: %.2f", aproxima);
    }
}
