package semana05.colecoes.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        Map<String, List<Double>> valores = new HashMap<>();
        String cpf;
        double valorParcela;
        double totalDevedor;

        cpf = "34514041840";

        valores.put(cpf, new ArrayList<>());

        valorParcela = 500;
        adicionarParcela(valores, cpf, valorParcela);

        valorParcela = 400;
        adicionarParcela(valores, cpf, valorParcela);

        valorParcela = 300;
        adicionarParcela(valores, cpf, valorParcela);

        totalDevedor = totalDevedor(valores, cpf);
        System.out.println("Total devedor: " + totalDevedor);

        exibir(valores);
    }

    public static void adicionarParcela(Map<String, List<Double>> valores, String cpf, double valorParcela) {
        valores.get(cpf).add(valorParcela);
    }

    public static double totalDevedor(Map<String, List<Double>> valores, String cpf) {
        double totalDevedor = 0;

        List<Double> listaValores = valores.get(cpf);

        for(double valor : listaValores) {
            totalDevedor += valor;
        }

        return totalDevedor;
    }

    public static void exibir(Map<String, List<Double>> valores) {
        System.out.println("clientes e devedores: " + valores);
    }
}
