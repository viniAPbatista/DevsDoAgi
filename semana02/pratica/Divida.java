package semana02.pratica;

import java.util.Scanner;

public class Divida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float divida, pagamento;
        int i = 1;

        System.out.print("Digite o valor da divida: ");
        divida = sc.nextFloat();

        while (divida > 0) {
            System.out.printf("Digite o valor do pagamento do mes %d: ", i);
            pagamento = sc.nextFloat();

            divida = divida - pagamento;

            System.out.printf("Divda mes %d: %.2f \n", i, divida);

            pagamento = 0;
            i++;
        }
        System.out.printf("Divida Quitada no mes %d!", i);
    }
}
