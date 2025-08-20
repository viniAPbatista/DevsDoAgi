package semana04.polimorfismo.overriding.ex04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> valor = new ArrayList<>();

        valor.add(new ContaBancaria("vini", 2000));
        valor.add(new ContaCorrente("joao", 500));
        valor.add(new ContaPoupanca("pedro", 1000));

        for(ContaBancaria i : valor){
            i.gerarRelatorio();
        }
    }
}
