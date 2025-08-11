package br.com.devsdoagi.semana02.listaExMetodos;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] precos;
        float preco_atual;
        int qnt_precos, i, intervalo;

        System.out.println("Quantos preços voce deseja digitar ?");
        qnt_precos = sc.nextInt();

        precos = new float[qnt_precos];

        System.out.println("Digite o intervalo da média: ");
        intervalo = sc.nextInt();

        for(i = 0; i < qnt_precos; i++) {
            System.out.println("Digite um valor: ");
            preco_atual = sc.nextFloat();

            precos[i] = preco_atual;
        }

        calculaMedia(precos, intervalo);
    }

    public static void calculaMedia(float[] precos, int intervalo) {
        int i, j;
        float soma_intervalo;

        for(i = 0; i <= precos.length - intervalo; i++) {
            soma_intervalo = 0;
            for(j = i; j < intervalo + i; j++) {
                soma_intervalo = soma_intervalo + precos[j];
            }
            soma_intervalo = soma_intervalo / intervalo;
            System.out.println(soma_intervalo);
        }
    }
}