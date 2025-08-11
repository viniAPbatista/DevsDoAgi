package br.com.devsdoagi.semana02.lista01;

import java.util.Scanner;

public class Nota_final {
    public static void main(String[] args) {
        float media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a media do aluno: ");
        media = sc.nextFloat();

        if(media >= 6) {
            System.out.println("Aprovado!");
        }

        if(media < 6 && media >= 4) {
            System.out.println("Aluno de exame!");
        }

        if(media < 4){
            System.out.println("Aluno reprovado!");
        }
    }
}
