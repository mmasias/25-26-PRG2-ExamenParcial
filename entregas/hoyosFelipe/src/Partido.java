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

    public Partido(Partido partido){
        this(partido.local, partido.visitante, partido.fecha);
        if (partido.estaJugando()){
            this.registrarResultado(partido.golesLocal, partido.golesVisitante);
        }
    }

    public Partido clone(){
        return new Partido(this);
    }

    public Equipo local(){
        return local;
    }

    public Equipo visitante(){
        return visitante;
    }

    public Fecha fecha(){
        return fecha.clone();
    }

    public int golesLocal(){
        return golesLocal;
    }

    public int golesVisitante(){
        return golesVisitante;
    }

    public boolean estaJugando(){
        return jugado;
    }

    public boolean estaPendiente(){
        return !jugado;
    }

    public boolean equals(Partido partido){
        assert partido != null;
        return this.local.tieneMismoNombre(partido.loocal.nombre()) &&
                this.visitante.tieneMismoNombre(partido.visitante.nombre()) &&
                this.fecha.equals(partido.fecha);
    }

    public void registrarResultado(int golesLocal, int golesVisitante){}

    public String toString(){}

    public void mostrar(){}
}