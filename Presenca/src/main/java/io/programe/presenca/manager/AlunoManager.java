package io.programe.presenca.manager;

import io.programe.presenca.modelos.Aluno;
import io.programe.presenca.servicos.AlunoServico;
import io.programe.presenca.utilitarios.Aviso;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
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
    
    @PostConstruct
    public void instanciar() {
        aluno = new Aluno();
    }
    
    public void salvar() {
        alunoServico.salvar(aluno);
        Aviso.aviso("Aluno cadastrado com sucesso!");
    }
    
    public void pesquisar() {
        alunos = alunoServico.findAll();
    }
    
}
