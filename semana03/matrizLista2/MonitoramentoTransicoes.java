package semana03.matrizLista2;

import java.util.Scanner;

public class MonitoramentoTransicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [][] trasacoes;
        boolean [][] suspeitas;
        int i, j, clientes, dias;

        System.out.print("Digite o numero de clientes: ");
        clientes = sc.nextInt();

        System.out.print("Digite o numero de dias: ");
        dias = sc.nextInt();

        trasacoes = new float[clientes][dias];

        for(i = 0; i < trasacoes.length; i++){
            for(j = 0; j < trasacoes[0].length; j++){
                System.out.printf("Digite a transacao do cliente %d no dia %d: ", i + 1, j + 1);
                trasacoes[i][j] = sc.nextFloat();
            }
        }
        suspeitas = trasacoesSuspeitas(trasacoes);
        for(i = 0; i < suspeitas.length; i++){
            for(j = 0; j < suspeitas[0].length; j++){
                System.out.printf("%b      ", suspeitas[i][j]);
            }
            System.out.print("\n");
        }

        exibirTransacoesSuspeitas(trasacoes);
    }

    public static boolean[][] trasacoesSuspeitas(float [][] transacoes) {
        int i, j;
        boolean[][] suspeitas = new boolean[transacoes.length][transacoes[0].length];

        for(i = 0; i < transacoes.length; i++){
            for(j = 0; j < transacoes[0].length; j++){
                if(transacoes[i][j] > 10000){
                    suspeitas[i][j] = true;
                }else{
                    suspeitas[i][j] = false;
                }
            }
        }

        return suspeitas;
    }

    public static void exibirTransacoesSuspeitas(float [][] transacoes) {
        int i, j;

        for(i = 0; i < transacoes.length; i++){
            for(j = 0; j < transacoes[0].length; j++){
                if(transacoes[i][j] > 10000){
                    System.out.printf("Cliente: %d - Dia: %d - Valor: %.2f \n", i + 1, j + 1, transacoes[i][j]);
                }
            }
        }
    }
}
