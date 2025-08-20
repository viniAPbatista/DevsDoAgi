package semana04.polimorfismo.overriding.ex02;

public class Main {
    public static void main(String[] args) {
        int i;

        Investimento[] valores = {
                new Investimento(100),
                new Poupanca(1000),
                new Cdb(10000)
        };

        for(i = 0; i < valores.length; i++) {
            System.out.println("Total: " + valores[i].calcularRendimento());
        }
    }
}
