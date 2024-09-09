
public class Principal {
    
    public static void main(String[] args) {
        Filme filme1 = new Filme("Piratas do Caribe", Categorias.LANCAMENTO);
        Filme filme2 = new Filme("Carros 3", Categorias.INFANTIL);
        Filme filme3 = new Filme("Barbie", Categorias.PROMOCAO);

        System.out.println(filme1.calcularLocacao());
        System.out.println(filme2.calcularLocacao());
        System.out.println(filme3.calcularLocacao());

    }
}
