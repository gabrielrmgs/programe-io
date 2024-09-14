package io.programe.presenca.modelos;

import io.programe.presenca.genericos.EntidadeGenerica;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
@EqualsAndHashCode
@Entity
@Table
public class Curso extends EntidadeGenerica {
    
    @Id
    @SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso")
    @GeneratedValue(generator = "seq_curso", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    private Escola escola;
}
