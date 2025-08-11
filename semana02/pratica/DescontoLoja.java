package semana02.pratica;

import java.util.Scanner;

public class DescontoLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valorProduto = 0, totalCompra = 0, precoPagar, opcao = 1;

        while(opcao != 0) {
            System.out.print("Digite o valor do produto (Digite 0 para sair): ");
            valorProduto = sc.nextFloat();

            opcao = valorProduto;

            totalCompra = totalCompra + valorProduto;
        }

        System.out.println("Valor total da compra(sem descntos): " + totalCompra);

        if (totalCompra < 300) {
            System.out.println("Valor insuficiente para descontos!");
            System.out.println("Total da compra: " + totalCompra);
        }

        if (totalCompra > 300 && totalCompra <= 500) {
            System.out.println("Desconto de 5% aprovado!");
            System.out.printf("Total da compra: %.2f", totalCompra - (totalCompra * 0.05));
        }

        if (totalCompra > 500 && totalCompra <= 1000) {
            System.out.println("Desconto de 10% aprovado!");
            System.out.printf("Total da compra: %.2f", totalCompra - (totalCompra * 0.1));
        }

        if (totalCompra > 1000) {
            System.out.println("Desconto de 12% aprovado!");
            System.out.printf("Total da compra: %.2f", totalCompra - (totalCompra * 0.12));
        }
    }
}
