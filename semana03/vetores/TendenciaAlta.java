package semana02.vetores;

import java.util.Scanner;

public class TendenciaAlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] preco = new float [10];
        float [] trinca;
        float [] tendencia;
        float [] totalAltas;
        int i;

        for(i = 0; i < 10; i++) {
            System.out.printf("Digite o preco do dia %d: ", i + 1);
            preco[i] = sc.nextFloat();
        }

        trinca = primeiraTrincaAlta(preco);
        for(i = 0; i < trinca.length; i++) {
            if(trinca[i] != 0){
                System.out.println("Trinca alta: " + trinca[i]);
            }
        }

        tendencia = primeiraTendenciaAlta(preco);
        for(i = 0; i < tendencia.length; i++) {
            if (tendencia[i] != 0) {
                System.out.println("Tendencia alta: " + tendencia[i]);
            }
        }

        totalAltas = todasTendencias(preco);
        for(i = 0; i < totalAltas.length; i++) {
            if(totalAltas[i] != 0) {
                System.out.println("Todas altas: " + totalAltas[i]);
            }
        }
    }

    public static float[] primeiraTrincaAlta(float [] preco) {
        int i, contaAlta = 0;
        float [] trinca = new float [10];

        for(i = 1; i < 10; i++) {
            if(preco[i] > preco[i - 1]) {
                contaAlta++;
                trinca[i] = preco[i];
                if(contaAlta >= 3) {
                    return trinca;
                }
            }
            if(preco[i - 1] > preco[i]) {
                contaAlta = 0;
                trinca = new float[]{0,0,0,0,0,0,0,0,0,0,};
            }
        }
        return null;
    }

    public static float[] primeiraTendenciaAlta(float [] preco) {
        int i, contaTendencia = 0;
        float [] tendencia = new float [10];

        for(i = 1; i < 10; i++) {
            while(preco[i] > preco[i - 1]) {
                contaTendencia++;
                tendencia[i] = preco[i];
                i++;
            }

            if(contaTendencia >= 3) {
                return  tendencia;
            }
        }
        return null;
    }

    public static float[] todasTendencias(float [] preco) {
        int i, alta = 0;
        float [] altas = new float [10];
        float [] totalAltas = new float [30];

        for(i = 1; i < 10; i++) {
            if(preco[i] > preco[i - 1]) {
                alta++;
                altas[i] = preco[i];
            }

            if(alta >= 3) {
                totalAltas = altas;
            }
        }
        return totalAltas;
    }
}
