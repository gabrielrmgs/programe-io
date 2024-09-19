package io.programe.presenca.servicos;

import io.programe.presenca.genericos.ServicoGenerico;
import io.programe.presenca.modelos.Aluno;
import jakarta.ejb.Stateless;
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
