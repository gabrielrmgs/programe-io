package exemplo.crud;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Atividade;
import utilitario.DateUtil;
import utilitario.JpaUtil;

public class CadastrarAtividade {
    public static void main(String[] args) throws ParseException {
        
        Atividade atividade = new Atividade("Compras", "Realizar compras de frutas na internet", DateUtil.stringToDate("21/02/2012"));
        Atividade atividade2 = new Atividade("jogar", "jogar counter strike 2!!!!!", new Date());
        Atividade atividade3 = new Atividade("tarefa de casa", "fazer atividades de casa", new Date());
        Atividade atividade4 = new Atividade("ir ao médico", "realizar exames odontologicos no medico", new Date());
        Atividade atividade5 = new Atividade("fazer comida", "preparar o arroz", new Date());
        
        
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(atividade);
        atividades.add(atividade2);
        atividades.add(atividade3);
        atividades.add(atividade4);
        atividades.add(atividade5);
      
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        for(Atividade a : atividades){
            em.persist(a);
        }
        
        em.getTransaction().commit();
        
        JpaUtil.fecharConexao();
    }
}
