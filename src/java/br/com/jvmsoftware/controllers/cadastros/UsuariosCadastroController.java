/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jvmsoftware.controllers.cadastros;

import br.com.jvmsoftware.daos.PubEmpresaDAO;
import br.com.jvmsoftware.daos.PubUsuarioDAO;
import br.com.jvmsoftware.entities.PubEmpresa;
import br.com.jvmsoftware.entities.PubUsuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jose
 */
@ManagedBean
@ViewScoped
public class UsuariosCadastroController {
    
    private PubEmpresaDAO empDAO = new PubEmpresaDAO();
    private PubUsuarioDAO usuDAO = new PubUsuarioDAO();
    private PubUsuario usu = new PubUsuario();
    private List<PubEmpresa> listEmpresas;
    private List<PubUsuario> listUsuarios;
    private boolean renderEmpresa = false;
    private int empresa = 0;
    
    /**
     * Creates a new instance of UsuariosCadastroController
     */
    public UsuariosCadastroController() {
    }
    
    @PostConstruct 
    public void Init() {
        HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();  
        usu = (PubUsuario)request.getSession().getAttribute("usuario");
        renderEmpresa = renderEmpresa();
        try {
            listEmpresas = empDAO.listAllEmpresas();
            listUsuarios = usuDAO.listUsuariosByEmpresa(usu.getPubEmpresa());
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // change tipo de cadastro
    public void changeEmpresa() throws SQLException {
        if (empresa == 0) {
            listUsuarios = usuDAO.listUsuariosByEmpresa(usu.getPubEmpresa());
        } else {
            listUsuarios = usuDAO.listUsuariosByEmpresa(empDAO.getById(empresa));
        }
    }

    
    private boolean renderEmpresa() {
        boolean rend = false;
        if (usu.getPubEmpresa().getIdEmpresa() == 1) {
            rend = true;
        }
        return rend;
    }

    
    /**getters & setters
     * 
     * @return 
     */
    public List<PubEmpresa> getListEmpresas() {
        return listEmpresas;
    }

    public void setListEmpresas(List<PubEmpresa> listEmpresas) {
        this.listEmpresas = listEmpresas;
    }

    public PubUsuario getUsu() {
        return usu;
    }

    public void setUsu(PubUsuario usu) {
        this.usu = usu;
    }

    public boolean isRenderEmpresa() {
        return renderEmpresa;
    }

    public void setRenderEmpresa(boolean renderEmpresa) {
        this.renderEmpresa = renderEmpresa;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public List<PubUsuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<PubUsuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    
}
