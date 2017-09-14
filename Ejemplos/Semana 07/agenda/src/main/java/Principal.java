import modelo.Tarea;
import negocio.Agenda;
import negocio.ListaTareas;

import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.cargar();
        int op = 1;
        do {
            op = menu();
            switch(op) {
                case 1:
                    Tarea t = cargarTarea();
                    agenda.agregarTarea(t);
                    break;
                case 2:
                    System.out.println("Lista de tareas");
                    ListaTareas lista = agenda.listarTareas();
                    for (int i = 0;i < lista.size(); i++) {
                        System.out.println(i + "-" + lista.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Ingrese índice de tarea: ");
                    int ix = scanner.nextInt();
                    agenda.cambiarHecho(ix);
                    break;
                case 4:
                    agenda.limpiarHechas();
                    break;
                case 5:
                    break;
            }
        }
        while(op != 5);
        agenda.grabar();


    }

    private static Tarea cargarTarea() {
        System.out.println("Ingrese nombre de la tarea: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        return new Tarea(nombre);
    }

    public static int menu() {
        System.out.println("Menú de opciones: ");
        System.out.println("1 _ Cargar");
        System.out.println("2 _ Listar");
        System.out.println("3 _ Cambiar hecho");
        System.out.println("4 _ Borrar hechas");
        System.out.println("5 _ Salir");
        System.out.println("Ingrese opción: ");
        return scanner.nextInt();
    }
}
