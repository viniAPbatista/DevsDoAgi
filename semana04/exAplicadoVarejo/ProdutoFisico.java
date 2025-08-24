package semana04.exAplicadoVarejo;

public class ProdutoFisico extends Produto{
    @Override
    public void calcularFrete() {
        System.out.println("Valor do frete: R$ 20.00");
    }
}
