public class Liga {
    private String nombre;
    private Partido[] partidos;
    private int totalPartidos;

    private static final int MAX_PARTIDOS = 1000;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.partidos = new Partido[MAX_PARTIDOS];
        this.totalPartidos = 0;
    }

    private void agregarPartido(Partido partido) {
        if (totalPartidos < MAX_PARTIDOS) {
            partidos[totalPartidos] = partido;
            totalPartidos++;
        } else {
            System.out.println("No se pueden agregar más partidos.");
        }
    }

    public void programarPartido(Partido partido) {
        assert partido != null : "partido no puede ser null";
        agregarPartido(partido);
    }

    public void listarPartidos() {
        System.out.println("Partidos Programados:");
        for (int i = 0; i < totalPartidos; i++) {
            System.out.println(" - " + partidos[i]);
        }
    }

    public void mostarPendientes() {
        System.out.println("Partidos Pendientes:");
        for (int i = 0; i < totalPartidos; i++) {
            if (partidos[i].estaPendiente()) {
                System.out.println(" - " + partidos[i]);
            }
        }
    }

    public void mostrarCalificacion() {
        System.out.println("Calificacion:");
        for (int i = 0; i < totalPartidos; i++) {
            Partido partido = partidos[i];
            if (!partido.estaPendiente()) {
                Equipo equipo = partido.getGanador();
                boolean yaMostrado = false;

                for (int j = 0; j < i; j++) {
                    Partido p = partidos[j];
                    if (!p.estaPendiente() && p.getGanador() == equipo) {
                        yaMostrado = true;
                        break;
                    }
                }

                if (!yaMostrado) {
                    int victorias = contarVictorias(equipo);
                    System.out.println(" - " + equipo + " | victorias=" + victorias);
                }
            }
        }
    }

    private int contarVictorias(Equipo equipo) {
        int victorias = 0;
        for (int i = 0; i < totalPartidos; i++) {
            if (!partidos[i].estaPendiente() && partidos[i].getGanador() == equipo) {
                victorias++;
            }
        }

        return victorias;
    }

    public void registrarResultado() {
    }
}