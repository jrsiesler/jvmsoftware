package br.com.jvmsoftware.entities;
// Generated 4/Jun/2015 10:42:36 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PubMenu generated by hbm2java
 */
public class PubMenu  implements java.io.Serializable {


     private Integer idMenu;
     private PubMenu pubMenu;
     private PubSistema pubSistema;
     private String menu;
     private String descricao;
     private String caminho;
     private String icone;
     private Set<PubConteudo> pubConteudos = new HashSet<PubConteudo>(0);
     private Set<PubMenu> pubMenus = new HashSet<PubMenu>(0);

    public PubMenu() {
    }

	
    public PubMenu(PubSistema pubSistema, String menu, String descricao) {
        this.pubSistema = pubSistema;
        this.menu = menu;
        this.descricao = descricao;
    }
    public PubMenu(PubMenu pubMenu, PubSistema pubSistema, String menu, String descricao, String caminho, String icone, Set<PubConteudo> pubConteudos, Set<PubMenu> pubMenus) {
       this.pubMenu = pubMenu;
       this.pubSistema = pubSistema;
       this.menu = menu;
       this.descricao = descricao;
       this.caminho = caminho;
       this.icone = icone;
       this.pubConteudos = pubConteudos;
       this.pubMenus = pubMenus;
    }
   
    public Integer getIdMenu() {
        return this.idMenu;
    }
    
    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }
    public PubMenu getPubMenu() {
        return this.pubMenu;
    }
    
    public void setPubMenu(PubMenu pubMenu) {
        this.pubMenu = pubMenu;
    }
    public PubSistema getPubSistema() {
        return this.pubSistema;
    }
    
    public void setPubSistema(PubSistema pubSistema) {
        this.pubSistema = pubSistema;
    }
    public String getMenu() {
        return this.menu;
    }
    
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCaminho() {
        return this.caminho;
    }
    
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    public String getIcone() {
        return this.icone;
    }
    
    public void setIcone(String icone) {
        this.icone = icone;
    }
    public Set<PubConteudo> getPubConteudos() {
        return this.pubConteudos;
    }
    
    public void setPubConteudos(Set<PubConteudo> pubConteudos) {
        this.pubConteudos = pubConteudos;
    }
    public Set<PubMenu> getPubMenus() {
        return this.pubMenus;
    }
    
    public void setPubMenus(Set<PubMenu> pubMenus) {
        this.pubMenus = pubMenus;
    }




}


