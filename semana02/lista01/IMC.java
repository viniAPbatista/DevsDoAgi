package br.com.devsdoagi.semana02.lista01;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        float imc, peso, altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();

        System.out.println("Digite seu peso: ");
        altura = sc.nextFloat();

        imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f \n", imc);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso!");
        }

        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Peso ideal!");
        }

        if(imc > 24.9) {
            System.out.println("Acima do peso!");
        }
    }
}