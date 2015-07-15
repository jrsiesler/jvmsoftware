package br.com.jvmsoftware.entities;
// Generated 14/Jul/2015 23:13:11 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * WflSeveridade generated by hbm2java
 */
public class WflSeveridade  implements java.io.Serializable {


     private Integer idSeveridade;
     private String codSeveridade;
     private String descricaoSeveridade;
     private Set<WflWorkflow> wflWorkflows = new HashSet<WflWorkflow>(0);
     private Set<WflWorkflowEvento> wflWorkflowEventosForSeveridadeAtual = new HashSet<WflWorkflowEvento>(0);
     private Set<WflWorkflowEvento> wflWorkflowEventosForSeveridadeAnterior = new HashSet<WflWorkflowEvento>(0);
     private Set<SupSolicitacao> supSolicitacaos = new HashSet<SupSolicitacao>(0);

    public WflSeveridade() {
    }

	
    public WflSeveridade(String codSeveridade) {
        this.codSeveridade = codSeveridade;
    }
    public WflSeveridade(String codSeveridade, String descricaoSeveridade, Set<WflWorkflow> wflWorkflows, Set<WflWorkflowEvento> wflWorkflowEventosForSeveridadeAtual, Set<WflWorkflowEvento> wflWorkflowEventosForSeveridadeAnterior, Set<SupSolicitacao> supSolicitacaos) {
       this.codSeveridade = codSeveridade;
       this.descricaoSeveridade = descricaoSeveridade;
       this.wflWorkflows = wflWorkflows;
       this.wflWorkflowEventosForSeveridadeAtual = wflWorkflowEventosForSeveridadeAtual;
       this.wflWorkflowEventosForSeveridadeAnterior = wflWorkflowEventosForSeveridadeAnterior;
       this.supSolicitacaos = supSolicitacaos;
    }
   
    public Integer getIdSeveridade() {
        return this.idSeveridade;
    }
    
    public void setIdSeveridade(Integer idSeveridade) {
        this.idSeveridade = idSeveridade;
    }
    public String getCodSeveridade() {
        return this.codSeveridade;
    }
    
    public void setCodSeveridade(String codSeveridade) {
        this.codSeveridade = codSeveridade;
    }
    public String getDescricaoSeveridade() {
        return this.descricaoSeveridade;
    }
    
    public void setDescricaoSeveridade(String descricaoSeveridade) {
        this.descricaoSeveridade = descricaoSeveridade;
    }
    public Set<WflWorkflow> getWflWorkflows() {
        return this.wflWorkflows;
    }
    
    public void setWflWorkflows(Set<WflWorkflow> wflWorkflows) {
        this.wflWorkflows = wflWorkflows;
    }
    public Set<WflWorkflowEvento> getWflWorkflowEventosForSeveridadeAtual() {
        return this.wflWorkflowEventosForSeveridadeAtual;
    }
    
    public void setWflWorkflowEventosForSeveridadeAtual(Set<WflWorkflowEvento> wflWorkflowEventosForSeveridadeAtual) {
        this.wflWorkflowEventosForSeveridadeAtual = wflWorkflowEventosForSeveridadeAtual;
    }
    public Set<WflWorkflowEvento> getWflWorkflowEventosForSeveridadeAnterior() {
        return this.wflWorkflowEventosForSeveridadeAnterior;
    }
    
    public void setWflWorkflowEventosForSeveridadeAnterior(Set<WflWorkflowEvento> wflWorkflowEventosForSeveridadeAnterior) {
        this.wflWorkflowEventosForSeveridadeAnterior = wflWorkflowEventosForSeveridadeAnterior;
    }
    public Set<SupSolicitacao> getSupSolicitacaos() {
        return this.supSolicitacaos;
    }
    
    public void setSupSolicitacaos(Set<SupSolicitacao> supSolicitacaos) {
        this.supSolicitacaos = supSolicitacaos;
    }




}


