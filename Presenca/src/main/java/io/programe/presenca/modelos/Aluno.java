package io.programe.presenca.modelos;

import io.programe.presenca.genericos.EntidadeGenerica;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class Aluno extends EntidadeGenerica {

    @Id
    @SequenceGenerator(name = "seq_aluno", sequenceName = "seq_aluno")
    @GeneratedValue(generator = "seq_aluno", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String matricula;
    private String nome;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Municipio municipio;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Escola escola;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Curso curso;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Aula> aulas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(String matricula, String nome, Municipio municipio, Escola escola, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.municipio = municipio;
        this.escola = escola;
        this.curso = curso;
    }
}
