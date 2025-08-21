package semana04.interfaces.ex02;

public class Main {
    public static void main(String[] args) {
        IDescontavel prodDesc1 = new ProdutoComum();
        IDescontavel prodDesc2 = new ProdutoPromocional();

        System.out.println("Desconto produto comum: " + prodDesc1.calcularPrecoFinal(200));
        System.out.println("Desconto produto Promocional: " + prodDesc2.calcularPrecoFinal(200));
    }
}
