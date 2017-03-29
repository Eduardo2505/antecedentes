/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;



/**
 *
 * @author Eduardo
 */
public class GrpaveBean {
    private String idGrpAve;
     private String calle;
     private String colonia;
     private Integer cp;
     private String delegacion;
     private String entidad;
     private String fecha;
     private String tipo;
     private String archivo;
     private String estado;
     private String registro;
     private String idusuario;
     private String urlDropbox;

    public GrpaveBean() {
    }

    public GrpaveBean(String idGrpAve, String calle, String colonia, Integer cp, String delegacion, String entidad, String fecha, String tipo, String archivo, String estado, String registro, String idusuario, String urlDropbox) {
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
        this.urlDropbox = urlDropbox;
    }

    public String getUrlDropbox() {
        return urlDropbox;
    }

    public void setUrlDropbox(String urlDropbox) {
        this.urlDropbox = urlDropbox;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
    
     
}
