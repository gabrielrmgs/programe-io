public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    
    public String valorFinal() {
        
        if (quantidade <= 10) {
            String total = String.valueOf(preco*quantidade);
            return nome+" ------> "+"Valor total: "+total;
        }
        if (quantidade > 10 && quantidade <= 20) {
            String total = String.valueOf(preco*quantidade*0.9);
            return nome+" ------> "+"Valor total: "+total;
        }
        if (quantidade > 20 && quantidade <= 50) {
            String total = String.valueOf(preco*quantidade*0.8);
            return nome+" ------> "+"Valor total: "+total;
        } else {
            String total = String.valueOf(preco*quantidade*0.75);
            return nome+" ------> "+"Valor total: "+total;
        }
    }
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            "}";
    }
}
