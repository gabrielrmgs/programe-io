package exemplo.crud;

import javax.persistence.EntityManager;
import utilitario.JpaUtil;

public class CadastrarPessoaAtividade {

    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        
        em.getTransaction().begin();
        
        
        
        em.getTransaction().commit();
        JpaUtil.fecharConexao();
        
    }
    
}
