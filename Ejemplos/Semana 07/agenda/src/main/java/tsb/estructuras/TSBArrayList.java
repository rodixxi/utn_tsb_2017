package tsb.estructuras;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TSBArrayList<E> implements Iterable<E>, Serializable{


    private E[] items;
    private int size;

    public TSBArrayList(int initialCapacity) {
        items = (E[]) new Object[initialCapacity];
    }

    public TSBArrayList() {
        items = (E[]) new Object[10];
    }

    public void add(E x) {
        if(items.length == size) {
            ensureCapacity(items.length * 2);
        }
        items[size] = x;
        size ++;
    }

    private void ensureCapacity(int newLength) {
        if (items.length < newLength ) {
            Object[] aux = new Object[newLength];
            System.arraycopy(items, 0,aux, 0, size);
            items = (E[]) aux;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index");
        E aux = items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size --;
        return aux;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index");

        return items[index];
    }

    public void addAll(E[] list) {
        for (E x: list) {
            add(x);
        }

    }

    @Override
    public Iterator<E> iterator() {
        return new TSBArrayListIterator();
    }

    private class TSBArrayListIterator implements Iterator<E> {

        private int actual;
        private boolean puedeBorrar;

        public TSBArrayListIterator() {
            actual = 0;
            puedeBorrar = false;
        }

        @Override
        public boolean hasNext() {
            return actual < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E aux = items[actual];
            actual++;
            puedeBorrar = true;
            return aux;
        }

        @Override
        public void remove() {
            if (!puedeBorrar) {
                throw new IllegalStateException();
            }
            TSBArrayList.this.remove(actual - 1);
            actual --;
            puedeBorrar = false;
        }
    }

}


