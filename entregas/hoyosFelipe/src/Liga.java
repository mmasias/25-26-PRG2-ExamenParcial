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

    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante){
        Partido partidoLiga = buscarPartido(partido);

        assert partido != null;
        assert partidoLiga != null;
        assert partidoLiga.estaPendiente();

        partidoLiga.regustrarResultado(golesLocal, golesVisitante);
        actualizarPuntos(partidoLiga);
    }

    public void mostrarClasificacion(){
        Equipo[] clasificacio = copiarEquipos();
        ordenarPorPuntos(clasificacion);

        for(int i = 0; i < clasificacion.length; i++){
            clasificacion[i].mostrar();
        }
    }

    public void mostrarPartidosPendientes(){
        for (int i =0; i < numeroPartidos; i++) {
            if (partidos[i].estaPendiente()) {
                partidos[i].mostrar();
            }
        }
    }

    public void mostrarPartidos(){
        for (int i = 0; i < numeroPartidos; i++) {
            partidos[i].mostrar();
        }
    }

    public String toString(){
        return nombre + " - equipos: " + numeroEquipos + " - partidos: " + numeroPartidos;
    }

    public void mostrar(){
        System.out.println(toString());
    }

    private Partido buscarPartido(Partido partido){
        for (int i = 0; i < numeroPartidos; i++) {
            if(partidos[i].equals(partido)){
                return partidos[i];
            }
        }
        return null;
    }

    private void actualizarPuntos(Partido partido){
        if(partido.golesLocal() > partido.golesVisitante()){
            partido.local().sumarPuntos(3);
        } else if (partido.golesLocal() < partido.golesVisitante()) {
            partido.visitante().sumarPuntos(3);
        } else {
            partido.local().sumarPuntos(1);
            partido.visitante().sumarPuntos(1);
        }
    }

    private Equipo[] copiarEquipos(){
        Equipo[] copia = new Equipo[numeroEquipos];

        for (int i = 0; i < numeroEquipos; i++) {
            copia[i] = equipos[i].clone();
        }
        
        return copia;
    }

}