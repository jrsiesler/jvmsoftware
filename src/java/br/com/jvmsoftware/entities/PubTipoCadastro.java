package br.com.jvmsoftware.entities;
// Generated 4/Ago/2015 22:25:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PubTipoCadastro generated by hbm2java
 */
public class PubTipoCadastro  implements java.io.Serializable {


     private Integer idTipoCadastro;
     private String codigoTipoCadastro;
     private String descricaoTipoCadastro;
     private Set<CadPessoa> cadPessoas = new HashSet<CadPessoa>(0);
     private Set<PubEmpresa> pubEmpresas = new HashSet<PubEmpresa>(0);

    public PubTipoCadastro() {
    }

	
    public PubTipoCadastro(String codigoTipoCadastro, String descricaoTipoCadastro) {
        this.codigoTipoCadastro = codigoTipoCadastro;
        this.descricaoTipoCadastro = descricaoTipoCadastro;
    }
    public PubTipoCadastro(String codigoTipoCadastro, String descricaoTipoCadastro, Set<CadPessoa> cadPessoas, Set<PubEmpresa> pubEmpresas) {
       this.codigoTipoCadastro = codigoTipoCadastro;
       this.descricaoTipoCadastro = descricaoTipoCadastro;
       this.cadPessoas = cadPessoas;
       this.pubEmpresas = pubEmpresas;
    }
   
    public Integer getIdTipoCadastro() {
        return this.idTipoCadastro;
    }
    
    public void setIdTipoCadastro(Integer idTipoCadastro) {
        this.idTipoCadastro = idTipoCadastro;
    }
    public String getCodigoTipoCadastro() {
        return this.codigoTipoCadastro;
    }
    
    public void setCodigoTipoCadastro(String codigoTipoCadastro) {
        this.codigoTipoCadastro = codigoTipoCadastro;
    }
    public String getDescricaoTipoCadastro() {
        return this.descricaoTipoCadastro;
    }
    
    public void setDescricaoTipoCadastro(String descricaoTipoCadastro) {
        this.descricaoTipoCadastro = descricaoTipoCadastro;
    }
    public Set<CadPessoa> getCadPessoas() {
        return this.cadPessoas;
    }
    
    public void setCadPessoas(Set<CadPessoa> cadPessoas) {
        this.cadPessoas = cadPessoas;
    }
    public Set<PubEmpresa> getPubEmpresas() {
        return this.pubEmpresas;
    }
    
    public void setPubEmpresas(Set<PubEmpresa> pubEmpresas) {
        this.pubEmpresas = pubEmpresas;
    }




}


