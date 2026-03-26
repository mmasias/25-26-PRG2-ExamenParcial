class Ticket {
    
    private int horaLLegada;
    private int horaSalida;
    private Plaza plazaAsociada;
    private Vehiculo vehiculoAsociado;

    public Ticket(int horaLLegada, int horaSalida, Plaza plaza, Vehiculo vehiculo){
        this.horaLLegada = horaLLegada;
        this.horaSalida = horaSalida;
        this.plazaAsociada = plaza;
        this.vehiculoAsociado = vehiculo;
    }


    public int precioTotalEstancia(){}

    public int horasAparcado(){}

    public void mostrarTicket(){}

}
