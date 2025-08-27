package semana05.colecoes.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> historico = new ArrayList<>();
        String transacao;

        transacao = "12345678";
        registrarTransacoes(historico, transacao);

        transacao = "abcd";
        registrarTransacoes(historico, transacao);

        transacao = "qwerty";
        registrarTransacoes(historico, transacao);

        transacao = "12345678";
        if(buscarTransacao(historico, transacao)) {
            System.out.println("Transacao existente!");
        } else {
            System.out.println("Transacao naõ existe!");
        }

        System.out.println("===== EXIBIR =====");
        exibirHistorico(historico);
    }

    public static void registrarTransacoes(List<String> historico, String transacao) {
        historico.add(transacao);
    }

    public static boolean buscarTransacao(List<String> historico, String transacao) {
        return historico.contains(transacao);
    }

    public static void exibirHistorico(List<String> historico) {
        System.out.println(historico);
    }
}
