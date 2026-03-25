package vistas.liga;

class Equipo {

    private String nombre;
    private String color;
    private int numeroJugadores;
    private int puntos;

    public Equipo(String nombre, String color, int numeroJugadores){
        assert nombre != null;
        assert color != null;
        assert numeroJugadores > 0;

        this.nombre = nombre;
        this.color = color;
        this.numeroJugadores = numeroJugadores;
        this.puntos = 0;
    }

    public Equipo(String nombre, String color){

    }

    public Equipo()

    public Equipo(Equipo equipo)

    public Equipo clone()

    public String nombre()

    public String color()

    public int numeroJugadores()

    public int puntos()

    public boolean equals(Equipo equipo)

    public boolean tieneMismoNombre(String nombre)

    public void sumarPuntos(int puntos)

    public void reiniciarPuntos()

    public String toString()

    public void mostrar()

}