/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class conexion {

    public String db = "essy_ave";
    public String url = "jdbc:mysql://104.154.213.93:3306/" + db;
    //public String url = "jdbc:mysql://localhost:3307/" + db;
    public String user = "root";
    public String pass = "seiter";
    /*public String user = "essy_root";
     public String pass = "Eduardo25%";*/

    public void conexion() {
    }

    public Connection Conectar() {
        Connection link = null;
        try {
            //Cargamos el Drivers Mysql

            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(url, user, pass);


        } catch (ClassNotFoundException ex) {
        } catch (SQLException e) {
        }
        return link;
    }
}
