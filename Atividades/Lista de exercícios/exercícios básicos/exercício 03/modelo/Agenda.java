import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;


    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void imprimirDados(){
        for (int i=0;i<contatos.size();i++) {
            System.out.println("Contato "+(i+1+":")+"\n"+"Nome -------- "+contatos.get(i).getNome()+
            "\n"+"Número -------- "+contatos.get(i).getNumero()+"\n");
        }
    }

}
