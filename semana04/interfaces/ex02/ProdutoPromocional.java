package semana04.interfaces.ex02;

public class ProdutoPromocional implements IDescontavel{

    @Override
    public double calcularPrecoFinal(double precoBase) {
        return precoBase * 0.8;
    }
}
