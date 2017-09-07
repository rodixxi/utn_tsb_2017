import tsb.estructuras.Lista;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Random random = new Random();

        Lista<Integer> lista = new Lista<>();
        for (int i = 0; i < 10000; i++) {
            lista.add(random.nextInt(1000));
        }
        int suma;
        long antes, despues;

        System.out.println("Usando iterator");
        antes = System.nanoTime();

        suma = 0;
        for (Integer i: lista) {
            suma += i;
        }

        despues = System.nanoTime();
        System.out.println("La suma es: " + suma);
        System.out.println("Tiempo consumido: " + (despues - antes));

    }
}
