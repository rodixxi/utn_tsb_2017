import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EventoTest {

    @Test
    public void testNroEvento() {
        Evento e1 = new Evento();
        Evento e2 = new Evento();
        Evento e3 = new Evento();

        assertTrue("El número deber ir incrementandose", e1.getNro() < e2.getNro());
        assertTrue(e2.getNro() < e3.getNro());

    }

    @Test
    public void testSiguiente() {
        int siguiente = Evento.getSiguiente();
        Evento e2 = new Evento(Evento.TipoEvento.TIPO2);
        assertEquals(siguiente, e2.getNro());
    }

}
