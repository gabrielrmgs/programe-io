/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.genericos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gabri
 */
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
    }
    
    public void remover (T entidade) {
        
    }
    
    public List<T> findAll() {
        return entityManager.createQuery("SELECT e FROM "+ entidade.getName()+" e").getResultList();
    }
    
}
