package negocio;

import modelo.Tarea;
import tsb.estructuras.TSBArrayList;

public class ListaTareas {

    TSBArrayList<Tarea> tareas;

    ListaTareas(TSBArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Tarea get(int index) {
        return tareas.get(index);
    }

    public int size() {
        return tareas.size();
    }

}
