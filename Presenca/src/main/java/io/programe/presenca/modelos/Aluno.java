package io.programe.presenca.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;
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
@EqualsAndHashCode
public class Aluno implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_aluno", sequenceName = "seq_aluno")
    @GeneratedValue(generator = "seq_aluno", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String matricula;
    private String nome;
    private Municipio municipio;
    private Escola escola;
    private Curso curso;

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
