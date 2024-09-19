package io.programe.presenca.manager;

import io.programe.presenca.enums.Materia;
import io.programe.presenca.modelos.Aluno;
import io.programe.presenca.servicos.AlunoServico;
import io.programe.presenca.utilitarios.Aviso;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.persistence.Enumerated;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
@Getter
@Setter
public class AlunoManager implements Serializable{
    
    @EJB
    AlunoServico alunoServico;    
    
    private Aluno aluno;
    private List<Aluno> alunos;
    
    @Enumerated
    private Materia materia;
    
    @PostConstruct
    public void instanciar() {
        aluno = new Aluno();
    }
    
    public void salvar() {
        alunoServico.salvar(aluno);
        aluno = new Aluno();
        Aviso.aviso("Aluno cadastrado com sucesso!");
    }
    
    public void pesquisar() {
        alunos = alunoServico.findAll();
    }
    
    public void remover() {
        aluno.setAtivo(Boolean.FALSE);
        alunoServico.getEntityManager().merge(aluno);
        alunoServico.getEntityManager().flush();
        aluno = new Aluno();
        Aviso.aviso("Aluno removido!");
    }
    
}
