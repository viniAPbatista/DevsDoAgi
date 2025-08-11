package br.com.devsdoagi.semana02.Exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade, numero;
        String nome, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");

        System.out.printf("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.printf("Voce tem %d anos! \n", idade);

        if(idade >= 18){
            System.out.println("Maior de idade!");
        }

        if(idade < 18) {
            System.out.println("Menor de idade!");
        }

        System.out.printf("Digite seu nome: ");
        nome = sc.next();
        System.out.printf("Seu nome é: %s \n", nome);

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        resultado = (numero > 5) ? "Maior que 5" : "Menor ou igual a 5";
        System.out.println(resultado);

        System.out.printf("Programa finalizado.");
    }
}