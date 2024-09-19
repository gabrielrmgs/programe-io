package io.programe.presenca.modelos;

import io.programe.presenca.genericos.EntidadeGenerica;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Escola extends EntidadeGenerica {
    
    @Id
    @SequenceGenerator(name = "seq_escola", sequenceName = "seq_escola")
    @GeneratedValue(generator = "seq_escola",strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    private Municipio municipio;
    @OneToMany
    private List<Curso> cursos;
}
