package io.programe.manager;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ManagerCliente implements Serializable{
    
    private String nome;
    
    public void acao(){
        FacesContext.getCurrentInstance().addMessage(nome, new FacesMessage(FacesMessage.SEVERITY_INFO, nome, nome));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  
}
