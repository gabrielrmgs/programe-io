public class Principal {
    public static void main(String[] args) {
        Contato contato1 = new Contato(TipoContato.CELULAR, "(86) 9 8187-4507");
        System.out.println(contato1.mostrarContato());
    }
}
