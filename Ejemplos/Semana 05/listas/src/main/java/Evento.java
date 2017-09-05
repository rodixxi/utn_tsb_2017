public final class Evento {

    private final static int NRO_INICIAL = 1;

    enum TipoEvento {
        TIPO1,
        TIPO2
    }

    private int nro;
    private final TipoEvento tipo;
    private static int secuencia = NRO_INICIAL;

    public static int getSiguiente() {
        return secuencia;
    }

    public Evento() {
        this(TipoEvento.TIPO1);
    }


    public Evento(final TipoEvento tipo) {
        final int numero = secuencia++;
        nro = numero;
        this.tipo = tipo;
    }

    public final int getNro() {
        return nro;
    }

}


