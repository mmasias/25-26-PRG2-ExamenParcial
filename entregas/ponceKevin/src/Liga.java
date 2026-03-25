public class Liga {
    private nombre;
    private List<Partido> partidos = new ArrayList<>();
    
    public Liga(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarCalificacion() {
        System.out.println("Calificacion:");
        for (Partido partido : partidos) {
            if (!partido.estaPendiente()) {
                Equipo equipo = partido.getGanador();
                boolean yaMostrado = false;

                for (Partido p : partidos) {
                    if (p == partido) {
                        break;
                    }
                    if (!p.estaPendiente() && p.getGanador() == equipo) {
                        yaMostrado = true;
                        break;
                    }
                }

                if (!yaMostrado) {
                    int victorias = 0;
                    for (Partido p : partidos) {
                        if (!p.estaPendiente() && p.getGanador() == equipo) {
                            victorias++;
                        }
                    }
                    System.out.println(" - " + equipo + " | victorias=" + victorias);
                }
            }
        }
    }

    public void listarPartidos() {
        System.out.println("Partidos Programados:");
        for (Partido partido : partidos) {
            System.out.println(" - " + partido);
        }
    }

    public void mostarPendientes() {
        System.out.println("Partidos Pendientes:");
        for (Partido partido : partidos) {
            if (partido.estaPendiente()) {
                System.out.println(" - " + partido);
            }
        }
    }

    public void programarPartido(Partido partido) {
        assert partido != null : "partido no puede ser null";
        partidos.add(partido);
    }

    public void registrarResultado() {
    
    }
}