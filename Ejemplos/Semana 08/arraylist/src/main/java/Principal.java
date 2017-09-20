import tsb.estructuras.TSBArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Principal {

    public static void main(String[] args) {


        Random random = new Random();
        List<Integer> lista = new TSBArrayList<>();
        for (int i = 0; i < 30; i++) {
            lista.add(0, random.nextInt(1000));
        }

        System.out.println(lista);
        List<Integer> cuadrados = lista.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(cuadrados);

        pp(1, 2, 3, 4, 5);
        pp(1, 2, 3, 4, 5, 6, 7, 8 );
    }

    public static void pp(int... v) {
    }
}
