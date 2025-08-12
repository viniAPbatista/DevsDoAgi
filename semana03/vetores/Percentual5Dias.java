package semana02.vetores;

import java.util.Scanner;

public class Percentual5Dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] preco = new float [5];
        float crescimento;
        int i;

        for(i = 0; i < 5; i++) {
            System.out.printf("Digite o preco do dia %d: ", i + 1);
            preco[i] = sc.nextFloat();
        }

        crescimento = calcularCrescimentoAcumulado(preco);
        System.out.println("O crescimento nos 5 dias foi de: " + crescimento);
    }

    public static float calcularCrescimentoAcumulado(float [] preco) {
        float crescimento, dia1 = preco[0], dia2 = preco[4];

        crescimento = ((dia2 - dia1) / dia1) * 100;

        return crescimento;
    }
}
