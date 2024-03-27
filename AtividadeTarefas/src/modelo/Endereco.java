package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Endereco implements Serializable{
    @Id
    @SequenceGenerator(sequenceName = "seq_endereco", name = "seq_endereco", initialValue = 1)
    @GeneratedValue(generator = "seq_endereco", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String numero;
    private String bairro;
    private String logradouro;
    private String cidade;
    private String complemento;

    public Endereco() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.numero);
        hash = 59 * hash + Objects.hashCode(this.bairro);
        hash = 59 * hash + Objects.hashCode(this.logradouro);
        hash = 59 * hash + Objects.hashCode(this.cidade);
        hash = 59 * hash + Objects.hashCode(this.complemento);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
}
