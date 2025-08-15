package semana03.POO.listaExercicios.ex04;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Onix";
        meuCarro.consumoPorKm = 10.0;

        meuCarro.calcularConsumo(100);
        meuCarro.exibirDados();
    }
}
