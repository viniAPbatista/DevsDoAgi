package semana03.matrizLista2;

import java.util.Scanner;

public class CreditoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [][] gastos;
        int clientes, tipos, cliente, i, j;
        double maiorGasto;

        System.out.print("Digite quantos clientes possui: ");
        clientes = sc.nextInt();

        System.out.print("Digite quantos tipos possui: ");
        tipos = sc.nextInt();

        gastos = new double[clientes][tipos];

        for(i = 0; i < gastos.length; i++){
            for(j = 0; j < gastos[0].length; j++){
                System.out.printf("Digite o gasto %d do cliente %d", j + 1, i + 1);
                gastos[i][j] = sc.nextDouble();
            }
        }

        System.out.print("Qual cliente voce deseja ver o maior gasto: ");
        cliente = sc.nextInt();

        maiorGasto = gastoMaximoCliente(gastos, cliente);
        System.out.println("Maior gasto do cliente: " + maiorGasto);
    }

    public static double gastoMaximoCliente(double [][] gastos, int cliente) {
        int i;
        double maior = gastos[cliente - 1][0];

        for(i = 0; i < gastos[0].length; i++) {
            if(gastos[cliente - 1][i] > maior) {
                maior = gastos[cliente - 1][i];
            }
        }

        return maior;
    }
}
