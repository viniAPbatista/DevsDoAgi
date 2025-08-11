package semana02.vetores;

import java.util.Scanner;

public class MaiorMenorAcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] precos = new float [10];
        float maiorPreco, menorPreco;
        int i;

        for(i = 0; i < precos.length; i++) {
            System.out.printf("Digite o valor do dia %d: ", i + 1);
            precos[i] = sc.nextInt();
        }

        maiorPreco = maiorPreco(precos);
        menorPreco = menorPreco(precos);

        System.out.println("Maior preco: " + maiorPreco);
        System.out.println("Menor preco: " + menorPreco);
    }

    public  static float maiorPreco(float[] precos) {
        float maiorPreco = precos[0];
        int i;

        for(i = 0; i < precos.length; i++) {
            if(maiorPreco < precos[i]) {
                maiorPreco = precos[i];
            }
        }

        return maiorPreco;
    }

    public  static float menorPreco(float[] precos) {
        float menorPreco = precos[0];
        int i;

        for(i = 0; i < precos.length; i++) {
            if(menorPreco > precos[i]) {
                menorPreco = precos[i];
            }
        }

        return menorPreco;
    }
}
