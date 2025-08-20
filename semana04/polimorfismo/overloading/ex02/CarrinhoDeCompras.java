package semana04.polimorfismo.overloading.ex02;

public class CarrinhoDeCompras {
    public double somaTotal(double preco1, double preco2) {
        return preco1 + preco2;
    }

    public double somaTotal(double preco1, double preco2, double desconto) {
        return preco1 + preco2 - ((preco1 + preco2) * desconto);
    }

    public double somaTotal(double...precos) {
        double soma = 0;

        for(double p : precos) {
            soma = soma + p;
        }

        return soma;
    }
}
