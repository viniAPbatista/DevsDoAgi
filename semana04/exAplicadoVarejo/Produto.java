package semana04.exAplicadoVarejo;

abstract class Produto implements IOperacoesProduto{
    private String codigo;
    private String nome;
    private double preco;
    private Cliente comprador;

    public Produto() {
        this.codigo = "";
        this.nome = "";
        this.preco = 0.0;
        this.comprador = null;
    }

    public Produto(String codigo, String nome, double preco, Cliente comprador) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.comprador = comprador;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public Cliente getComprador() {
        return this.comprador;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual);
    }

    @Override
    public void aumentarPreco(double percentual) {
        preco = preco + (preco * percentual);
    }

    public abstract void calcularFrete();
}
