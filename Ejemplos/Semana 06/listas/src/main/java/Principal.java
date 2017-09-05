import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        Random random = new Random();

        Lista lista = new Lista();
        for (int i = 0; i < 50000; i++) {
            lista.add(random.nextInt(1000));
        }
        int suma;
        long antes, despues;


        antes = System.currentTimeMillis();
        suma = 0;
        Nodo p = lista.getFrente();
        while(p != null) {
            suma += (Integer)p.info;
            p = p.next;
        }
        despues = System.currentTimeMillis();
        System.out.println("La suma es: " + suma);
        System.out.println("Tiempo consumido: " + (despues - antes));
        lista.getFrente().next = null;

        antes = System.currentTimeMillis();
        suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += (Integer)lista.get(i);
        }
        despues = System.currentTimeMillis();
        System.out.println("La suma es: " + suma);
        System.out.println("Tiempo consumido: " + (despues - antes));


    }
}
