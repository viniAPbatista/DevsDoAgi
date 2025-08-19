package semana03.matrizLista2;

import java.util.Scanner;

public class RiscoCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] notas;
        int clientes, cirterios, i, j, cliente;
        float mediaCliente;

        System.out.print("Quantos clietes existem: ");
        clientes = sc.nextInt();

        System.out.print("Quantos criterios existem: ");
        cirterios = sc.nextInt();

        notas = new float[clientes][cirterios];

        for(i = 0; i < notas.length; i++){
            for(j = 0; j < notas[0].length; j++) {
                System.out.printf("Digite a nota do cliente %d no criterio %d: ", i + 1, j + 1);
                notas[i][j] = sc.nextFloat();
            }
        }

        System.out.print("Qual cliente voce deseja ver a media das notas: ");
        cliente = sc.nextInt();

        mediaCliente = mediaNotaCliente(notas, cliente);
        System.out.println("Media do cliente: " + mediaCliente);
    }

    public static float mediaNotaCliente(float [][] notas, int cliente) {
        int i;
        float media, soma = 0;

        for(i = 0; i < notas[0].length; i++) {
            soma = soma + notas[cliente - 1][i];
        }

        media = soma / i ;

        return media;
    }
}
