/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.servicos;

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

/**
 *
 * @author Gabri
 */
@Stateless
public class MunicipioServico {

    @PersistenceContext
    EntityManager em;

    public void salvar(Municipio municipio) {
        em.persist(municipio);
    }

    public String todosNomesMunicipio() {
        Query sql = em.createNativeQuery("SELECT nome FROM municipio m");
        return sql.getResultList().toString();
    }

    public List<String> buscarMunicipios() {
        List<String> nomesMun = null;
        Query sql = em.createNativeQuery("SELECT m.nome as Nome, m.id as Id FROM municipio m");
        List<MunicipioProjecao> municipios = sql.getResultList();
        for (MunicipioProjecao mun : municipios) {
            nomesMun.add(mun.getNome());
        }
        return nomesMun;
    }

}
