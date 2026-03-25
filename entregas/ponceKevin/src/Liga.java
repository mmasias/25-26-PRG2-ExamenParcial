public class Liga {
    private nombre;
    private List<Partido> partidos = new ArrayList<>();
    
    public Liga(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarCalificacion() {
    
    }

    public void listarPartidos() {
    
    }

    public void mostarPendientes() {
    
    }

    public void programarPartido(Partido partido) {
        assert partido != null : "partido no puede ser null";
        partidos.add(partido);
    
    }

    public void registrarResultado() {
    
    }
}