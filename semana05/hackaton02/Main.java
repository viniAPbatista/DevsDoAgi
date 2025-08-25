//NOTAS
// 100 - Tudo correto, sem erros, código bem escrito, comentarios bem utilizados tb, show de bola

package semana05.hackaton02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qntInvestimentos;
        int tipoInvestimento;
        int i;
        double valorInvestimento;
        double retornoInvestimento;

        //solicita o tamanho do array e instancia com o tamanho solicitado
        System.out.print("Quantos investimentos voce deseja adicionar: ");
        qntInvestimentos = sc.nextInt();

        Investimento[] investimentos = new Investimento[qntInvestimentos];

        //solicita o tipo de investimento e cria o objeto relacionado ao tipo
        for(i = 0; i < qntInvestimentos; i++){
            System.out.println("===== ESCOLHA O TIPO DE INVESTIMENTO =====");
            System.out.println("1 - Renda Fixa");
            System.out.println("2 - Renda variavel");
            tipoInvestimento = sc.nextInt();

            //solicita o valor do investimento e passa utilizando o set
            if(tipoInvestimento == 1) {
                System.out.print("Qual o valor do investimento em Renda Fixa: ");
                valorInvestimento = sc.nextDouble();
                investimentos[i] = new RendaFixa();
                investimentos[i].setValorInicial(valorInvestimento);
            } else {
                System.out.print("Qual o valor do investimento em Renda Variavel: ");
                valorInvestimento = sc.nextDouble();
                investimentos[i] = new RendaVariavel();
                investimentos[i].setValorInicial(valorInvestimento);
            }
        }

        System.out.println("===== INVESTIMENTOS FINALIZADOS =====");
        System.out.println("===== RETORNO DOS INVESTIMENTOS =====");

        //percorre o arrat de objetos chamando o metodo calcularRendimento
        for(i = 0; i < qntInvestimentos; i++) {
            retornoInvestimento = investimentos[i].calcularRendimento();
            System.out.printf("Retorno investimento %d: %.2f \n", i + 1, retornoInvestimento);
        }
    }
}
