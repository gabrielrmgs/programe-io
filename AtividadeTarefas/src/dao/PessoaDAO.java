package dao;
import java.util.List;
import javax.persistence.EntityManager;
import modelo.Pessoa;
import utilitario.JpaUtil;

public class PessoaDAO {

    public void salvar(Pessoa pessoa){
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
    }
    
    public Pessoa consultar(Long id){
        
        EntityManager em = JpaUtil.conexao();
        return em.find(Pessoa.class, id);
    }
    
    public void atualizar(Pessoa pessoa){
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        em.merge(pessoa);
        em.flush();
        em.getTransaction().commit();
    }
    
    public List<Pessoa> todosRegistros(){
        
        EntityManager em = JpaUtil.conexao();
        return em.createQuery("select a from Pessoa a").getResultList();
    }
}
