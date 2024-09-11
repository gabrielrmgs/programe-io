/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.programe.presenca.utilitarios;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author Gabri
 */
public class Aviso {

    public static void aviso(String aviso) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(aviso));
    }

}
