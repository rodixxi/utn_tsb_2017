import tsb.estructuras.TSBArrayList;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {
    public static void main(String[] args) {
        TSBArrayList<Persona> lista = new TSBArrayList<>();
        Persona p = new Persona(123, "Piñon Fijo");
        lista.add(p);
        Persona p2 = new Persona(234, "Esteban Quito");
        lista.add(p2);
        for (Persona x:lista) {
            System.out.println(x);
        }
        try {
            try(FileOutputStream fos = new FileOutputStream("personas.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(lista);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
