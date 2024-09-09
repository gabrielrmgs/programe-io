public class Filme {

    private String nome;
    private Categorias categoria;
    private double normal = 4.0;

    public double calcularLocacao() {

        switch (categoria) {
            case LANCAMENTO:
                return normal + 3.0;
            case INFANTIL:
                return normal + 2.0;
            case PROMOCAO:
                return normal - 2.0;
            default:
                return normal;
        }
    }

    public Filme() {
    }

    public Filme(String nome, Categorias categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categorias getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public double getNormal() {
        return this.normal;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", normal='" + getNormal() + "'" +
            "}";
    }

}
