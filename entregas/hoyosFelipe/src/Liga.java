class Liga {

    private String nombre;
    private Equipo[] equipos;
    private Partido[] partidos;
    private int numeroEquipos;
    private int numeroPartidos;
    
    public Liga(String nombre){
        assert nombre != null;

        this.nombre = nombre;
        this.equipos = new Equipo[100];
        this.partidos = new Partido[200];
        this.numeroEquipos = 0;
        this.numeroPartidos = 0;
    }

    public Liga()

    public Liga(Liga liga)

    public Liga clone()

    public String nombre()

    public int numeroEquipos()

    public int numeroPartidos()

    public int numeroPartidosPendientes()

    public boolean equals(Liga liga)

    public void agregarEquipo(Equipo equipo)

    public void programarPartido(Equipo local, Equipo visitante, Fecha fecha)

    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante)

    public void mostrarClasificacion()

    public void mostrarPartidosPendientes()

    public void mostrarPartidos()

    public String toString()

    public void mostrar()

}