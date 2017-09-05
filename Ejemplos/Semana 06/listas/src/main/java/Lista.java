public class Lista {

    private Nodo frente;
    private int size;

    public int size() {
        return size;
    }

    public void add(Object x) {
        Nodo p = new Nodo(x);
        p.next = frente;
        frente = p;

        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo p = frente;
        while(p!=null) {
            if (p != frente) {
                sb.append(", ");
            }
            sb.append(p.info);
            p = p.next;
        }

        sb.append("]");
        return sb.toString();
    }

    public Object get(int indice) {
        if(indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
        Nodo p = frente;
        for(int i = 0; i < indice; i++) {
            p = p.next;
        }
        return p.info;
    }

    public Nodo getFrente() {
        return frente;
    }
}
class Nodo {
    Object info;
    Nodo next;

    public Nodo(Object info) {
        this.info = info;
    }
}

