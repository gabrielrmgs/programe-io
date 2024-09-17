package io.programe.presenca.servicos;

import io.programe.presenca.genericos.ServicoGenerico;
import io.programe.presenca.modelos.Aluno;
import io.programe.presenca.utilitarios.Aviso;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AlunoServico extends ServicoGenerico<Aluno> {
    
    public AlunoServico() {
        super(Aluno.class);
    }
    
    public List<Aluno> findByName(String nome) {
        return getEntityManager().createQuery("SELECT c FROM cliente c WHERE c.nome like '"+ nome +"'").
                getResultList();
    }
}
