public class Liga {
    private nombre;
    private List<Partido> partidos = new ArrayList<>();
    
    public Liga(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarCalificacion() {
    
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