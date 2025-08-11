package semana02.pratica;

import java.util.Scanner;

public class RealDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float reais, limite = 1000, dolar;

        System.out.println("TAXA DE CAMBIO: 1 USD = 5 BRL");

        while(limite > 0) {
            System.out.print("Quanto deseja converter: ");
            reais = sc.nextFloat();

            limite = limite - reais;

            if (limite > 0 && reais >= 0) {
                dolar = reais / 5;
                System.out.printf("Voce recebera %.2f USD \n", dolar);
            }

            if(reais < 0) {
                System.out.println("Conversoes finalizadas!");
                return;
            }
        }
        System.out.println("O limite diario foi atingido!");
    }
}
