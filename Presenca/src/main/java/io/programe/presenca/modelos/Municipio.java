package io.programe.presenca.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Municipio {
    
    @Id
    @SequenceGenerator(name = "seq_municipio", sequenceName = "seq_municipio")
    @GeneratedValue(generator = "seq_municipio", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    private GRE gre;
    private List<Escola> escolas;
}
