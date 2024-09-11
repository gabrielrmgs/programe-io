/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.servicos;

import io.programe.presenca.modelos.Aluno;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class AlunoServico {
    
    @PersistenceContext
    EntityManager em;
    
    public void salvar(Aluno aluno) {
        em.persist(aluno);
    }
}
