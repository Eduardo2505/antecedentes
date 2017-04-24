package mapping;
// Generated 31/03/2017 07:42:52 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenerationTime;

/**
 * Grpave generated by hbm2java
 */
@Entity
@Table(name = "grpave", catalog = "essy_ave")
public class Grpave implements java.io.Serializable {

    private String idGrpAve;
    private String calle;
    private String colonia;
    private Integer cp;
    private String delegacion;
    private String entidad;
    private Integer fecha;
    private String tipo;
    private String archivo;
    private String estado;
    private Date registro;
    private String idusuario;
    private String urlDropbox;
    private Integer dropbox;

    public Grpave() {
    }

    public Grpave(String idGrpAve, String idusuario) {
        this.idGrpAve = idGrpAve;
        this.idusuario = idusuario;
    }

    public Grpave(String idGrpAve, String calle, String colonia, Integer cp, String delegacion, String entidad, Integer fecha, String tipo, String archivo, String estado, Date registro, String idusuario, String urlDropbox, Integer dropbox) {
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
        this.dropbox = dropbox;
    }

    @Id
    @Column(name = "idGrpAve", unique = true, nullable = false, length = 100)
    public String getIdGrpAve() {
        return this.idGrpAve;
    }

    public void setIdGrpAve(String idGrpAve) {
        this.idGrpAve = idGrpAve;
    }

    @Column(name = "calle", length = 65535)
    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Column(name = "colonia", length = 65535)
    public String getColonia() {
        return this.colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Column(name = "cp")
    public Integer getCp() {
        return this.cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    @Column(name = "delegacion", length = 65535)
    public String getDelegacion() {
        return this.delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    @Column(name = "entidad", length = 65535)
    public String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Column(name = "fecha")
    public Integer getFecha() {
        return this.fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    @Column(name = "tipo", length = 65535)
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Column(name = "archivo", length = 200)
    public String getArchivo() {
        return this.archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Column(name = "estado", length = 45)
    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "registro")
    @org.hibernate.annotations.Generated(value = GenerationTime.INSERT)
    public Date getRegistro() {
        return this.registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    @Column(name = "idusuario", nullable = false, length = 100)
    public String getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    @Column(name = "urlDropbox", length = 450)
    public String getUrlDropbox() {
        return this.urlDropbox;
    }

    public void setUrlDropbox(String urlDropbox) {
        this.urlDropbox = urlDropbox;
    }

    /**
     *
     * @return
     */
    
    @Column(name = "dropbox",nullable = false)
    public Integer getDropbox() {
        return this.dropbox;
    }

    public void setDropbox(Integer dropbox) {
        this.dropbox = dropbox;
    }
}
