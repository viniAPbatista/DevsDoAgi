package semana02.vetores;

import java.util.Scanner;

public class Impostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] compra = new float [5];
        float[] venda = new float [5];
        float[] lucro = new float[5];
        float lucroTotal;
        double imposto;
        int i;

        for(i = 0; i < compra.length; i++) {
            System.out.printf("Digite o valor de compra da acao %d: ", i + 1);
            compra[i] = sc.nextFloat();
        }

        for(i = 0; i < compra.length; i++) {
            System.out.printf("Digite o valor de venda da acao %d: ", i + 1);
            venda[i] = sc.nextFloat();
        }

        lucro = lucroPorAtivo(compra, venda);

        for (i = 0; i < lucro.length; i++) {
            System.out.printf("Lucro acao %d: %.2f \n", i + 1, lucro[i]);
        }

        lucroTotal = lucroTotal(lucro);
        System.out.println("Lucro total: " + lucroTotal);

        imposto = calcularImposto(lucroTotal);
        System.out.println("Imposto: " + imposto);
    }

    public static float[] lucroPorAtivo(float[] compra, float[] venda) {
        int i;
        float[] lucro = new float [5];

        for (i = 0; i < compra.length; i++) {
            lucro[i] = venda[i] - compra[i];
        }
        return lucro;
    }

    public static float lucroTotal(float[] lucro) {
        int i;
        float lucroTotal = 0;

        for(i = 0; i < lucro.length; i++) {
            lucroTotal = lucroTotal + lucro[i];
        }
        return lucroTotal;
    }

    public static double calcularImposto(float lucroTotal) {
        double imposto = 0;

        if(lucroTotal > 20000) {
            imposto = lucroTotal * 0.15;
        }

        if(lucroTotal <= 20000) {
            imposto = 0;
        }

        return imposto;
    }
}
