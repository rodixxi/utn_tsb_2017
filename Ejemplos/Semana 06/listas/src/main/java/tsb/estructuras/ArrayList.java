package tsb.estructuras;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T>{

    private Object[] v;
    private int size;

    public ArrayList() {
        v = new Object[100];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T x) {
        v[size] = x;
        size++;
    }

    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T)v[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<size;i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(v[i]);
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class ArrayListIterator implements Iterator<T> {

        int actual;

        public ArrayListIterator() {
            actual = 0;
        }

        @Override
        public boolean hasNext() {
            return actual < size;
        }

        @Override
        public T next() {
            Object valor = v[actual];
            actual ++;
            return (T)valor;
        }
    }
}
