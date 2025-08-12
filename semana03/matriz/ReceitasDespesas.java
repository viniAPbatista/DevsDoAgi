package semana02.matriz;

import java.util.Scanner;

public class ReceitasDespesas {
    public static void main(String[] args) {
        float [][] receitas = new float [2][2];
        float soma;

        receitas = preencherMatriz();
        soma = somaMatriz(receitas);

        System.out.println("Soma: " + soma);
    }

    public static float[][] preencherMatriz() {
        int i, j;
        float [][] receitas = new float [2][2];

        Scanner sc = new Scanner(System.in);

        for(i = 0; i < 2; i++) {
            for(j= 0; j < 2; j++) {
                System.out.print("Digite o valor: ");
                receitas[i][j] = sc.nextFloat();
            }
        }
        return receitas;
    }

    public static float somaMatriz(float [][] receitas) {
        int i, j;
        float soma = 0;

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++) {
                soma = soma + receitas[i][j];
            }
        }
        return soma;
    }
}
