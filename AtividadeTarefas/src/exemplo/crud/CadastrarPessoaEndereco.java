package exemplo.crud;

import javax.persistence.EntityManager;
import modelo.Endereco;
import modelo.Pessoa;
import utilitario.JpaUtil;

public class CadastrarPessoaEndereco {
    
    public static void main(String[] args) {
        
        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        
        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro Boa esperança");
        endereco.setCidade("Parnaíba");
        endereco.setComplemento("elizeu");
        endereco.setNumero("001");
        endereco.setLogradouro("Av. XX");
        
        Pessoa p = new Pessoa();
        p.setCpf("12345678900");
        p.setNome("Gabriel");
        p.setEndereco(endereco);
        em.persist(p);
        
        em.getTransaction().commit();
        
        JpaUtil.fecharConexao();
        
    }
}
