package semana03.POO.listaExercicios.ex05;

public class Main {
    public static void main(String[] args) {
        Funcionario func =  new Funcionario();

        func.nome = "Vinicius";
        func.salarioBruto = 1000;
        func.descontoIR = 0.075;
        func.descontoINSS = 0.11;

        func.exibirFolhaDePagamento();
    }
}
