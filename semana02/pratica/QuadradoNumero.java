package semana02.pratica;

import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i, impares = 1, numero_quadrado = 0;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        for(i = 0; i < numero; i++) {
            numero_quadrado = numero_quadrado + impares;
            impares = impares + 2;
        }

        System.out.printf("O quadrado de %d é %d", numero, numero_quadrado);
    }
}
