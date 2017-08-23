package utn.tsb.herencia;

public class Cuadrado extends Figura {

    @Override
    public void mostrarse() {
        System.out.println("Soy un Cuadrado");
    }

    @Override
    public String nombre() {
        return "Cuadrado";
    }

    @Override
    public int compareTo(Object x) {
        return 0;
    }
}
