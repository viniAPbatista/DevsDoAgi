package semana06.hackatonInvestimento;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Investimento> investimentos;

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(String tipo, double valor) throws IllegalArgumentException{
        if (valor <= 0 ){
            throw new IllegalArgumentException("Investimento não autorizado");
        }
        investimentos.add(new Investimento(tipo, valor));

        System.out.println("Investimento finalizado com sucesso");
    }

    public double getTotalInvestimento(){
        if (investimentos.isEmpty()){
            System.out.println("Sem investimentos cadastrados");
            return 0;
        }
        else {
            Double soma = 0.0;
            for (Investimento investimento : investimentos) {
                soma += investimento.getValor();
            }
            return soma;
        }
    }


    @Override
    public String toString(){
        String paraString = "Nome: " + nome + "| CPF: "+ this.cpf + "|" + "E-mail: " + this.email;
        return paraString;
    }

    @Override
    public boolean equals(Object o){
        if (!o.equals(this.getClass())){
            return false;
        }
        else {
            Cliente objetoConvertido = (Cliente) o;
            return this.cpf.equals(objetoConvertido.cpf);
        }
    }
    @Override
    public int hashCode(){
        return this.cpf.hashCode();
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Investimento> getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos (ArrayList<Investimento> investimentos) {
        this.investimentos = investimentos;
    }
}
