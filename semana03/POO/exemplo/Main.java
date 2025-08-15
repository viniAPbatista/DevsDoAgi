package semana03.POO.exemplo;

public class Main {
    public static void main(String[] args) {
        //Cria objeto da classe Carro
        Carro meuCarro = new Carro();

        //exibe null pois a informacoes ainda não foram passadas
        meuCarro.mostrarInformacoes();

        //Passa informações para os atributos da classe
        meuCarro.marca = "Chevrolet";
        meuCarro.modelo = "Onix";
        meuCarro.ano = 2020;

        //Chama os metodos da classe
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.mostrarInformacoes();
    }
}
