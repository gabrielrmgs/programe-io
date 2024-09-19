/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.modelos;

import io.programe.presenca.enums.Materia;
import io.programe.presenca.genericos.EntidadeGenerica;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
@Table
public class Aula extends EntidadeGenerica {
    
    @Id
    @SequenceGenerator(name = "seq_aula", sequenceName = "seq_aula")
    @GeneratedValue(generator = "seq_aula", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String materia;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Aluno> alunos;

    public Aula(String titulo) {
        this.titulo = titulo;
    }
    
    
}
