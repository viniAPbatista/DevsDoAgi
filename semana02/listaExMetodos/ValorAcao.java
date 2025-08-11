package br.com.devsdoagi.semana02.listaExMetodos;

import java.util.Scanner;

public class ValorAcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float dia1, dia2, variacao;

        System.out.print("Digite o primeiro valor da ação: ");
        dia1 = sc.nextFloat();

        System.out.print("Digite o segundo dia da ação: ");
        dia2 = sc.nextFloat();

        variacao = calcularCrescimento(dia1, dia2);

        if(variacao < 0) {
            System.out.printf("Acao caiu %.2f %%", variacao);
        }

        if(variacao > 0) {
            System.out.printf("Acao subiu %.2f %%", variacao);
        }

        if(variacao == 0) {
            System.out.print("Não ocorreu variacao");
        }
    }

    public static float calcularCrescimento(float dia1, float dia2) {
        if(dia1 > dia2) {
            return -(dia1 / dia2 - 1) * 100;
        }
        else{
            return (dia2 / dia1 - 1) * 100;
        }
    }
}
