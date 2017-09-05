public class GestorEventos {

    private static GestorEventos instance = new GestorEventos();

    private GestorEventos() {

    }

    public static GestorEventos getInstance() {
        return instance;
    }

}
