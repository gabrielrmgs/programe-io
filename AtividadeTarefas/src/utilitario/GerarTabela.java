package utilitario;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class GerarTabela {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AtividadeTarefasPU");
        
        emf.close();
    }
}
