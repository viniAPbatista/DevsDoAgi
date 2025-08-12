package semana02.listaExMetodos;

import java.util.Scanner;
import  java.util.Random;

public class SimulaAcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoInicial, retornoMedio, volatilidade;
        double[] precos;
        int periodos;

        System.out.print("Digite o preço inicial: ");
        precoInicial = sc.nextDouble();

        System.out.print("Digite o retorno médio (drift): ");
        retornoMedio = sc.nextDouble();

        System.out.print("Digite a volatilidade: ");
        volatilidade = sc.nextDouble();

        System.out.print("Digite o número de períodos: ");
        periodos = sc.nextInt();

        precos = simularPrecoMonteCarlo(precoInicial, retornoMedio, volatilidade, periodos);
    }

    public static double[] simularPrecoMonteCarlo(double precoInicial, double retornoMedio, double volatilidade, int periodos) {
        Random random = new Random();
        double[] precos = new double[periodos + 1];
        double ruido;
        int i;

        precos[0] = precoInicial;

        for (i = 1; i <= periodos; i++) {
            ruido = random.nextGaussian() * volatilidade;
            precos[i] = precos[i - 1] * (1 + retornoMedio + ruido);
        }
        return precos;
    }
}
