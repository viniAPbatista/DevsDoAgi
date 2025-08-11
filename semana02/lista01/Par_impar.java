package br.com.devsdoagi.semana02.lista01;

import java.util.Scanner;

public class Par_impar {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("Numero par!");
        }

        if(numero % 2 == 1) {
            System.out.println("Numero impar!");
        }
    }
}
