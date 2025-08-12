package semana02.matriz;

import java.util.Scanner;

public class DividasMensais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] dividas = new float [3][4];
        float maiorValor;
        int i, j;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print("Digite um valor: ");
                dividas[i][j] = sc.nextFloat();
            }
        }

        maiorValor = encontrarMaiorValor(dividas);
        System.out.println("Maior valor: " + maiorValor);
    }

    public static float encontrarMaiorValor(float [][] dividas) {
        int i, j;
        float maiorValor = dividas[0][0];

        for (i = 0; i < 3; i++){
            for(j = 0; j < 4; j++) {
                if(dividas[i][j] > maiorValor) {
                    maiorValor = dividas[i][j];
                }
            }
        }
        return maiorValor;
    }
}
