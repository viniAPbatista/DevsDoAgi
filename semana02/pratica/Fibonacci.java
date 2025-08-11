package br.com.devsdoagi.semana02.pratica;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, numero, primeiro = 0, segundo = 1, atual = 0;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        System.out.println(primeiro);
        System.out.println(segundo);

        for(i = 0; i < numero; i++) {
            atual = primeiro + segundo;
            primeiro = segundo;
            segundo = atual;

            if(atual < numero) {
                System.out.println(atual);
            }
        }
    }
}
