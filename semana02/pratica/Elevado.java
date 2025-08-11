package semana02.pratica;

import java.util.Scanner;

public class Elevado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, i, resultado = 1;

        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();

        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();

        for(i = 0; i < y; i++){
            resultado = resultado * x;
        }

        System.out.println(resultado);
    }
}
