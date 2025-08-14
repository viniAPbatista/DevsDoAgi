package semana03.matrizLista2;

import java.util.Scanner;

public class CartaoCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] gastos;
        float gastoCliente;
        int i, j, clientes, meses, cliente, clienteMaiorGasto;

        System.out.print("Quantos clientes: ");
        clientes = sc.nextInt();

        System.out.print("Quantos meses: ");
        meses = sc.nextInt();

        gastos = new float[clientes][meses];

        for(i = 0; i < gastos.length; i++){
            for (j = 0; j < gastos[0].length; j++){
                System.out.printf("Digite o gasto do cliente %d no mes %d: ", i + 1, j + 1);
                gastos[i][j] = sc.nextFloat();
            }
        }

        System.out.print("Qual cliente voce deseja consultar o gasto: ");
        cliente = sc.nextInt();

        gastoCliente = gastoTotalCliente(gastos, cliente);
        System.out.println("Gasto total do cliente: " + gastoCliente);

        clienteMaiorGasto = clienteMaiorGasto(gastos);
        System.out.printf("Cliente com maior gasto: " + clienteMaiorGasto);
    }

    public static float gastoTotalCliente(float [][] gastos, int cliente){
        int i, j;
        float total = 0;

        for(j = 0; j < gastos[0].length; j++){
            total = total + gastos[cliente - 1][j];
        }

        return total;
    }

    public static int clienteMaiorGasto(float[][] gastos){
        int i, j, posicao = 0;
        float total = 0, maior = 0;
        float[] totalClientes = new float[gastos.length];

        for(i = 0; i < gastos.length; i++) {
            for(j = 0; j <  gastos[0].length; j++){
                total = total + gastos[i][j];
            }
            totalClientes[i] = total;
            total = 0;
        }

        for(i = 0; i < totalClientes.length; i++){
            if(totalClientes[i] > maior){
                maior = totalClientes[i];
                posicao = i + 1;
            }
        }

        return posicao;
    }
}
