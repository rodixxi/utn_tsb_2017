package tsb.estructuras;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TSBArrayList<E> extends AbstractList<E> implements Iterable<E>, Serializable{


    private E[] items;
    private int size;

    public TSBArrayList(int initialCapacity) {
        items = (E[]) new Object[initialCapacity];
    }

    public TSBArrayList() {
        items = (E[]) new Object[10];
    }


    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Invalid index");
        if(items.length == size) {
            ensureCapacity(items.length * 2);
        }
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = element;
        size ++;
        modCount++;
    }

    private void ensureCapacity(int newLength) {
        if (items.length < newLength ) {
            Object[] aux = new Object[newLength];
            System.arraycopy(items, 0,aux, 0, size);
            items = (E[]) aux;
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index");
        E old = items[index];
        items[index] = element;
        return old;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Invalid index");
        E aux = items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size --;
        modCount ++;
        return aux;
    }

    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Invalid index");

        return items[index];
    }

}


