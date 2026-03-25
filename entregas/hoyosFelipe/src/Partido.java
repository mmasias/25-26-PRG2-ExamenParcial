package vistas.liga;

class Partido {

    private Equipo local;
    private Equipo visitante;
    private Fecha fecha;
    private int golesLocal;
    private int golesVisitante;
    private boolean jugado;   

    public Partido(Equipo local, Equipo visitante, Fecha fecha){}

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