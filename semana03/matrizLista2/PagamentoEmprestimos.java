package semana03.matrizLista2;

import java.util.Scanner;

public class PagamentoEmprestimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] pagamentos;
        float [] totalPago;
        float totalPagoCliente;
        int i, j, clientes, parcelas, cliente, clienteAdiantado;

        System.out.print("Quantos clientes existem: ");
        clientes = sc.nextInt();

        System.out.print("Quantas parcelas existem: ");
        parcelas = sc.nextInt();

        pagamentos = new float[clientes][parcelas];

        for(i = 0; i < clientes; i++){
            for(j = 0; j < parcelas; j++){
                System.out.printf("Digite a parcela %d do cliente %d: ", j + 1, i + 1);
                pagamentos[i][j] = sc.nextFloat();
            }
        }

        System.out.printf("Digite o cliente que voce deseja consultar o total pago: ");
        cliente = sc.nextInt();

        totalPagoCliente = totalPago(pagamentos, cliente);
        System.out.printf("Total pago pelo cliente: " + totalPagoCliente + "\n");

        totalPago = totalPagoTodos(pagamentos, clientes);
        for(i = 0; i < totalPago.length; i++) {
            System.out.printf("Total pago pelo cliente %d: %.2f \n", i + 1, totalPago[i]);
        }

        clienteAdiantado = clienteMaisAdiantado(totalPago);
        System.out.println("Cliente mais adiantado: " + clienteAdiantado);
    }

    public static float totalPago(float [][] pagamentos, int cliente) {
        int j;
        float totalPago = 0;

        for(j = 0; j < pagamentos[0].length; j++){
            totalPago = totalPago + pagamentos[cliente - 1][j];
        }

        return totalPago;
    }

    public static float[] totalPagoTodos(float [][] saldos, int clientes) {
        int i, j;
        float soma = 0;
        float[] somaClientes = new float[clientes];

        for(i = 0; i < saldos.length; i++){
            for(j = 0; j < saldos[0].length; j++){
                soma = soma + saldos[i][j];
            }
            somaClientes[i] = soma;
            soma = 0;
        }
        return somaClientes;
    }

    public static int clienteMaisAdiantado(float [] totalPago) {
        int i, posicao = 0;
        float maior = totalPago[0];

        for(i = 0; i < totalPago.length; i++){
            if(totalPago[i] > maior){
                maior = totalPago[i];
                posicao = i;
            }
        }
        return posicao + 1;
    }
}
