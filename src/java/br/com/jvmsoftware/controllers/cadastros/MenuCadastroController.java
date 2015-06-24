/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jvmsoftware.controllers.cadastros;

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
public class MenuCadastroController {

    private PubUsuario usu = new PubUsuario();

    /**
     * Creates a new instance of MenuController
     */
    @PostConstruct 
    public void Init(){
        HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();  
        usu = (PubUsuario)request.getSession().getAttribute("usuario");
    } 
    
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
     * getters & setters
     * @return 
     */
    public PubUsuario getUsu() {
        return usu;
    }

    public void setUsu(PubUsuario usu) {
        this.usu = usu;
    }
    
}
