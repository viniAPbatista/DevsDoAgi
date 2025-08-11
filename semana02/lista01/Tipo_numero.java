package br.com.devsdoagi.semana02.lista01;

import java.util.Scanner;

public class Tipo_numero {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if(numero > 0) {
            System.out.println("Numero positivo!");
        }

        if(numero < 0) {
            System.out.println("Numero Negativo!");
        }

        if(numero == 0) {
            System.out.println("Numero igual a 0!");
        }
    }
}