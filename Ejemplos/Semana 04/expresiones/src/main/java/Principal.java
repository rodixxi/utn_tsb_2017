public class Principal {
    public static void main(String[] args) {

        Valor a = new Valor(2);
        Valor b = new Valor(3);
        Valor c = new Valor(5);
        Multiplicacion o1 = new Multiplicacion(b, c);
        Multiplicacion o2 = new Multiplicacion(a, o1);
        Suma o3 = new Suma(new Valor(10), o2);

        int resultado = o3.valuar();
        System.out.println("El resultado es: " + resultado);



    }
}
