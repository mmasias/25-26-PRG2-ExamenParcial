public class Aparcamiento {
    
    private final String nombre;
    private final Plaza[] plazas;
    private Ticket[] ticketsActivos;
    private int numTickets;
    
    public Aparcamiento(String nombre, int plazasNormales, int plazasElectricas, int plazasMoto) {
        this.nombre = nombre;
        
        int total = plazasNormales + plazasElectricas + plazasMoto;
        this.plazas = new Plaza[total];
        this.ticketsActivos = new Ticket[total];
        this.numTickets = 0;
        
        int idx = 0;
        for (int i = 0; i < plazasNormales; i++) this.plazas[idx++] = new Plaza("normal");
        for (int i = 0; i < plazasElectricas; i++) this.plazas[idx++] = new Plaza("electrico");
        for (int i = 0; i < plazasMoto; i++) this.plazas[idx++] = new Plaza("moto");
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public Ticket registrarEntrada(Vehiculo vehiculo, int horaEntrada) {
        Plaza libre = null;
        for (int i = 0; i < this.plazas.length; i++) {
            if (this.plazas[i].getTipo().equals(vehiculo.getTipo()) && !this.plazas[i].estaOcupada()) {
                libre = this.plazas[i];
                break;
            }
        }
        
        if (libre == null) return null;
        
        libre.ocupar();
        Ticket ticket = new Ticket(vehiculo, libre, horaEntrada);
        this.ticketsActivos[this.numTickets++] = ticket;
        return ticket;
    }
    
    public double registrarSalida(String matricula, int horaSalida) {
        for (int i = 0; i < this.numTickets; i++) {
            if (this.ticketsActivos[i].getVehiculo().getMatricula().equals(matricula)) {
                Ticket ticket = this.ticketsActivos[i];
                double tarifa = ticket.calcularTarifa(horaSalida);
                ticket.getPlaza().liberar();
                
                for (int j = i; j < this.numTickets - 1; j++) {
                    this.ticketsActivos[j] = this.ticketsActivos[j + 1];
                }
                this.ticketsActivos[--this.numTickets] = null;
                return tarifa;
            }
        }
        return -1;
    }
    
    public int consultarDisponibilidad(String tipo) {
        int libres = 0;
        for (int i = 0; i < this.plazas.length; i++) {
            if (this.plazas[i].getTipo().equals(tipo) && !this.plazas[i].estaOcupada()) {
                libres++;
            }
        }
        return libres;
    }
    
    public Ticket[] getTicketsActivos() {
        Ticket[] resultado = new Ticket[this.numTickets];
        for (int i = 0; i < this.numTickets; i++) {
            resultado[i] = this.ticketsActivos[i];
        }
        return resultado;
    }
}