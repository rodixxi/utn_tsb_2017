package utn.tsb.herencia;

public class Principal {
    public static void main(String[] args) {

        Figura[] figuras = {
                new Circulo(),
                new Cuadrado(),
                new Circulo()
        };

        for(Comparable figura: figuras) {
            System.out.println();
        }
        for(Figura figura: figuras) {
            figura.mostrarse();
            if (figura instanceof Circulo) {
                Circulo c = (Circulo) figura;
                c.echarMoco();
            }
        }


    }
}
