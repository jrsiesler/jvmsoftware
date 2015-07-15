package br.com.jvmsoftware.entities;
// Generated 14/Jul/2015 23:13:11 by Hibernate Tools 4.3.1



/**
 * PubConfigEmpresa generated by hbm2java
 */
public class PubConfigEmpresa  implements java.io.Serializable {


     private Integer idConfig;
     private PubEmpresa pubEmpresa;
     private int tipoEmpresa;
     private int tipoNegocio;
     private String mailEnvio;
     private String mailEnvioUsuario;
     private String mailEnvioSenha;
     private String mailEnvioSmtp;
     private Integer mailEnvioPorta;

    public PubConfigEmpresa() {
    }

	
    public PubConfigEmpresa(PubEmpresa pubEmpresa, int tipoEmpresa, int tipoNegocio) {
        this.pubEmpresa = pubEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.tipoNegocio = tipoNegocio;
    }
    public PubConfigEmpresa(PubEmpresa pubEmpresa, int tipoEmpresa, int tipoNegocio, String mailEnvio, String mailEnvioUsuario, String mailEnvioSenha, String mailEnvioSmtp, Integer mailEnvioPorta) {
       this.pubEmpresa = pubEmpresa;
       this.tipoEmpresa = tipoEmpresa;
       this.tipoNegocio = tipoNegocio;
       this.mailEnvio = mailEnvio;
       this.mailEnvioUsuario = mailEnvioUsuario;
       this.mailEnvioSenha = mailEnvioSenha;
       this.mailEnvioSmtp = mailEnvioSmtp;
       this.mailEnvioPorta = mailEnvioPorta;
    }
   
    public Integer getIdConfig() {
        return this.idConfig;
    }
    
    public void setIdConfig(Integer idConfig) {
        this.idConfig = idConfig;
    }
    public PubEmpresa getPubEmpresa() {
        return this.pubEmpresa;
    }
    
    public void setPubEmpresa(PubEmpresa pubEmpresa) {
        this.pubEmpresa = pubEmpresa;
    }
    public int getTipoEmpresa() {
        return this.tipoEmpresa;
    }
    
    public void setTipoEmpresa(int tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
    public int getTipoNegocio() {
        return this.tipoNegocio;
    }
    
    public void setTipoNegocio(int tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }
    public String getMailEnvio() {
        return this.mailEnvio;
    }
    
    public void setMailEnvio(String mailEnvio) {
        this.mailEnvio = mailEnvio;
    }
    public String getMailEnvioUsuario() {
        return this.mailEnvioUsuario;
    }
    
    public void setMailEnvioUsuario(String mailEnvioUsuario) {
        this.mailEnvioUsuario = mailEnvioUsuario;
    }
    public String getMailEnvioSenha() {
        return this.mailEnvioSenha;
    }
    
    public void setMailEnvioSenha(String mailEnvioSenha) {
        this.mailEnvioSenha = mailEnvioSenha;
    }
    public String getMailEnvioSmtp() {
        return this.mailEnvioSmtp;
    }
    
    public void setMailEnvioSmtp(String mailEnvioSmtp) {
        this.mailEnvioSmtp = mailEnvioSmtp;
    }
    public Integer getMailEnvioPorta() {
        return this.mailEnvioPorta;
    }
    
    public void setMailEnvioPorta(Integer mailEnvioPorta) {
        this.mailEnvioPorta = mailEnvioPorta;
    }




}


