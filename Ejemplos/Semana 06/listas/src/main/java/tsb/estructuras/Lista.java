package tsb.estructuras;

import java.util.Iterator;

public class Lista <T extends Comparable> implements Iterable<T> {

    private Nodo<T> frente;

    private int size;

    public int size() {
        return size;
    }

    public void add(T x) {
        Nodo<T> p = new Nodo<T>(x);
        p.next = frente;
        frente = p;

        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo<T> p = frente;
        while (p != null) {
            if (p != frente) {
                sb.append(", ");
            }
            sb.append(p.info);
            p = p.next;
        }

        sb.append("]");
        return sb.toString();
    }

    public T get(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
        Nodo<T> p = frente;
        for (int i = 0; i < indice; i++) {
            p = p.next;
        }
        return p.info;
    }

    public Iterator<T> iterator() {
        return new IteradorLista();
    }

    private class IteradorLista implements Iterator<T> {
        Nodo<T> actual;

        IteradorLista() {
            this.actual = frente;
        }

        public boolean hasNext() {
            return actual != null;
        }

        public T next() {
            T info = actual.info;
            actual = actual.next;
            return info;
        }

    }

    private static class Nodo<T> {
        T info;
        Nodo<T> next;

        Nodo(T info) {
            this.info = info;
        }
    }
}

