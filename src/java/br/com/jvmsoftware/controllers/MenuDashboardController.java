/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jvmsoftware.controllers;

import br.com.jvmsoftware.entities.PubUsuario;
import java.util.StringTokenizer;
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
    private String primeiroNome;

    /**
     * Creates a new instance of MenuController
     */
    @PostConstruct 
    public void Init(){
        HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();  
        usu = (PubUsuario)request.getSession().getAttribute("usuario");
        setNome();
    } 
    
    /**
     * item menu Home
     * @return 
     */
    public String dashboard() {
        return "/pages/dashboard";
    }

    /**
     * menu cadastros
     * @return 
     */
    public String index() {
        return "/pages/cadastro/index";
    }

    public String conta() {
        return "/pages/cadastro/user";
    }

    public String usuarios() {
        return "/pages/cadastro/usuarios";
    }
    
    public String empresa() {
        return "/pages/cadastro/empresa";
    }
    
    public String sistemas() {
        return "/pages/cadastro/sistemas";
    }

    
    /**
     * acesso aos modulos pelo dashboard
     * @return 
     */
    public String cadastros() {
        return "/pages/cadastro/index";
    }

    
    private void setNome() {
        StringTokenizer nome = new StringTokenizer(usu.getNomeUsuario()," ");
        primeiroNome = nome.nextToken();
    }
    
    
    /**
     * getters & setters
     * @return 
     */
    
    public PubUsuario getUsu() {
        return usu;
    }

    public void setUsu(PubUsuario usu) {
        this.usu = usu;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    
    
    
}
