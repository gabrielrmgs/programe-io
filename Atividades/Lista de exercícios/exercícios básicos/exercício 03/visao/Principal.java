public class Principal {
    public static void main(String[] args) {
        Contato contato1 = new Contato(TipoContato.CELULAR, "Gabriel", "(86) 9 8187-4507");
        Contato contato2 = new Contato(TipoContato.CELULAR, "Rafael", "(86) 9 9821-3322");
        Contato contato3 = new Contato(TipoContato.CELULAR, "Sales", "(86) 9 8899-3212");
        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        agenda.imprimirDados();
    }
}
