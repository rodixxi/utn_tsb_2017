package utn.tsb.herencia;



public abstract class Figura implements Comparable {

    public abstract void mostrarse();

    public abstract String nombre();

    @Override
    public String toString() {
        return "Figura: " + nombre();
    }
}
