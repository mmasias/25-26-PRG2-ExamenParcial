package vistas.liga;

class Partido {

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