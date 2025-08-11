package br.com.devsdoagi.semana02.listaExMetodos;

import java.util.Scanner;

public class MaiorAtivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valor1, valor2, maior_valor;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextFloat();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextFloat();

        maior_valor = compararAtivos(valor1, valor2);

        System.out.println("O maoir valor é: " + maior_valor);
    }

    public static float compararAtivos(float valor1, float valor2) {
        if(valor1 < valor2) {
            return valor2;
        } else {
            return valor1;
        }
    }
}
