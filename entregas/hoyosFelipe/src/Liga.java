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

        copiarEquipos(liga);
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
        assert !local.tieneMismoNombre(visitante.nombre());

        partidos[numeroPartidos] = new Partido(local, visitante, fecha);
        numeroPartidos++;
    }

    public void registrarResultado(Partido partido, int golesLocal, int golesVisitante){
        assert partido != null;

        Partido partidoLiga = buscarPartido(partido);

        assert partidoLiga != null;
        assert partidoLiga.estaPendiente();

        partidoLiga.registrarResultado(golesLocal, golesVisitante);
        actualizarPuntos(partidoLiga);
    }

    public void mostrarClasificacion(){
        Equipo[] clasificacion = copiarEquipos();
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
        Equipo local = buscarEquipo(partido.local().nombre());
        Equipo visitante = buscarEquipo(partido.visitante().nombre());

        assert local != null;
        assert visitante != null;

        if(partido.golesLocal() > partido.golesVisitante()){
            local.sumarPuntos(3);
        } else if (partido.golesLocal() < partido.golesVisitante()) {
            visitante.sumarPuntos(3);
        } else {
            local.sumarPuntos(1);
            visitante.sumarPuntos(1);
        }
    }

    private Equipo[] copiarEquipos(){
        Equipo[] copia = new Equipo[numeroEquipos];

        for (int i = 0; i < numeroEquipos; i++) {
            copia[i] = equipos[i].clone();
        }

        return copia;
    }

    private void ordenarPorPuntos(Equipo[] clasificacion){
        for (int i = 0; i < clasificacion.length - 1; i++) {
            for (int j = i + 1 ; j < clasificacion.length; j++) {
                if (clasificacion[j].puntos() > clasificacion[i].puntos()) {
                    intercambiar(clasificacion, i, j);
                }
            }
        }
    }

    private void intercambiar(Equipo[] clasificacion, int i, int j){
        Equipo aux = clasificacion[i];
        clasificacion[i] = clasificacion[j];
        clasificacion[j] = aux;
    }

    private Equipo buscarEquipo(String nombre){
        assert nombre != null;

        for (int i = 0; i < numeroEquipos; i++) {
            if (equipos[i].tieneMismoNombre(nombre)) {
                return equipos[i];
            }
        }

        return null;
    }

    private void copiarEquipos(Liga liga){
        for (int i = 0; i < liga.numeroEquipos; i++) {
            this.equipos[i] = liga.equipos[i].clone();
        }

        this.numeroEquipos = liga.numeroEquipos;
    }

    private void copiarPartidos(Liga liga){
        for (int i = 0; i < liga.numeroPartidos; i++) {
            Equipo local = buscarEquipo(liga.partidos[i].local().nombre());
            Equipo visitante = buscarEquipo(liga.partidos[i].visitante().nombre());

            this.partidos[i] = new Partido(local, visitante, liga.partidos[i].fecha());

            if(liga.partidos[i].estaJugando()){
                this.partidos[i].registrarResultado(
                    liga.partidos[i].golesLocal(), 
                    liga.partidos[i].golesVisitante()
                );
            }
        }

            this.numeroPartidos = liga.numeroPartidos;
        }
        
}
