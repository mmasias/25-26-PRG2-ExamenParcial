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

    public Liga(){
        this("");
    }

    public Liga(Liga liga){
        this(liga.nombre);

        copirEquipos(liga);
        copiarPartidos(liga);
    }

    public Liga clone(){
        return new Liga(this);
    }

    public String nombre(){
        return nombre;
    }

    public int numeroEquipos(){
        return numeroEquipos;
    }

    public int numeroPartidos(){
        return numeroPartidos;
    }

    public int numeroPartidosPendientes(){
        int pendientes = 0;

        for (int i = 0; i < numeroPartidos; i++) {
            if(partidos[i].estaPendiente()) {
                pendientes++;
            }
        }
        
        return pendientes;
    }

    public boolean equals(Liga liga){
        assert liga !=null;
        return this.nombre.equals(liga.nombre);
    }

    public void agregarEquipo(Equipo equipo){
        assert equipo != null;
        assert numeroEquipos < equipos.length;
        assert buscarEquipo(equipo.nombre()) == null;

        equipos[numeroEquipos] = equipo;
        numeroEquipos++;
    }

    public void programarPartido(Equipo local, Equipo visitante, Fecha fecha){
        assert local != null;
        assert visitante != null;
        assert fecha != null;
        assert numeroPartidos < partidos.length;
        assert buscarEquipo(local.nombre()) != null;
        assert buscarEquipo(visitante.nombre()) != null;

        partidos[numeroPartidos] = new Partido(local, visitante, fecha);
        numeroPartidos++;
    }

    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante)

    public void mostrarClasificacion()

    public void mostrarPartidosPendientes()

    public void mostrarPartidos()

    public String toString()

    public void mostrar()

}