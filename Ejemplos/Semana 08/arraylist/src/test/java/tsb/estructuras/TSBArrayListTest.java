package tsb.estructuras;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class TSBArrayListTest {

    private TSBArrayList<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = new TSBArrayList<>();
    }


    @Test
    public void testTamanioInicialCero() {
        assertEquals(0, list.size());
    }

    @Test
    public void testSizeSeIncrementa() {
        list.add(1);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testGet() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNegativo() {
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetMayorASize() {
        list.get(100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIgualASize() {
        list.add(1);
        list.get(list.size());
    }


    @Test
    public void testAddAt() {
        Integer[] v = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 6, 3, 4, 5};
        list.addAll(asList(v));

        list.add(2, 6);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }


    @Test
    public void testSet() {
        Integer[] v = {1, 2, 3, 4, 5, 6};
        Integer[] expected = {1, 2, 10, 4, 5, 6};
        list.addAll(asList(v));

        list.set(2, 10);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testAddAll() {
        Integer[] v = {1, 2, 3, 4};
        list.addAll(asList(v));
        for (int i = 0; i < v.length; i++) {
            assertEquals(v[i], list.get(i));
        }
    }

    @Test
    public void testIncrementoTamaño() {
        Integer[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        list.addAll(asList(v));
        list.add(11);
        assertEquals(11, list.size());
    }

    @Test
    public void testRemove() {
        Integer[] v = {1, 2, 3, 4, 5};
        list.addAll(asList(v));
        Integer e = list.remove(2);
        assertEquals(Integer.valueOf(3), e);
        assertEquals(4, list.size());
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(4), list.get(2));
    }

    @Test
    public void testIterator() {
        Integer[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        list.addAll(asList(v));

        Iterator<Integer> it = list.iterator();
        int i = 0;
        while(it.hasNext()) {
            Integer aux = it.next();
            assertEquals(v[i], aux);
            i ++;
        }
    }

    @Test
    public void testIteratorRemove() {
        Integer[] v = {1, 2, 3, 4, 5};
        list.addAll(asList(v));

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            Integer aux = it.next();
            if (aux == 3) {
                it.remove();
            }
        }
        assertEquals(4, list.size());
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(4), list.get(2));
    }


}