package tsb.estructuras;

import java.util.Collection;

public class TSBArrayList<E> {


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
        return null;
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
}
