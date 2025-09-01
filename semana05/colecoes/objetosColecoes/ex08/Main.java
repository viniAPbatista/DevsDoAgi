package semana05.colecoes.objetosColecoes.ex08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, List<Hospede>> hospedes = new HashMap<>();

        adicionarHospedesQuarto("Vinicius", "001", 10, hospedes);
        adicionarHospedesQuarto("Eduarda", "0002", 10, hospedes);
        adicionarHospedesQuarto("Rafa", "003", 20, hospedes);
        adicionarHospedesQuarto("Forna", "004", 20, hospedes);
        adicionarHospedesQuarto("JP", "005", 30, hospedes);
        adicionarHospedesQuarto("Marina", "006", 30, hospedes);

        //teste mesmo id no mesmo quarto
        adicionarHospedesQuarto("MesmoID", "0002", 10, hospedes);

        exibirReservas(hospedes);
    }

    public static void adicionarHospedesQuarto(String nome, String id, Integer numeroQuarto,  Map<Integer, List<Hospede>> hospedes) {
        Hospede hospede = new Hospede(id, nome);
        hospede.adicionarHospedeQuarto(numeroQuarto, hospedes);
    }

    public static void exibirReservas(Map<Integer, List<Hospede>> hospedes) {
        for (Integer quarto : hospedes.keySet()) {
            System.out.println("Quarto " + quarto + ": " + hospedes.get(quarto));
        }
    }
}
