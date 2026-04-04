class Gimnasio {
    private String nombre;
    private Socios[] socio;
    private Actividades[] actividad;
    private Reserva[] reserva;
    private int numSocios;
    private int numActividades;
    private int numReservas;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        socio = new Socios[50];
        actividad = new Actividades[10];
        reserva = new Reserva[100];
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirSocio(Socios otroSocio) {
        socio[numSocios++] = otroSocio;
    }

    public void agregarActividad(Actividades otraActividad) {
        actividad[numActividades++] = otraActividad;
    }

    public void hacerReserva(Socios otroSocio, Actividades otraActividad, String fecha) {
        if (otroSocio.estaActivo() && otraActividad.hayPlazas()) {
            Reserva otraReserva = new Reserva(otroSocio, otraActividad, fecha);
            reserva[numReservas++] = otraReserva;
            otraActividad.agregarReserva(otraReserva);

        }

    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelarReserva();

    }
}