package io.programe.manager;

import io.programe.modelo.Atleta;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ManagerAtleta implements Serializable {
    
    private Atleta atleta;
    
    @PostConstruct
    public void iniciar() {
        this.atleta = new Atleta();
    }

    public void adicionar() {
        System.out.println(this.atleta.getNome());
    }
    
    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
    
}
