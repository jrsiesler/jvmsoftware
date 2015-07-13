package br.com.jvmsoftware.entities;
// Generated 12/Jul/2015 22:01:41 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SupSolicitacao generated by hbm2java
 */
public class SupSolicitacao  implements java.io.Serializable {


     private Integer idSolicitacao;
     private PubEmpresa pubEmpresa;
     private PubFuncionalidade pubFuncionalidade;
     private PubSistema pubSistema;
     private PubUsuario pubUsuario;
     private SupProjeto supProjeto;
     private WflSeveridade wflSeveridade;
     private WflSituacao wflSituacao;
     private Date dataHoraAbertura;
     private String titulo;
     private String descricao;
     private String detalhamento;

    public SupSolicitacao() {
    }

	
    public SupSolicitacao(PubEmpresa pubEmpresa, PubFuncionalidade pubFuncionalidade, PubSistema pubSistema, PubUsuario pubUsuario, SupProjeto supProjeto, WflSeveridade wflSeveridade, WflSituacao wflSituacao, Date dataHoraAbertura, String titulo, String descricao) {
        this.pubEmpresa = pubEmpresa;
        this.pubFuncionalidade = pubFuncionalidade;
        this.pubSistema = pubSistema;
        this.pubUsuario = pubUsuario;
        this.supProjeto = supProjeto;
        this.wflSeveridade = wflSeveridade;
        this.wflSituacao = wflSituacao;
        this.dataHoraAbertura = dataHoraAbertura;
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public SupSolicitacao(PubEmpresa pubEmpresa, PubFuncionalidade pubFuncionalidade, PubSistema pubSistema, PubUsuario pubUsuario, SupProjeto supProjeto, WflSeveridade wflSeveridade, WflSituacao wflSituacao, Date dataHoraAbertura, String titulo, String descricao, String detalhamento) {
       this.pubEmpresa = pubEmpresa;
       this.pubFuncionalidade = pubFuncionalidade;
       this.pubSistema = pubSistema;
       this.pubUsuario = pubUsuario;
       this.supProjeto = supProjeto;
       this.wflSeveridade = wflSeveridade;
       this.wflSituacao = wflSituacao;
       this.dataHoraAbertura = dataHoraAbertura;
       this.titulo = titulo;
       this.descricao = descricao;
       this.detalhamento = detalhamento;
    }
   
    public Integer getIdSolicitacao() {
        return this.idSolicitacao;
    }
    
    public void setIdSolicitacao(Integer idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }
    public PubEmpresa getPubEmpresa() {
        return this.pubEmpresa;
    }
    
    public void setPubEmpresa(PubEmpresa pubEmpresa) {
        this.pubEmpresa = pubEmpresa;
    }
    public PubFuncionalidade getPubFuncionalidade() {
        return this.pubFuncionalidade;
    }
    
    public void setPubFuncionalidade(PubFuncionalidade pubFuncionalidade) {
        this.pubFuncionalidade = pubFuncionalidade;
    }
    public PubSistema getPubSistema() {
        return this.pubSistema;
    }
    
    public void setPubSistema(PubSistema pubSistema) {
        this.pubSistema = pubSistema;
    }
    public PubUsuario getPubUsuario() {
        return this.pubUsuario;
    }
    
    public void setPubUsuario(PubUsuario pubUsuario) {
        this.pubUsuario = pubUsuario;
    }
    public SupProjeto getSupProjeto() {
        return this.supProjeto;
    }
    
    public void setSupProjeto(SupProjeto supProjeto) {
        this.supProjeto = supProjeto;
    }
    public WflSeveridade getWflSeveridade() {
        return this.wflSeveridade;
    }
    
    public void setWflSeveridade(WflSeveridade wflSeveridade) {
        this.wflSeveridade = wflSeveridade;
    }
    public WflSituacao getWflSituacao() {
        return this.wflSituacao;
    }
    
    public void setWflSituacao(WflSituacao wflSituacao) {
        this.wflSituacao = wflSituacao;
    }
    public Date getDataHoraAbertura() {
        return this.dataHoraAbertura;
    }
    
    public void setDataHoraAbertura(Date dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDetalhamento() {
        return this.detalhamento;
    }
    
    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }




}


