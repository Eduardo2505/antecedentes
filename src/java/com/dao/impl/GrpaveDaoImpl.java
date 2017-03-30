/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.GrpaveDao;
import com.mysql.conexion;
import com.util.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mapping.Grpave;
import mapping.GrpaveBean;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Eduardo
 */
public class GrpaveDaoImpl implements GrpaveDao {

    @Override
    public List getMostrar(int inicio, int fin) {
        List<GrpaveBean> pg = new ArrayList<GrpaveBean>();
        conexion mysql = new conexion();
        Connection cn = mysql.Conectar();
        ResultSet rs = null;
        PreparedStatement st = null;
        String sSQl = "";
        try {

            sSQl = "select * from grpave where estado!='Eliminar' order by registro desc  limit " + inicio + "," + fin + " ";



            st = cn.prepareStatement(sSQl);
            rs = st.executeQuery();

            while (rs.next()) {
                GrpaveBean ne = new GrpaveBean();

                ne.setIdGrpAve(rs.getString(1));
                ne.setCalle(rs.getString(2));
                ne.setColonia(rs.getString(3));
                ne.setCp(rs.getInt(4));
                ne.setDelegacion(rs.getString(5));
                ne.setEntidad(rs.getString(6));
                ne.setFecha(rs.getString(7));
                ne.setTipo(rs.getString(8));
                ne.setArchivo(rs.getString(9));
                ne.setEstado(rs.getString(10));
                ne.setRegistro(rs.getString(11));
                ne.setUrlDropbox(rs.getString(13));

                pg.add(ne); //agregas ese objeto a la lista
            }
            st.close();
            rs.close();
            cn.close();

        } catch (Exception e) {
            return null;
        }
        return pg;
    }

    @Override
    public List getMostrar(int inicio, int fin, String columna, String valor) {
        List<GrpaveBean> pg = new ArrayList<GrpaveBean>();
        conexion mysql = new conexion();
        Connection cn = mysql.Conectar();
        ResultSet rs = null;
        PreparedStatement st = null;
        String sSQl = "";
        try {
            if (columna.equals("calle")) {
                sSQl = "select * from grpave where estado!='Eliminar' and concat(calle,'',colonia,' ',cp) like '%" + valor + "%' order by registro desc  limit " + inicio + "," + fin + " ";
            } else if (columna.equals("id")) {
                System.out.println(valor);
                sSQl = "select * from grpave where estado!='Eliminar' and idGrpAve ='" + valor + "' order by registro desc limit " + inicio + "," + fin + " ";
            } else {
                sSQl = "select * from grpave where estado!='Eliminar' and " + columna + " like '%" + valor + "%' order by registro desc  limit " + inicio + "," + fin + " ";

            }

            st = cn.prepareStatement(sSQl);
            rs = st.executeQuery();

            while (rs.next()) {
                GrpaveBean ne = new GrpaveBean();

                ne.setIdGrpAve(rs.getString(1));
                ne.setCalle(rs.getString(2));
                ne.setColonia(rs.getString(3));
                ne.setCp(rs.getInt(4));
                ne.setDelegacion(rs.getString(5));
                ne.setEntidad(rs.getString(6));
                ne.setFecha(rs.getString(7));
                ne.setTipo(rs.getString(8));
                ne.setArchivo(rs.getString(9));
                ne.setEstado(rs.getString(10));
                ne.setRegistro(rs.getString(11));
                ne.setUrlDropbox(rs.getString(13));

                pg.add(ne); //agregas ese objeto a la lista
            }
            st.close();
            rs.close();
            cn.close();

        } catch (Exception e) {
            return null;
        }
        return pg;
    }

    @Override
    public List Buscar(int inicio, int fin, String columna, String valor) {
        List< Grpave> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            Query q = session.createQuery("From Grpave where " + columna + "=" + valor + " order by registro desc");
            q.setFirstResult(inicio);
            q.setMaxResults(fin);
            list = (List<Grpave>) q.list();


        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public List getMostrar() {
        List< Grpave> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            Query q = session.createQuery("From Grpave where dropbox=3");
            //  int a=4726;
            //q.setFirstResult(a);

            list = (List<Grpave>) q.list();


        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public void actualizarEliminar(String estado, String idProducto) {

        conexion mysql = new conexion();
        Connection cn = mysql.Conectar();
        PreparedStatement st = null;
        String sSQl = "";
        try {

            sSQl = "update grpave set idGrpAve = ?,estado=? where idGrpAve = ?";


            st = cn.prepareStatement(sSQl);
            st.setString(1, idProducto + "-Eliminar");
            st.setString(2, "Eliminar");
            st.setString(3, idProducto);
            st.executeUpdate();


            st.close();

            cn.close();

        } catch (Exception e) {
        }

    }

    @Override
    public void actualizar(String estado, String idProducto) {

        conexion mysql = new conexion();
        Connection cn = mysql.Conectar();
        PreparedStatement st = null;
        String sSQl = "";
        try {

            sSQl = "update grpave set estado = ? where idGrpAve = ?";


            st = cn.prepareStatement(sSQl);
            st.setString(1, estado);
            st.setString(2, idProducto);
            st.executeUpdate();


            st.close();

            cn.close();

        } catch (Exception e) {
        }

    }

    @Override
    public Grpave Buscar(String idAvaluo) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = null;
        Grpave adicionales = null;

        try {
            tx = session.beginTransaction();

            adicionales = (Grpave) session.get(Grpave.class, idAvaluo);

            tx.commit();
        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

        } finally {

            session.close();

        }
        return adicionales;
    }

    @Override
    public void insertar(Grpave grpave) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(grpave);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }

        } finally {

            session.close();

        }
    }

    @Override
    public void eliminar(String idAvaluo) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = null;
        Grpave adicionales = null;

        try {
            tx = session.beginTransaction();

            adicionales = (Grpave) session.get(Grpave.class, idAvaluo);
            session.delete(adicionales);
            tx.commit();
        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

        } finally {

            session.close();

        }

    }

    @Override
    public List Ano() {
        List< Grpave> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            Query q = session.createQuery("From Grpave group by fecha");

            list = (List<Grpave>) q.list();


        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public int gecontar() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        int total = 0;
        try {

            String sql = "select count(*) from Grpave";
            Query query = session.createQuery(sql);
            total = ((Number) query.uniqueResult()).intValue();

        } catch (Exception e) {
            return 0;
        } finally {

            session.close();

        }
        return total;
    }
}
