package semana02.condicionais;

import java.util.Scanner;

public class AvaliacaoAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        System.out.print("Digite seu nivel de satisfação para o atendimento (0 até 5): ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 0 -> System.out.println("Atendimento pessimo!");

            case 1 -> System.out.println("Atendimento ruim!");

            case 2 -> System.out.println("Atendimento moderado!");

            case 3 -> System.out.println("Atendimento bom!");

            case 4 -> System.out.println("Atendimento ótimo!");

            case 5 -> System.out.println("Atendimento perfeito!");
        }
    }
}
