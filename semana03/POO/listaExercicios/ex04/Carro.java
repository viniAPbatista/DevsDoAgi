package semana03.POO.listaExercicios.ex04;

public class Carro {
    public String modelo;
    public double consumoPorKm;
    private double litros;

    public double calcularConsumo(double distancia) {
        litros = distancia / consumoPorKm;
        return litros;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Consumo por km: " + consumoPorKm);
        System.out.println("Litros necessarios: " + litros);
    }
}
