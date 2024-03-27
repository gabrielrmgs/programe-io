package exemplo.crud;

import javax.persistence.EntityManager;
import modelo.Atividade;
import utilitario.JpaUtil;

public class AtualizarAtividade {
    
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Atividade atividade = em.find(Atividade.class, 53L);
        atividade.setDescricao("atualizado");
        System.out.println(atividade);
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
    }
}
