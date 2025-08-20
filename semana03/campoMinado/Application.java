package semana03.campoMinado;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhaSelecionada, linhas = 5;
        int colunaSelecionada, colunas = 5;
        int bombas = 4;
        int pontuacao = 0;
        boolean jogoContinua = true;
        char[][] campo = inicializarCampo(linhas, colunas);
        char[][] campoBombas = inicializarCampoBombas(linhas, colunas, bombas);

        exibirCampo(campo);

        while (jogoContinua) {
            System.out.print("selecione a linha: ");
            linhaSelecionada = sc.nextInt();
            System.out.print("selecione a coluna dessa linha: ");
            colunaSelecionada = sc.nextInt();

            if(campoBombas[linhaSelecionada][colunaSelecionada] == 'X') {
                jogoContinua = false;
                System.out.println("Voce explodiu!");
                System.out.println("Voce fez essa pontuacao: " + pontuacao);

                campo[linhaSelecionada][colunaSelecionada] = 'X';

            } else if (campo[linhaSelecionada][colunaSelecionada] == '#'){

                int bombasEncontradas = contarBombasAoRedor(linhaSelecionada, colunaSelecionada, campoBombas, colunas, linhas);

                campo[linhaSelecionada][colunaSelecionada] = Character.forDigit(bombasEncontradas, 10);
                pontuacao ++;

                if(pontuacao == (linhas * colunas) - bombas) {
                    jogoContinua = false;
                    System.out.println("Voce venceu!!");
                    System.out.println("voce fez essa pontuacao: " + pontuacao);
                }
            }

            exibirCampo(campo);
        }
    }

    private static int contarBombasAoRedor(int linhaSelecionada, int colunaSelecionada, char[][] campoBombas, int colunas, int linhas) {
        int bombasEncontradas = 0;

        //linha de cima
        if(linhaSelecionada > 0) {
            if (colunaSelecionada > 0 && campoBombas[linhaSelecionada - 1][colunaSelecionada - 1] == 'X') {
                bombasEncontradas++;
            }

            if (campoBombas[linhaSelecionada - 1][colunaSelecionada] == 'X') {
                bombasEncontradas++;
            }

            if ( colunaSelecionada < (colunas - 1) && campoBombas[linhaSelecionada - 1][colunaSelecionada + 1] == 'X') {
                bombasEncontradas++;
            }
        }

        //linha de baixo
        if(linhaSelecionada < linhas - 1) {
            if (colunaSelecionada > 0 && campoBombas[linhaSelecionada + 1][colunaSelecionada - 1] == 'X') {
                bombasEncontradas++;
            }

            if (campoBombas[linhaSelecionada + 1][colunaSelecionada] == 'X') {
                bombasEncontradas++;
            }

            if ( colunaSelecionada < (colunas - 1) && campoBombas[linhaSelecionada + 1][colunaSelecionada + 1] == 'X') {
                bombasEncontradas++;
            }
        }

        //linha atual
        if (colunaSelecionada > 0 && campoBombas[linhaSelecionada][colunaSelecionada - 1] == 'X') {
            bombasEncontradas++;
        }

        if ( colunaSelecionada < (colunas - 1) && campoBombas[linhaSelecionada][colunaSelecionada + 1] == 'X') {
            bombasEncontradas++;
        }
        return bombasEncontradas;
    }

    private static int pegarNumeroAleatorio(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    private static char[][] inicializarCampoBombas(int linhas, int colunas, int bombas) {
        int j, i;
        int bombasColocadas = 0;
        char[][] campo = new char[linhas][colunas];

        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                    campo[i][j] = 'N';
            }
        }

        while (bombasColocadas < bombas) {
            int linhaAleatoria = pegarNumeroAleatorio(0, linhas - 1);
            int colunaAleatoria = pegarNumeroAleatorio(0, colunas - 1);

            if(campo[linhaAleatoria][colunaAleatoria] == 'N') {
                campo[linhaAleatoria][colunaAleatoria] = 'X';
                bombasColocadas ++;
            }
        }

        return campo;
    }

    private static char[][] inicializarCampo(int linhas, int colunas) {
        int j, i;
        char[][] campo = new char[linhas][colunas];

        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                campo[i][j] = '#';
            }
        }
        return campo;
    }

    private static void exibirCampo(char[][] campo) {
        int i, j;

        for(i = 0; i < campo.length; i++) {
            for(j = 0; j < campo[0].length; j++) {
                System.out.print(campo[i][j]);
            }
            System.out.println();
        }
    }
}
