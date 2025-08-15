package semana03.POO.exemplo;

public class Carro {
    //não podem ser utilizados sem colocar o nome do objeto antes
    public String marca;
    public String modelo;
    public int ano;

    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    public void frear(){
        System.out.println("O carro está parando");
    }

    public void mostrarInformacoes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
