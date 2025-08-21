package semana04.classeAbstrata.ex02;

public class CartaoCredito extends Cartao{
    public CartaoCredito(){
        super();
    }

    public CartaoCredito(String numero, double limite){
        super(numero, limite);
    }

    public void processarCompra(double valor){
        double limite, limiteAtualizado;

        limite = getLimite();

        limiteAtualizado = limite - valor;

        setLimite(limiteAtualizado);
    }
}
