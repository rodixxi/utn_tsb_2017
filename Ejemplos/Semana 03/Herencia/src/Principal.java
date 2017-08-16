public class Principal {
    public static void main(String[] args) {
        Derivada d = new Derivada();
        d.b = 3;
        System.out.println("Valor de a: " + d.getA());
        System.out.println("Valor de b: " + d.getB());
        
        Object x = 3;
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(10);
        if (a == b) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        }
    } 
    
}
