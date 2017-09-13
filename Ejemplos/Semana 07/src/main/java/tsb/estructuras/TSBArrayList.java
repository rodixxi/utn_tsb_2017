package tsb.estructuras;

import java.util.Collection;

public class TSBArrayList<E> {


    private E[] items;
    private int size;

    public TSBArrayList() {
        items = (E[]) new Object[10];
    }

    public void add(E x) {
        items[size] = x;
        size ++;
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
