package semana02.vetores;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] preco = new float[7];
        float[] media;
        int i, dias;

        for (i = 0; i < 7; i++) {
            System.out.printf("Digite o valor da ação no dia %d: ", i + 1);
            preco[i] = sc.nextFloat();
        }

        System.out.println("Deseja calcular a média de quantos dias? ");
        dias = sc.nextInt();

        media = mediaMovel(preco, dias);

        System.out.println("\nMédias móveis:");
        for (i = 0; i < media.length; i++) {
            System.out.printf("Dia %d: %.2f\n", i + dias, media[i]);
        }
    }

    public static float[] mediaMovel(float[] preco, int dias) {
        int i, j;
        float soma_intervalo;
        int tamanho = preco.length - dias + 1;
        float[] medias = new float[tamanho];

        for (i = 0; i <= preco.length - dias; i++) {
            soma_intervalo = 0;
            for (j = i; j < i + dias; j++) {
                soma_intervalo += preco[j];
            }
            medias[i] = soma_intervalo / dias;
        }

        return medias;
    }
}
