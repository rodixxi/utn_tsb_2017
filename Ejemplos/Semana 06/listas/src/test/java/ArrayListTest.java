import org.junit.Before;
import org.junit.Test;
import tsb.estructuras.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    private ArrayList<Integer> lista;

    @Before
    public void setup() {
        lista = new ArrayList<>();
    }

    @Test
    public void listaInicialVacia() {
        assertEquals(0, lista.size());
        assertEquals("[]", lista.toString());
    }

    @Test
    public void agregarIncrementaSize() {
        lista.add(1);
        assertEquals(1, lista.size());
        assertEquals("[1]", lista.toString());
        lista.add(2);
        assertEquals(2, lista.size());
        assertEquals("[1, 2]", lista.toString());
        lista.add(3);
        assertEquals(3, lista.size());
        assertEquals("[1, 2, 3]", lista.toString());
    }

    @Test
    public void testGet() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertEquals(1, (long) lista.get(0));
        assertEquals(2, (long) lista.get(1));
        assertEquals(3, (long) lista.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetVacia() {
        lista.get(0);
    }

}
