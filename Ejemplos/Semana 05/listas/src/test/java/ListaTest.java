import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListaTest {

    Lista lista;

    @Before
    public void setup() {
        lista = new Lista();
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
        assertEquals("[2, 1]", lista.toString());
        lista.add(3);
        assertEquals(3, lista.size());
        assertEquals("[3, 2, 1]", lista.toString());
    }

    @Test
    public void testGet() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertEquals(3, lista.get(0));
        assertEquals(2, lista.get(1));
        assertEquals(1, lista.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetVacia() {
        lista.get(0);
    }

}
