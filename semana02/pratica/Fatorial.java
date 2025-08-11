package br.com.devsdoagi.semana02.pratica;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, fatorial = 1;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        for(i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.printf("Fatorial do numero: %d \n", fatorial);
    }
}
