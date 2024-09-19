/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.manager;

import io.programe.presenca.modelos.Aluno;
import io.programe.presenca.modelos.Aula;
import io.programe.presenca.servicos.AlunoServico;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gabri
 */
@Named
@ViewScoped
@Getter
@Setter
public class indexView implements Serializable {
    
    @EJB
    AlunoServico alunoServico;
    
    private Aluno aluno;
    private List<Aluno> alunos;
    private Aula aula;
    private List<Aula> aulas;
    
    public void init() {
        aluno = new Aluno();
        aula = new Aula();
    }
    
}
