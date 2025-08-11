package semana02.pratica;

import java.util.Scanner;

public class GastosMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float gastos = 1, totalGastos = 0;

        while (gastos > 0) {
            System.out.print("Digite seus gastos: ");
            gastos = sc.nextFloat();

            if (gastos >= 0) {
                totalGastos = totalGastos + gastos;
            }

            if(gastos < 0) {
                System.out.println("Total gasto: " + totalGastos);
                System.exit(0);
            }

            if(totalGastos > 5000) {
                System.out.println("Seus gastos ultrapassaram os R$ 5000");
            }
        }
    }
}
