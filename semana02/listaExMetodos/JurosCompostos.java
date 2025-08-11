package semana02.listaExMetodos;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float inicial, taxa, total;
        int meses;

        System.out.print("Digite o valor inicial: ");
        inicial = sc.nextFloat();

        System.out.print("Digite o valor da taxa: ");
        taxa = sc.nextFloat();

        System.out.print("Digite o tempo em meses: ");
        meses = sc.nextInt();

        total = calcularJurosCompostos(inicial, taxa, meses);

        System.out.println("Montante total: " + total);
    }

    public static float calcularJurosCompostos(float inicial, float taxa, int meses) {
        float juros;

        juros = inicial * (float) Math.pow((1 + taxa), meses);

        return juros;
    }
}
