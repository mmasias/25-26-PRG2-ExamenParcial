class Reserva {

    private Socios socio;
    private Actividades actividad;
    private String fecha;
    private boolean cancelado;

    public Reserva(Socios socio, Actividades actividad, String fecha) {
        this.socio = socio;
        this.actividad = actividad;
        this.fecha = fecha;
        this.cancelado = false;
    }

    public void cancelarReserva() {
        cancelado = true;
    }

    public boolean estaCancelada() {
        return cancelado;
    }

    public Socios getSocio() {
        return socio;
    }

    public Actividades getActividad() {
        return actividad;
    }

    public String getFecha() {
        return fecha;
    }

}
