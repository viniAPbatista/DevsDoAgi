package semana04.encapsulamento.ex03;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito){
        if(limiteCredito >= 1000 && limiteCredito <= 100000) {
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void exibirCliente() {
        System.out.println("===== EXTRATO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Limite Credito: " + getLimiteCredito());
    }
}
