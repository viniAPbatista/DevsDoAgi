package semana02.listaExMetodos;

import java.util.Scanner;

public class Correlacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] serie1;
        float[] serie2;
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
            System.out.print("Digite um valor para serie 1: ");
            serie2[i] = sc.nextFloat();
        }

        calcularCorrelacao(serie1, serie2);
    }

    public static float calcularCorrelacao(float[] serie1, float[] serie2) {
        float correlacao = 0;

        //teste comentario github

        return correlacao;
    }
}
