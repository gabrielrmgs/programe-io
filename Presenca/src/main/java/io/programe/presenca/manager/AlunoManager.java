/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.manager;

import io.programe.presenca.modelos.Aluno;
import io.programe.presenca.servicos.AlunoServico;
import io.programe.presenca.utilitarios.Aviso;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
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
    
    @PostConstruct
    public void instanciar() {
        aluno = new Aluno();
    }
    
    public void salvar() {
        alunoServico.salvar(aluno);
        Aviso.aviso("Aluno cadastrado com sucesso!");
    }
}
