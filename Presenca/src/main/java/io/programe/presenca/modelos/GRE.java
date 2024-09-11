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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table
public class GRE {
    
    @Id
    @SequenceGenerator(name = "seq_GRE", sequenceName = "seq_GRE")
    @GeneratedValue(generator = "seq_GRE", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private int codigo;
    private String nome;
    private List<Municipio> municipios;
}
