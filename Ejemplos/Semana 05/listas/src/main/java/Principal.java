import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        Random random = new Random();

        Lista lista = new Lista();
        for (int i = 0; i < 1000; i++) {
            lista.add(random.nextInt(1000));
        }
        lista.add("Sumame");

        System.out.println(lista);

        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += (Integer)lista.get(i);
        }
        System.out.println("La suma es: " + suma);
    }
}
