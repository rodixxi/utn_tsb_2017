import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private int dni;
    private String nombre;
    private transient int edad;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = (int)(Math.random() * 100);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
