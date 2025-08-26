package semana05.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        double mediaMovel;
        int qntValores;
        int i;
        double[] preco;

        try {
            System.out.print("Digite a quantidade de valores que deseja exibir: ");
            qntValores = sc.nextInt();

            preco = new double[qntValores];

            if(preco.length < 3) {
                throw new IllegalArgumentException("ERRO! Inserir no minimo 3 valores!");
            }

            for(i = 0; i < preco.length; i++) {
                System.out.printf("Digite o valor do dia %d: ", i + 1);
                preco[i] = sc.nextDouble();
            }

            for(i = 2; i < preco.length; i++) {
                mediaMovel = (preco[i] + preco[i - 1] + preco[i - 2]) / 3;
                System.out.printf("Media movel dia %d: %.2f \n", i + 1, mediaMovel);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }catch (InputMismatchException e) {
            System.out.println("ERRO! Digite apenas valores double!");
        }
    }
}
