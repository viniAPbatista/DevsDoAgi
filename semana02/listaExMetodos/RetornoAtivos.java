package semana02.listaExMetodos;

import java.util.Scanner;

public class RetornoAtivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] ativos = new float[3];
        float[] retornosEsperados = new float[3];
        float retornos;
        int i;

        for(i = 0; i < ativos.length; i++) {
            System.out.print("Digite o valor do ativo: ");
            ativos[i] = sc.nextFloat();
        }

        for(i = 0; i < retornosEsperados.length; i++) {
            System.out.println("Digite o retorn esperado: ");
            retornosEsperados[i] = sc.nextFloat();
        }

        retornos = simularCarteira(ativos, retornosEsperados);

        System.out.println("Retorno dos ativos: " + retornos);
    }

    public static float simularCarteira(float[] ativos, float[] retornosEsperados) {
        int i, j;
        float retornoAtivo, somaRetornos = 0;

        for (i = 0; i < ativos.length; i++) {
            for (j = i; j <=i ; j++) {
                retornoAtivo = ativos[i] + (ativos[i] * retornosEsperados[i]);
                somaRetornos = somaRetornos + retornoAtivo;
            }
        }

        return somaRetornos;
    }
}
