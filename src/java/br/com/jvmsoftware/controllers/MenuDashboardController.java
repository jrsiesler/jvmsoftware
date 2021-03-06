/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jvmsoftware.controllers;

import br.com.jvmsoftware.entities.PubUsuario;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jose
 */
@ManagedBean
@SessionScoped
public class MenuDashboardController {

    private PubUsuario usu = new PubUsuario();

    /**
     * Creates a new instance of MenuController
     */
    @PostConstruct 
    public void Init(){
        HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();  
        usu = (PubUsuario)request.getSession().getAttribute("usuario");
    } 
    
    /**
     * item menu Home
     * @return 
     */
    public String dashboard() {
        return "/pages/dashboard.xhtml";
    }
    
    /**
     * submenu Sistemas
     * @return 
     */
    public String cadIndex() {
        return "/pages/cadastro/index.xhtml";
    }

    public PubUsuario getUsu() {
        return usu;
    }

    public void setUsu(PubUsuario usu) {
        this.usu = usu;
    }
    
    
    
    /**
     * getters & setters
     */
    
}
