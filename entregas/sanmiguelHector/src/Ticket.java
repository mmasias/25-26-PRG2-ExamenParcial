class Ticket {

    private int horaLLegada;
    private int horaSalida;
    private Plaza plazaAsociada;
    private Vehiculo vehiculoAsociado;

    public Ticket(int horaLLegada, int horaSalida, Plaza plaza, Vehiculo vehiculo) {
        assert horaSalida > horaLLegada : "Las horas introducidas no son válidas";
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.plazaAsociada = plaza;
        this.vehiculoAsociado = vehiculo;
    }

    public int horasAparcado() {
        return this.horaSalida - this.horaLLegada;
    }

    public int precioTotalEstancia() {
        return (this.horasAparcado() * this.plazaAsociada.precioPlaza());
    }

    public void mostrarTicket() {
        System.out.println("[TICKET DE APARCAMIENTO]");
        this.vehiculoAsociado.mostrarDatos();
        System.out.println("Hora de llegada: " + this.horaLLegada);
        System.out.println("Hora de salida: " + this.horaSalida);
        System.out.println("Tiempo total: " + this.horasAparcado());
        System.out.println("Precio total a pagar:  " + this.precioTotalEstancia() + "€");
    }
}