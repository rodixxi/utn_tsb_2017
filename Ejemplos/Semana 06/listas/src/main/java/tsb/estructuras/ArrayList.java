package tsb.estructuras;

public class ArrayList<T> {

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
}
