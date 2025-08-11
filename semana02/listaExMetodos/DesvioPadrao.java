package semana02.listaExMetodos;

import java.util.Scanner;

public class DesvioPadrao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] retornosDiarios;
        float retornos, desvioPadrao;
        int qntRetornos, i;

        System.out.print("Quantos retornos voce deseja digitar: ");
        qntRetornos = sc.nextInt();

        retornosDiarios = new float[qntRetornos];

        for(i = 0; i < retornosDiarios.length; i++) {
            System.out.print("Digite um retorno: ");
            retornos = sc.nextFloat();

            retornosDiarios[i] = retornos;
        }

        desvioPadrao = desvioPadrao(retornosDiarios);

        System.out.println("Desvio padrão: " + desvioPadrao);
    }

    public static float desvioPadrao(float[] retornos) {
        float desvioPadrao, media, somaRetornos = 0, somaRetornoMedia = 0, somaDivMedia = 0;
        int i;

        for(i = 0; i < retornos.length; i++) {
            somaRetornos = somaRetornos + retornos[i];
        }
        media = somaRetornos / retornos.length;
        System.out.println("Media = " + media);

        for(i = 0; i < retornos.length; i++) {
            System.out.printf("Retorno - media: %f \n", (retornos[i] - media));
            somaRetornoMedia = somaRetornoMedia + (float) Math.pow((retornos[i] - media), 2);
            System.out.println(somaRetornoMedia);
        }
        somaDivMedia = somaRetornoMedia / retornos.length;
        System.out.println(somaDivMedia);

        desvioPadrao = (float) Math.sqrt(somaDivMedia);

        return desvioPadrao;
    }
}
