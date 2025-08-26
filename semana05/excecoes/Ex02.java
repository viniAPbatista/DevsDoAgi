package semana05.excecoes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] precos;
        double mediaMovel;
        int qntValores;
        int i;

        try {
            System.out.println("Quantos valores deseja digitar: ");
            qntValores = Integer.parseInt(sc.nextLine());
            precos = new double[qntValores];

            if(qntValores < 3) {
                throw new IllegalArgumentException("ERRO! É necessario no minimo 3 valores!");
            }

            for(i = 0; i < precos.length; i++) {
                System.out.printf("Digite o valor do dia %d: ", i + 1);
                precos[i] = Double.parseDouble(sc.nextLine());
            }

            for(i = 2; i < precos.length; i++) {
                mediaMovel = (precos[i] + precos[i - 1] + precos[i - 2]) / 3;
                System.out.printf("Media movel dia %d: %f", i + 1, mediaMovel);
                mediaMovel = 0;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

//        }catch (NumberFormatException e) {
//            System.out.println("ERRO! Valor informado nao e valido!");
//        }
    }
}
