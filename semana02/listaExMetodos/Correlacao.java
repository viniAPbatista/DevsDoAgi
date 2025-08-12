package semana02.listaExMetodos;

import java.util.Scanner;

public class Correlacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] serie1;
        float[] serie2;
        float resultado;
        int qntSerie1, qntSerie2, i;

        System.out.print("Digite o tamanho da serie 1: ");
        qntSerie1 = sc.nextInt();

        System.out.print("Digite o tamanho da serie 2: ");
        qntSerie2 = sc.nextInt();

        serie1 = new float[qntSerie1];
        serie2 = new float[qntSerie2];

        for (i = 0; i < serie1.length; i++) {
            System.out.print("Digite um valor para serie 1: ");
            serie1[i] = sc.nextFloat();
        }

        for (i = 0; i < serie2.length; i++) {
            System.out.print("Digite um valor para serie 2: ");
            serie2[i] = sc.nextFloat();
        }

        resultado = calcularCorrelacao(serie1, serie2);
        System.out.println("Correlação: " + resultado);
    }

    public static float calcularCorrelacao(float[] serie1, float[] serie2) {
        int n = serie1.length;
        float somaX = 0, somaY = 0;
        float somaXY = 0, somaX2 = 0, somaY2 = 0;

        for (int i = 0; i < n; i++) {
            somaX += serie1[i];
            somaY += serie2[i];
            somaXY += serie1[i] * serie2[i];
            somaX2 += serie1[i] * serie1[i];
            somaY2 += serie2[i] * serie2[i];
        }

        float numerador = (n * somaXY) - (somaX * somaY);
        float denominador = (float) Math.sqrt(((n * somaX2) - (somaX * somaX)) * ((n * somaY2) - (somaY * somaY))
        );

        if (denominador == 0) {
            return Float.NaN;
        }

        return numerador / denominador;
    }
}
