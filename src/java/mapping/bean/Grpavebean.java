/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping.bean;

import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class Grpavebean {
      private String idGrpAve;
     private String calle;
     private String colonia;
     private Integer cp;
     private String delegacion;
     private String entidad;
     private Date fecha;
     private String tipo;
     private String archivo;
     private String estado;
     private Date registro;
     private String idusuario;

    public Grpavebean() {
    }

    public Grpavebean(String idGrpAve, String calle, String colonia, Integer cp, String delegacion, String entidad, Date fecha, String tipo, String archivo, String estado, Date registro, String idusuario) {
        this.idGrpAve = idGrpAve;
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
        this.delegacion = delegacion;
        this.entidad = entidad;
        this.fecha = fecha;
        this.tipo = tipo;
        this.archivo = archivo;
        this.estado = estado;
        this.registro = registro;
        this.idusuario = idusuario;
    }

    public String getIdGrpAve() {
        return idGrpAve;
    }

    public void setIdGrpAve(String idGrpAve) {
        this.idGrpAve = idGrpAve;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
     
}
