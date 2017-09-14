package negocio;

import modelo.Tarea;
import tsb.estructuras.TSBArrayList;

import java.io.*;

public class Agenda {

    private TSBArrayList<Tarea> tareas;

    public Agenda() {
        tareas = new TSBArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public ListaTareas listarTareas() {
        return new ListaTareas(tareas);
    }

    public void cambiarHecho(int index) {
        Tarea tarea = tareas.get(index);
        tarea.setHecho(! tarea.getHecho());
    }

    public void cargar() {
        try {
            File file = new File("tareas.dat");
            if (file.exists()) {
                try (FileInputStream fos = new FileInputStream("tareas.dat");
                     ObjectInputStream oos = new ObjectInputStream(fos)) {
                    tareas = (TSBArrayList<Tarea>) oos.readObject();
                }
            }
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }

    public void grabar() {
        try {
            try(FileOutputStream fos = new FileOutputStream("tareas.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(tareas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void limpiarHechas() {
                
    }
}
