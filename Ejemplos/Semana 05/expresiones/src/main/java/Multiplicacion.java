/**
 * Created by federico on 22/08/17.
 */
public class Multiplicacion implements Expresion {

    private Expresion a, b;

    public Multiplicacion(Expresion a, Expresion b) {
        this.a = a;
        this.b = b;
    }

    public int valuar() {
        return a.valuar() * b.valuar();
    }
}
