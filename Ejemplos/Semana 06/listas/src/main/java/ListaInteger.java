import java.util.Iterator;

/**
 * Created by federico on 05/09/17.
 */
public class ListaInteger {
    private Lista lista;

    public ListaInteger() {
        lista = new Lista();
    }

    public int size() {
        return lista.size();
    }

    public void add(Integer x) {
        lista.add(x);
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    public Integer get(int indice) {
        return (Integer)lista.get(indice);
    }

    public Iterator iterator() {
        return lista.iterator();
    }
}
