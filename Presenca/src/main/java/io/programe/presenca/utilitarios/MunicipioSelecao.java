package io.programe.presenca.utilitarios;

import io.programe.presenca.servicos.MunicipioServico;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@RequestScoped
public class MunicipioSelecao {

    private String selectedOption;
    private String hideNoSelectOption;
    private String city;
    private Map<String, Integer> municipiosPiaui = new HashMap<>();
    private String option;
    private List<String> options;
    private String nome;
    private String[] listona;
    private int contador;
    
    @EJB
    MunicipioServico municipioServico;
    @PostConstruct
    public void init() {

        nome = municipioServico.todosNomesMunicipio().replaceAll("([\\[\\]])", "");
        listona = nome.split(",");
        contador = 1;
        municipiosPiaui = new HashMap<>();
        for (String a : listona) {
            municipiosPiaui.put(a, contador);
            contador += 1;
        }

        //options
        options = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            options.add("Option " + i);
        }
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public String getHideNoSelectOption() {
        return hideNoSelectOption;
    }

    public void setHideNoSelectOption(String hideNoSelectOption) {
        this.hideNoSelectOption = hideNoSelectOption;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Map<String, Integer> getMunicipiosPiaui() {
        return municipiosPiaui;
    }

    public void setMunicipiosPiaui(Map<String, Integer> cities) {
        this.municipiosPiaui = cities;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getListona() {
        return listona;
    }

    public void setListona(String[] listona) {
        this.listona = listona;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    

}
