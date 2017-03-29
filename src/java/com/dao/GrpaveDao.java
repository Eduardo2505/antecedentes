/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;
import mapping.Grpave;

/**
 *
 * @author Eduardo
 */
public interface GrpaveDao {

    public List getMostrar(int inicio, int fin);

    public List getMostrar(int inicio, int fin, String columna, String valor);

    public List Buscar(int inicio, int fin, String columna, String valor);

    public List getMostrar();

    public void actualizar(String estado, String idProducto);

    public Grpave Buscar(String idAvaluo);

    public void insertar(Grpave grpave);

    public void eliminar(String idAvaluo);

    public void actualizarEliminar(String estado, String idProducto);

    public List Ano();

    public int gecontar();
}
