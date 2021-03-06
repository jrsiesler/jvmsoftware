/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jvmsoftware.daos;

import br.com.jvmsoftware.entities.AcsEmpresaSistema;
import br.com.jvmsoftware.entities.AcsUsuarioSistema;
import br.com.jvmsoftware.entities.PubEmpresa;
import br.com.jvmsoftware.entities.PubSistema;
import br.com.jvmsoftware.entities.PubUsuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jose
 */
public class PubSistemaDAO extends DefaultDAO {
    
    public PubSistema getById(int Id) throws SQLException {
        getSession();
        begin();
        PubSistema sistema;
        sistema = (PubSistema) session.get(PubSistema.class, Id);
        closeSession();
        return sistema;
    }
    
    public List<PubSistema> listAllSistemas() throws SQLException {
        getSession();
        begin();
        List<PubSistema> sistemas;
        sistemas = session.createQuery("from PubSistema").list();
        return sistemas;
    }
    
    public void inserirSistema (PubSistema sistema) throws SQLException {
        getSession();
        begin();
        session.save(sistema);
        commit();
        triggerInsert(sistema);
        closeSession();
    }
    
    public void atualizarSistema (PubSistema sistema) throws SQLException {
        getSession();
        begin();
        session.merge(sistema);
        commit();
        closeSession();
    }
    
    
    private void triggerInsert(PubSistema sistema) throws SQLException {
        // relacionamento sistema x empresa
        AcsEmpresaSistemaDAO empSisDAO = new AcsEmpresaSistemaDAO();
        List<PubEmpresa> empresas;
        empresas = session.createSQLQuery("select * from pub_empresa s where s.id_empresa not in (select sistema from acs_empresa_sistema where sistema = :sis)").setParameter("sis", sistema.getIdSistema()).list();
        for (PubEmpresa empresa : empresas) {
            AcsEmpresaSistema empSis = new AcsEmpresaSistema();
            empSis.setPubEmpresa(empresa);
            empSis.setPubSistema(sistema);
            empSis.setAtivo(true);
            empSisDAO.inserirEmpresaSistema(empSis);
        }
        // relacionamento sistema x usuario
        AcsUsuarioSistemaDAO usuSisDAO = new AcsUsuarioSistemaDAO();
        List<PubUsuario> usuarios;
        usuarios = session.createSQLQuery("select * from pub_usuario s where s.id_usuario not in (select usuario from acs_usuario_sistema where sistema = :sis) ").setParameter("sis", sistema.getIdSistema()).list();
        for (PubUsuario usuario : usuarios) {
            AcsUsuarioSistema usuSis = new AcsUsuarioSistema();
            usuSis.setPubUsuario(usuario);
            usuSis.setPubEmpresa(usuario.getPubEmpresa());
            usuSis.setPubSistema(sistema);
            usuSis.setAtivo(true);
            usuSisDAO.inserirUsuarioSistema(usuSis);
        }
    }
    
}
