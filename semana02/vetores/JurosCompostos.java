package semana02.vetores;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float inicial = 1000;
        float[] totalMes = new float [6];
        float taxa = 0.02f;
        int meses = 6, i;

        totalMes = calcularJurosCompostos(inicial, taxa, meses);

        for(i = 0; i < totalMes.length; i++) {
            System.out.printf("Total mes %d: %.2f \n", i + 1, totalMes[i]);
        }
    }

    public static float[] calcularJurosCompostos(float inicial, float taxa, int mes) {
        float[] jurosMeses = new float [6];
        int i;

        for(i = 0; i < mes; i++) {
            inicial = inicial + (inicial * taxa);

            jurosMeses[i] = inicial;
        }

        return jurosMeses;
    }
}
