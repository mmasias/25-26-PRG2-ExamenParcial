class Actividades {

    private String actividad;
    private String monitor;
    private String horario;
    private int aforoMaximo;
    private Reserva[] reservas;
    private int numReservas;

    public Actividades(String actividad, String monitor, String horario, int aforoMaximo) {
        this.actividad = actividad;
        this.monitor = monitor;
        this.horario = horario;
        this.aforoMaximo = aforoMaximo;
        this.reservas = new Reserva[aforoMaximo];
        this.numReservas = 0;
    }

    public boolean hayPlazas() {
        return numReservas < aforoMaximo;
    }

    public void agregarReserva(Reserva reserva) {
        if (hayPlazas()) {
            reservas[numReservas] = reserva;
            numReservas++;
        }
    }

    public int getOcupacion() {
        return numReservas;
    }

    public String getNombre() {
        return actividad;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getHorario() {
        return horario;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

}
