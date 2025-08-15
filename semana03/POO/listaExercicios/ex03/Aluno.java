package semana03.POO.listaExercicios.ex03;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificaSituacao() {
        double media = calcularMedia();

        if(media >= 6){
            return "APROVADO";
        }

        if(media < 6 && media >= 5){
            return "RECUPERACAO";
        }

        if(media < 5){
            return "REPROVADO";
        }

        return null;
    }

    public void exibirRelatorio() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + calcularMedia());
        System.out.println("Situacao: " + verificaSituacao());
    }
}
