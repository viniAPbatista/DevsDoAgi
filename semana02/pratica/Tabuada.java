package semana02.pratica;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i;

        System.out.print("Digite um numero para calcular a tabuada: ");
        numero = sc.nextInt();

        for(i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d \n", numero, i, numero * i);
        }
    }
}
