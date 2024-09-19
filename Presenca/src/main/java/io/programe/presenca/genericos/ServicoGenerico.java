package io.programe.presenca.genericos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class ServicoGenerico<T> {
    
    private Class<T> entidade;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    
    public ServicoGenerico(Class<T> entidade) {
        this.entidade = entidade;
    }
    
    public void salvar(T entidade) {
        entityManager.persist(entidade);
    }
    
    public void atualizar(T entidade) {
        entityManager.merge(entidade);
        entityManager.flush();
    }
    
    public List<T> findAll() {
        return entityManager.createQuery("SELECT e FROM "+ entidade.getName()+" e WHERE e.ativo = true").getResultList();
    }
    
}
