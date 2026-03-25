class Partido {

    private Equipo local;
    private Equipo visitante;
    private Fecha fecha;
    private int golesLocal;
    private int golesVisitante;
    private boolean jugado;   

    public Partido(Equipo local, Equipo visitante, Fecha fecha){
        assert local != null;
        assert visitante != null;
        assert fecha != null;
        assert !local.tieneMismoNombre(visitante.nombre());

        this.local = local.clone();
        this.visitante = visitante.clone();
        this.fecha = fecha.clone();
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.jugado = false;
    }

    public Partido(Partido partido){}

    public Partido clone(){}

    public Equipo local(){}

    public Equipo visitante(){}

    public Fecha fecha(){}

    public int golesLocal(){}

    public int golesVisitante(){}

    public boolean estaJugando(){}

    public boolean estaPendiente(){}

    public boolean equals(Partido partido){}

    public void registrarResultado(int golesLocal, int golesVisitante){}

    public String toString(){}

    public void mostrar(){}
}