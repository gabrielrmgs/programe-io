package modelo;
import java.io.*;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "tab_atividade")
public class Atividade implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_atividade", sequenceName = "seq_atividade", initialValue = 1)
    @GeneratedValue(generator = "seq_atividade", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 200, nullable = true)
    private String nome;
    
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtividade;
    
    public Atividade(){
    }

    public Atividade(Long id, String nome, String descricao, Date dataAtividade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataAtividade = dataAtividade;
    }
    
    public Atividade(String nome, String descricao, Date data){
        this.nome = nome;
        this.descricao = descricao;
        this.dataAtividade = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.descricao);
        hash = 23 * hash + Objects.hashCode(this.dataAtividade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atividade other = (Atividade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.dataAtividade, other.dataAtividade);
    }

    @Override
    public String toString() {
        return "Atividade{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", dataAtividade=" + dataAtividade + '}';
    }
    
    
}
