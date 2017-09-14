package modelo;

import java.io.Serializable;
import java.util.Date;

public class Tarea implements Serializable {

    private String nombre;
    private Date fecha;
    private boolean hecho;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.fecha = new Date();
        this.hecho = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getHecho() {
        return hecho;
    }

    public void setHecho(boolean hecho) {
        this.hecho = hecho;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", hecho=" + hecho +
                '}';
    }
}
