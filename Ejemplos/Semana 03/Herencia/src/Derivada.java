public class Derivada extends Base {

    private int c;

    public Derivada(int c, int a, int b) {
        super(a);
        this.c = c;
    }
    
    public Derivada() {
        this(123, 234, 42);
    }
    
    public void test() {
        setA(3);
        b = 42;
    }
    
}
