package semana02.vetores;

import java.util.Scanner;

public class DiasAlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] preco = new float [10];
        int i, diasAlta, diasBaixa;

        for(i = 0; i < 10; i++) {
            System.out.printf("Digite o valor da acao no dia %d: ", i + 1);
            preco[i] = sc.nextFloat();
        }

        diasAlta = contarDiasAlta(preco);
        System.out.println("Dias de alta: " + diasAlta);

        diasBaixa = contarDiasBaixa(preco);
        System.out.println("Dias de baixa: " + diasBaixa);
    }

    public static int contarDiasAlta(float [] preco) {
        int i, diasAlta = 0;

        for(i = 1; i < 10; i++) {
            if (preco[i] > preco[i - 1]) {
                diasAlta++;
            }
        }

        return diasAlta;
    }

    public static int contarDiasBaixa(float [] preco) {
        int i, diasBaixa = 0;

        for(i = 1; i < 10; i++) {
            if (preco[i] < preco[i - 1]) {
                diasBaixa++;
            }
        }

        return diasBaixa;
    }
}
