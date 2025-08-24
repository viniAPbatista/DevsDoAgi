package semana04.exAplicadoVarejo;

public class ProdutoDigital extends Produto{
    @Override
    public void calcularFrete() {
        System.out.println("O produto selecionado não possui frete!");
    }
}
