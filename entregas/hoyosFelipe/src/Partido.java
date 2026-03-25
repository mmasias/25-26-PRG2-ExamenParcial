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
        this(nombre, color, 0 + 1);
    }

    public Equipo(){
        this("", "", 1);
    }

    public Equipo(Equipo equipo){
        this(equipo.nombre, equipo.color, equipo.numeroJugadores);
        this.puntos = equipo.puntos;
    }

    public Equipo clone(){
        return new Equipo(this);
    }

    public String nombre(){
        return nombre;
    }

    public String color(){
        return color;
    }

    public int numeroJugadores(){
        return numeroJugadores;
    }

    public int puntos(){
        return puntos;
    }

    public boolean equals(Equipo equipo){
        assert equipo != null;
        return this.nombre.equals(equipo.nombre) &&
               this.color.equals(equipo.color) &&
               this.numeroJugadores == equipo.numeroJugadores &&
               this.puntos == equipo.puntos;
    }

    public boolean tieneMismoNombre(String nombre){
        assert nombre != null;
        return this.nombre.equals(nombre);
    }

    public void sumarPuntos(int puntos){
        assert puntos >= 0;
        this.puntos += puntos;
    }

    public void reiniciarPuntos()

    public String toString()

    public void mostrar()

}