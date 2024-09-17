package io.programe.presenca.servicos;

import io.programe.presenca.genericos.ServicoGenerico;
import io.programe.presenca.modelos.Municipio;
import io.programe.presenca.projections.MunicipioProjecao;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.Tuple;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Stateless
public class MunicipioServico extends ServicoGenerico<Municipio>{

    public MunicipioServico() {
        super(Municipio.class);
    }
    
    public String todosNomesMunicipio() {
        Query sql = getEntityManager().createNativeQuery("SELECT nome FROM municipio m");
        return sql.getResultList().toString();
    }

    public List<String> buscarMunicipios() {
        List<String> nomesMun = null;
        Query sql = getEntityManager().createNativeQuery("SELECT m.nome as Nome, m.id as Id FROM municipio m");
        List<MunicipioProjecao> municipios = sql.getResultList();
        for (MunicipioProjecao mun : municipios) {
            nomesMun.add(mun.getNome());
        }
        return nomesMun;
    }

}
