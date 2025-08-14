package semana03.matrizLista2;

import java.util.Scanner;

public class ReceitasAgencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] receitas;
        float[] totalAgencia;
        float[] percentual;
        int i, j, agencias, segmentos;

        System.out.print("Digite a quantidade de agencias: ");
        agencias = sc.nextInt();

        System.out.print("Digite a quantidade de segmentos: ");
        segmentos = sc.nextInt();

        receitas = new float[agencias][segmentos];

        for(i = 0; i < receitas.length; i++){
            for(j = 0; j < receitas[0].length; j++){
                System.out.printf("Digite a receita da agencia %d no segmento %d: ", i + 1, j + 1);
                receitas[i][j] = sc.nextFloat();
            }
        }

        totalAgencia = totalArrecadadoPorAgencia(receitas);
        for(i = 0; i < totalAgencia.length; i++){
            System.out.printf("Total arrecadado pela agencia %d: %.2f \n", i + 1, totalAgencia[i]);
        }

        percentual = percentualPorSegmento(receitas);
        for(i = 0; i < percentual.length; i++){
            System.out.printf("O segmento %d representa %.2f do total geral! \n", i + 1, percentual[i]);
        }
    }

    public static float[] totalArrecadadoPorAgencia(float[][] receitas) {
        int i, j;
        float total = 0;
        float[] totalAgencia = new float[receitas.length];

        for(i = 0; i < receitas.length; i++){
            for(j = 0; j < receitas[0].length; j++){
                total = total + receitas[i][j];
            }
            totalAgencia[i] = total;
            total = 0;
        }

        return totalAgencia;
    }

    public static float[] percentualPorSegmento(float [][] receitas) {
        int i, j;
        float totalGeral = 0, totalSegmento = 0, porcentagemSegmento = 0;
        float[] porcentagemTodosSegmentos = new float[receitas[0].length];

        for(i = 0; i < receitas.length; i++){
            for(j = 0; j < receitas[0].length; j++){
                totalGeral = totalGeral + receitas[i][j];
            }
        }

        for(j = 0; j < receitas[0].length; j++){
            for(i = 0; i < receitas.length; i++){
                totalSegmento = totalSegmento + receitas[i][j];
                porcentagemSegmento = (totalSegmento / totalGeral) * 100;
            }
            porcentagemTodosSegmentos[j] = porcentagemSegmento;
            totalSegmento = 0;
        }

        return porcentagemTodosSegmentos;
    }
}
