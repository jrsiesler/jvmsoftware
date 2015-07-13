package br.com.jvmsoftware.entities;
// Generated 12/Jul/2015 22:01:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PubSistema generated by hbm2java
 */
public class PubSistema  implements java.io.Serializable {


     private Integer idSistema;
     private String nomeSistema;
     private String descricaoSistema;
     private String imagemSistema;
     private boolean ativo;
     private Set<PubMenu> pubMenus = new HashSet<PubMenu>(0);
     private Set<SupSolicitacao> supSolicitacaos = new HashSet<SupSolicitacao>(0);
     private Set<WflWorkflow> wflWorkflows = new HashSet<WflWorkflow>(0);
     private Set<CtrLog> ctrLogs = new HashSet<CtrLog>(0);
     private Set<AcsEmpresaSistema> acsEmpresaSistemas = new HashSet<AcsEmpresaSistema>(0);
     private Set<AcsUsuarioSistema> acsUsuarioSistemas = new HashSet<AcsUsuarioSistema>(0);
     private Set<WflSituacao> wflSituacaos = new HashSet<WflSituacao>(0);

    public PubSistema() {
    }

	
    public PubSistema(String nomeSistema, String descricaoSistema, boolean ativo) {
        this.nomeSistema = nomeSistema;
        this.descricaoSistema = descricaoSistema;
        this.ativo = ativo;
    }
    public PubSistema(String nomeSistema, String descricaoSistema, String imagemSistema, boolean ativo, Set<PubMenu> pubMenus, Set<SupSolicitacao> supSolicitacaos, Set<WflWorkflow> wflWorkflows, Set<CtrLog> ctrLogs, Set<AcsEmpresaSistema> acsEmpresaSistemas, Set<AcsUsuarioSistema> acsUsuarioSistemas, Set<WflSituacao> wflSituacaos) {
       this.nomeSistema = nomeSistema;
       this.descricaoSistema = descricaoSistema;
       this.imagemSistema = imagemSistema;
       this.ativo = ativo;
       this.pubMenus = pubMenus;
       this.supSolicitacaos = supSolicitacaos;
       this.wflWorkflows = wflWorkflows;
       this.ctrLogs = ctrLogs;
       this.acsEmpresaSistemas = acsEmpresaSistemas;
       this.acsUsuarioSistemas = acsUsuarioSistemas;
       this.wflSituacaos = wflSituacaos;
    }
   
    public Integer getIdSistema() {
        return this.idSistema;
    }
    
    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }
    public String getNomeSistema() {
        return this.nomeSistema;
    }
    
    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }
    public String getDescricaoSistema() {
        return this.descricaoSistema;
    }
    
    public void setDescricaoSistema(String descricaoSistema) {
        this.descricaoSistema = descricaoSistema;
    }
    public String getImagemSistema() {
        return this.imagemSistema;
    }
    
    public void setImagemSistema(String imagemSistema) {
        this.imagemSistema = imagemSistema;
    }
    public boolean isAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public Set<PubMenu> getPubMenus() {
        return this.pubMenus;
    }
    
    public void setPubMenus(Set<PubMenu> pubMenus) {
        this.pubMenus = pubMenus;
    }
    public Set<SupSolicitacao> getSupSolicitacaos() {
        return this.supSolicitacaos;
    }
    
    public void setSupSolicitacaos(Set<SupSolicitacao> supSolicitacaos) {
        this.supSolicitacaos = supSolicitacaos;
    }
    public Set<WflWorkflow> getWflWorkflows() {
        return this.wflWorkflows;
    }
    
    public void setWflWorkflows(Set<WflWorkflow> wflWorkflows) {
        this.wflWorkflows = wflWorkflows;
    }
    public Set<CtrLog> getCtrLogs() {
        return this.ctrLogs;
    }
    
    public void setCtrLogs(Set<CtrLog> ctrLogs) {
        this.ctrLogs = ctrLogs;
    }
    public Set<AcsEmpresaSistema> getAcsEmpresaSistemas() {
        return this.acsEmpresaSistemas;
    }
    
    public void setAcsEmpresaSistemas(Set<AcsEmpresaSistema> acsEmpresaSistemas) {
        this.acsEmpresaSistemas = acsEmpresaSistemas;
    }
    public Set<AcsUsuarioSistema> getAcsUsuarioSistemas() {
        return this.acsUsuarioSistemas;
    }
    
    public void setAcsUsuarioSistemas(Set<AcsUsuarioSistema> acsUsuarioSistemas) {
        this.acsUsuarioSistemas = acsUsuarioSistemas;
    }
    public Set<WflSituacao> getWflSituacaos() {
        return this.wflSituacaos;
    }
    
    public void setWflSituacaos(Set<WflSituacao> wflSituacaos) {
        this.wflSituacaos = wflSituacaos;
    }




}


