import tsb.estructuras.TSBArrayList;

import java.io.*;

public class Lectura {
    public static void main(String[] args) {

        try {
            try(FileInputStream fis = new FileInputStream("personas.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                TSBArrayList<Persona> lista = (TSBArrayList<Persona>) ois.readObject();
                for (Persona p:lista) {
                    System.out.println(p);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
