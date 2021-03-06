/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysql;

import com.dao.impl.GrpaveDaoImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import mapping.Grpave;
import mapping.GrpaveBean;

/**
 *
 * @author Eduardo
 */
public class BucarArchivos {

    public BucarArchivos() {
    }

    public static void main(String[] args) {

        listar(new File("C:\\Avaluos"));

    }

    public static void listar(File dir) {
        String[] ficheros = dir.list();
        if (ficheros == null) {
            System.out.println("No hay ficheros en el directorio especificado");
        } else {
            for (int x = 0; x < ficheros.length; x++) {
                String idAvaluo = ficheros[x].replaceAll(".PDF", "");

                GrpaveDaoImpl dao = new GrpaveDaoImpl();
                dao.actualizar("R", idAvaluo);

            }
        }
    }

    public static void buscar() {
        //walkin(new File("C:\\AVALUOSDIGITALIZADOS"), "12-999.PDF");
        GrpaveDaoImpl dao = new GrpaveDaoImpl();
        List res = dao.getMostrar();
        Iterator itr = res.iterator();
        int a = 0;
        while (itr.hasNext()) {
            Grpave c = (Grpave) itr.next();
            String nom = c.getArchivo().replaceAll("../User/AvaluosCapturados/", "");
            System.out.println(nom);
            walkin(new File("D:\\avaluosrespladoOriginal"), nom);

        }
    }

    public static void walkin(File dir, String ava) {
        //  String url = "";
        GrpaveDaoImpl dao = new GrpaveDaoImpl();
        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                    walkin(listFile[i], ava);
                } else {
                    if (ava.equals(listFile[i].getName())) {
                        copiar(listFile[i].getPath(), listFile[i].getName());



                    }




                }
            }
        }
        // return url;
    }

    public static void copiar(String url, String nombre) {

        File origen = new File(url);
        File destino = new File("C:\\Avaluos\\" + nombre + "");

        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
