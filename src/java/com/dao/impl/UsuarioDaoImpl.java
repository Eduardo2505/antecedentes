/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.UsuarioDao;
import com.util.HibernateUtil;
import mapping.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Eduardo
 */
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public Usuario Login(Usuario u) {
       Session session = HibernateUtil.getSessionFactory().openSession();


        try {

            String sql = "select u from Usuario u where idusuario=:email and clave=:pass and estado=1";
            Query query = session.createQuery(sql);
            query.setString("email", u.getIdusuario());
            query.setString("pass", u.getClave());
            u = (Usuario) query.uniqueResult();

        } catch (Exception e) {
            return null;

        } finally {
            session.close();
        }
        return u;
    }
    
}
