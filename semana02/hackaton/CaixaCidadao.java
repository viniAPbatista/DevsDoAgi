package semana02.hackaton;

import java.util.Scanner;

public class CaixaCidadao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO AO CAIXA AGI");

        int opcao = 1;
        float saque, saldo;
        int  mes = 1;
        float divida, pagamentoMes;
        float meta, economiaMes, tempoMeta;

        System.out.print("Digite seu saldo: ");
        saldo = sc.nextInt();

        while(saldo <= 0) {
            System.out.println("Valor invalido! Tente novamente.");
            System.out.print("Digite seu saldo: ");
            saldo = sc.nextInt();
        }

        while(opcao != 4) {
            System.out.println("========================================");
            System.out.println("Selecione a operação que deseja realizar: ");
            System.out.println("1 - SAQUE");
            System.out.println("2 - PAGAMENTO DIVIDA");
            System.out.println("3 - META ECONOMIA");
            System.out.println("4 - FINALIZAR");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("========================================");
                    System.out.println("Opção selecionada: SAQUE");
                    System.out.print("Digite quanto deseja sacar: ");
                    saque = sc.nextFloat();

                    while(saque <= 0) {
                        System.out.println("Valor invalido! Tente novamente.");
                        System.out.print("Digite quanto deseja sacar: ");
                        saque = sc.nextFloat();
                    }

                    while(saque > saldo) {
                        System.out.println("Saldo insuficiente! Tente novamente.");
                        System.out.print("Digite quanto deseja sacar: ");
                        saque = sc.nextFloat();
                    }

                    if(saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saque ralizado!");
                        System.out.println("Saldo atualizado: " + saldo);
                    }
                }

                case 2 -> {
                    System.out.println("========================================");
                    System.out.println("Opção selecionada: PAGAMENTO DIVIDA");
                    System.out.print("Informe o valor da divida: ");
                    divida = sc.nextFloat();

                    while(divida <= 0){
                        System.out.println("Valor invalido! Tente novamente.");
                        System.out.print("Informe o valor da divida: ");
                        divida = sc.nextFloat();
                    }

                    while(divida > 0) {
                        System.out.printf("Quanto deseja pagar no mes %d : ", mes);
                        pagamentoMes = sc.nextFloat();

                        while(pagamentoMes > saldo) {
                            System.out.println("Saldo insuficiente! Tente novamente.");
                            System.out.printf("Quanto deseja pagar no mes %d : ", mes);
                            pagamentoMes = sc.nextFloat();
                        }

                        while(pagamentoMes <= 0) {
                            System.out.println("Valor invalido! Tente novamente.");
                            System.out.printf("Quanto deseja pagar no mes %d : ", mes);
                            pagamentoMes = sc.nextFloat();
                        }

                        while(pagamentoMes > divida) {
                            System.out.println("Pagamento maior que a divida! Tente novamente.");
                            System.out.printf("Quanto deseja pagar no mes %d : ", mes);
                            pagamentoMes = sc.nextFloat();
                        }

                        saldo = saldo - pagamentoMes;
                        System.out.println("Pagamento realiazdo!");
                        divida = divida - pagamentoMes;
                        System.out.println("Divida atualizada: " + divida);
                        System.out.println("Saldo atualizado: " + saldo);
                        mes++;
                    }
                }

                case 3 -> {
                    System.out.println("========================================");
                    System.out.println("Opção selecionada: META ECONOMIA");
                    System.out.print("Digite sua meta: ");
                    meta = sc.nextFloat();

                    while(meta <= 0) {
                        System.out.println("Valor invalido! Tente novamente.");
                        System.out.print("Digite sua meta: ");
                        meta = sc.nextFloat();
                    }

                    System.out.print("Quanto voce consegue guardar por mes: ");
                    economiaMes = sc.nextFloat();

                    while (economiaMes <= 0) {
                        System.out.println("Valor invalido! Tente novamente.");
                        System.out.print("Quanto voce consegue guardar por mes: ");
                        economiaMes = sc.nextFloat();
                    }

                    tempoMeta = meta / economiaMes;

                    System.out.println("Meses: " + (int) Math.ceil(tempoMeta));
                }

                case 4 -> {
                    System.out.println("========================================");
                    System.out.println("Opção selecionada: FINALIZAR");
                }

                default -> {
                    System.out.println("========================================");
                    System.out.println("Opcao invalida! Tente novamente!");
                }
            }
        }
    }
}
