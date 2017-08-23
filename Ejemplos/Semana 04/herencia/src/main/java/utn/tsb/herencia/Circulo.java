package utn.tsb.herencia;

public class Circulo extends Figura {

    @Override
    public void mostrarse() {
        System.out.println("Soy un Circulo");

    }

    @Override
    public int compareTo(Object x) {
        return 1;
    }

    @Override
    public String nombre() {
        return "Circulo";
    }

    public void echarMoco() {
        System.out.println("Vamo a echa moco!!!");
    }
}
